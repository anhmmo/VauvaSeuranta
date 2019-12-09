package ryhma2.vauvasenranta.activity;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.adapter.Adapter_ruoka;
import ryhma2.vauvasenranta.base.TimerActivity;
import ryhma2.vauvasenranta.interface1.OnitemDeleteItem;
import ryhma2.vauvasenranta.model.Ruoka;
import ryhma2.vauvasenranta.sqlite.RuokaDAO;

import java.util.List;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Au Nguyen
 * @version 1.0
 * @since   10.11.2019
 */

public class RuokaActivity extends AppCompatActivity {
    private RecyclerView ryc_ruoka;
    private RuokaDAO ruoka_databases;
    private List<Ruoka> ruokaListat;
    private Adapter_ruoka adapter_ruoka;
    private Ruoka ruoat;
    private TimerActivity aika;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruoka);
        ryc_ruoka = findViewById(R.id.recyclerview_ruoka);
        ryc_ruoka.setLayoutManager(new LinearLayoutManager(RuokaActivity.this));
        aika = new TimerActivity();
        ruoka_databases = new RuokaDAO(RuokaActivity.this);
        ruokaListat = ruoka_databases.getAlldata();
        adapter_ruoka = new Adapter_ruoka(ruokaListat, RuokaActivity.this, new OnitemDeleteItem() {
            @Override
            public void onItemdelete(int position) {
                removeitem(position);
            }
        });
        ryc_ruoka.setAdapter(adapter_ruoka);
    }
    public void removeitem(int position){
        ruoat = new Ruoka();
        ruoat = ruokaListat.get(position);
        ruokaListat.remove(position);
        ruoka_databases.delete(ruoat);
        updatedata();
    }

    //start add button function
    public void lisaaRuoka(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(RuokaActivity.this);
        View v = getLayoutInflater().inflate(R.layout.dialog_ruoka,null);
        final EditText ruokaLaji = v.findViewById(R.id.ed_laji);
        final EditText maitoMaara = v.findViewById(R.id.ed_maara);
        final EditText muistiPano = v.findViewById(R.id.ed_note);
        final RadioGroup ryhma = v.findViewById(R.id.boxMaitoLaji);
        Button btn_poistu = v.findViewById(R.id.btn_poistu);
        Button btn_lisaa = v.findViewById(R.id.btn_lisaamaito);
        builder.setView(v);
        final Dialog dialog = builder.create();
        dialog.show();


        btn_poistu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btn_lisaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String laji = "";

                if(ryhma.getCheckedRadioButtonId()==R.id.radioButton7){
                    laji = "Rintamaito";


                }
                else if(ryhma.getCheckedRadioButtonId()==R.id.radioButton8){
                    laji = "Pullomaito";


                }

                else{
                    laji = ruokaLaji.getText().toString();
                }




                int maara = ParseInt(maitoMaara.getText().toString());
                String noteet = muistiPano.getText().toString();
                String aiko = aika.getCurrentTime();
                if(ryhma.getCheckedRadioButtonId()!=R.id.radioButton7 && ryhma.getCheckedRadioButtonId()!=R.id.radioButton8 && (ruokaLaji.getText().toString().isEmpty()))
                {

                    Toast.makeText(RuokaActivity.this, "Täytä puuttuvat ruoat tiedot", Toast.LENGTH_SHORT).show();
                }

                else {

                    if (maitoMaara.getText().toString().isEmpty()) {
                        Toast.makeText(RuokaActivity.this, "Täytä ruoan määrä tiedot", Toast.LENGTH_SHORT).show();
                    } else {
                        ruoka_databases.insert(new Ruoka(laji, maara, noteet, aiko));
                        Toast.makeText(RuokaActivity.this, "Lisää onnistuneesti", Toast.LENGTH_SHORT).show();
                        updatedata();
                        dialog.dismiss();

                    }

                }
            }
        });
    }

    //add button function end

    public int ParseInt(String strNumber) {

        /**
         * This method is used to add two integers. This is
         * a the simplest form of a class method, just to
         * show the usage of various javadoc Tags.
         * @param strNumber This is the first paramter to addNum method
         * @return int This returns sum of numA and numB.
         */

        if (strNumber != null && strNumber.length() > 0) {
            try {
                return Integer.parseInt(strNumber);
            } catch (Exception e) {
                return -1;   // or some value to mark this field is wrong. or make a function validates field first ...
            }
        } else {
            Toast.makeText(this, "Täytä puuttuvat tiedot", Toast.LENGTH_SHORT).show();
        }
        return 0;
    }



    public void updatedata(){
        ruokaListat.clear();
        ruokaListat.addAll(ruoka_databases.getAlldata());
        adapter_ruoka.notifyDataSetChanged();
    }
}
