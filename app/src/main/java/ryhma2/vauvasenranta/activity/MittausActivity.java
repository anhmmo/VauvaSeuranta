package ryhma2.vauvasenranta.activity;

import android.app.Dialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.adapter.Adapter_mittaus;
import ryhma2.vauvasenranta.base.TimerActivity;
import ryhma2.vauvasenranta.interface1.OnitemDeleteItem;
import ryhma2.vauvasenranta.model.Mittaus;
import ryhma2.vauvasenranta.sqlite.MittausDAO;

import java.util.List;

public class MittausActivity extends AppCompatActivity {
    RecyclerView ryc_mittaus;
    FloatingActionButton fab_mittaus;
    private MittausDAO mittausTietokanta;
    private Mittaus mittaukset;
    private List<Mittaus> mittausLista;
    private Adapter_mittaus adapter_mittaus;
    private TimerActivity aika;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mittaus);
        ryc_mittaus = findViewById(R.id.recyclerview_baocao);
        fab_mittaus = findViewById(R.id.fab_mittausbtn);
        ryc_mittaus.setLayoutManager(new LinearLayoutManager(MittausActivity.this));
        aika = new TimerActivity();
        mittausTietokanta = new MittausDAO(MittausActivity.this);

        mittausLista = mittausTietokanta.getAlldata();
        adapter_mittaus = new Adapter_mittaus(mittausLista, MittausActivity.this, new OnitemDeleteItem() {
            @Override
            public void onItemdelete(int position) {
                removeitem(position);
            }
        });
        ryc_mittaus.setAdapter(adapter_mittaus);


        fab_mittaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MittausActivity.this);
                View v5 = getLayoutInflater().inflate(R.layout.dialog_mittaus,null);
                TextView textView12 = (TextView) v5.findViewById(R.id.textView12);
                final EditText edNote = (EditText) v5.findViewById(R.id.ed_note);
                final EditText edpituus = (EditText) v5.findViewById(R.id.ed_pituus);
                final EditText edpaino = (EditText) v5.findViewById(R.id.ed_paino);
                Button btnPoistu = (Button) v5.findViewById(R.id.btn_poistuMittaus);
                Button btnLisaa = (Button) v5.findViewById(R.id.btn_lisaaMittaus);
                builder.setView(v5);
                final Dialog dialog = builder.create();
                dialog.show();


                btnPoistu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                btnLisaa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String muistipano = edNote.getText().toString();
                        double pituus = ParseDouble(edpituus.getText().toString());
                        double paino = ParseDouble(edpaino.getText().toString());
                        String aiko = aika.getCurrentTime();
                        if (edpituus.getText().toString().isEmpty() || edpaino.getText().toString().isEmpty()){
                            Toast.makeText(MittausActivity.this, "Täytä puuttuvat tiedot", Toast.LENGTH_SHORT).show();
                        }else {
                            mittausTietokanta.insert(new Mittaus(muistipano,pituus,paino,aiko));
                            Toast.makeText(MittausActivity.this, "Lisää onnistuneesti", Toast.LENGTH_SHORT).show();
                            updatedata();
                            dialog.dismiss();
                        }
                    }
                });
            }
        });
    }
    public double ParseDouble(String strNumber) {
        if (strNumber != null && strNumber.length() > 0) {
            try {
                return Double.parseDouble(strNumber);
            } catch (Exception e) {
                return -1;
            }
        } else {
            Toast.makeText(this, "Täytä puuttuvat tiedot", Toast.LENGTH_SHORT).show();
        }
        return 0;
    }
    public void updatedata(){
        mittausLista.clear();
        mittausLista.addAll(mittausTietokanta.getAlldata());
        adapter_mittaus.notifyDataSetChanged();
    }
    public void removeitem(int position){
        mittaukset = new Mittaus();
        mittaukset = mittausLista.get(position);
        mittausLista.remove(position);
        mittausTietokanta.delete(mittaukset);
        updatedata();
    }
}
