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
import android.widget.Toast;

import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.adapter.Adapter_vaippa;
import ryhma2.vauvasenranta.base.TimerActivity;
import ryhma2.vauvasenranta.interface1.OnitemDeleteItem;
import ryhma2.vauvasenranta.model.MaitoPumppu;
import ryhma2.vauvasenranta.model.Vaippa;
import ryhma2.vauvasenranta.sqlite.MaitoDAO;
import ryhma2.vauvasenranta.sqlite.VaippaDAO;

import java.util.List;

public class VaippaActivity extends AppCompatActivity {
    RecyclerView recyclerView_vaippa;
    FloatingActionButton fab_vaippa;
    private VaippaDAO vaippaTietokanta;
    private List<Vaippa> vaipat;
    private Adapter_vaippa adapter_vaippa;
    private Vaippa vaippa;

    private TimerActivity aika;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaipanvaihto);
        recyclerView_vaippa = findViewById(R.id.recyclerview_vaippa);
        fab_vaippa = findViewById(R.id.fab_vaippa);
        vaippaTietokanta = new VaippaDAO(VaippaActivity.this);
        recyclerView_vaippa.setLayoutManager(new LinearLayoutManager(VaippaActivity.this));

        aika = new TimerActivity();

        vaipat = vaippaTietokanta.getAlldata();
        adapter_vaippa = new Adapter_vaippa(vaipat, VaippaActivity.this, new OnitemDeleteItem() {
            @Override
            public void onItemdelete(int position) {
                removeItem(position);
            }
        });
        recyclerView_vaippa.setAdapter(adapter_vaippa);

        fab_vaippa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(VaippaActivity.this);
                View v5 = getLayoutInflater().inflate(R.layout.dialog_vaipanvaihto,null);
                final EditText edvaippalaji = (EditText) v5.findViewById(R.id.ed_vaippalaji);
                final EditText  ednote = (EditText) v5.findViewById(R.id.ed_notevaippa);
                Button btnpoistu = (Button) v5.findViewById(R.id.btn_poistuVaippa);
                Button  btnLisaaVaippa = (Button) v5.findViewById(R.id.btn_lisaaVaippa);
                builder.setView(v5);
                final Dialog dialog = builder.create();
                dialog.show();


                btnpoistu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                btnLisaaVaippa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String laji = edvaippalaji.getText().toString();

                        String note = ednote.getText().toString();
                        String aiko = aika.getCurrentTime();


                        if (laji.isEmpty()){
                            Toast.makeText(VaippaActivity.this, "Täyttä puutuvat tiedot", Toast.LENGTH_SHORT).show();
                        }else {
                            vaippaTietokanta.insert(new Vaippa(laji,note,aiko));
                            Toast.makeText(VaippaActivity.this, "Lisätty onnistui", Toast.LENGTH_SHORT).show();
                            updatedata();
                            dialog.dismiss();
                        }
                    }
                });
            }
        });

    }
    public void removeItem(int position){
        vaippa = new Vaippa();
        vaippa = vaipat.get(position);
        vaipat.remove(position);
        vaippaTietokanta.delete(vaippa);
        updatedata();
    }

    public void updatedata(){
        vaipat.clear();
        vaipat.addAll(vaippaTietokanta.getAlldata());
        adapter_vaippa.notifyDataSetChanged();
    }
}
