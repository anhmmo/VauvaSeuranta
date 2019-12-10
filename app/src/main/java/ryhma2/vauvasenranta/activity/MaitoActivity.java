package ryhma2.vauvasenranta.activity;

import android.app.Dialog;
import android.content.Intent;
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
import ryhma2.vauvasenranta.adapter.Adapter_maito;
import ryhma2.vauvasenranta.base.TimerActivity;
import ryhma2.vauvasenranta.interface1.OnitemDeleteItem;
import ryhma2.vauvasenranta.model.MaitoPumppu;
import ryhma2.vauvasenranta.sqlite.MaitoDAO;

import java.util.List;

/**
 * <h1>Maito class!</h1>
 * This class used to get user input information from dialog (use AlertDialog class) then save to MaitoDao (Sqlite databases).
 * Communicate with Adater_maito to get data and show the output on the screen.
 * Instance variable <b>recyclerview_maito</b> create RycyclerView to show the output get from user. The RecyclerView widget is a more advanced and flexible version of ListView.
 * Instance variable <b>maito_databases</b> create new instance of RuokaDao.
 * Instance variable <b>maito</b> create new a list for Maito class (use List<>) to store data get from current databases.
 * Instance variable <b>adapter_maito</b> create new Adapter_maito class instance.
 * Instance variable <b>maitoLista</b> create new Maito class instance.
 * Instance variable <b>aika</b> create new TimerActivity class instance.


 * @author  Ann-Mari Räsänen
 * @version 1.0
 * @since   10.12.2019
 */

public class MaitoActivity extends AppCompatActivity {
    RecyclerView recyclerview_maito;
    FloatingActionButton fab_maito;
    private List<MaitoPumppu> maito;
    private MaitoPumppu maitoLista;
    private Adapter_maito adapter_maito;
    private MaitoDAO maito_databases;
    private TimerActivity aika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maito_pumppu);
        maito_databases = new MaitoDAO(MaitoActivity.this);
        recyclerview_maito = findViewById(R.id.recyclerview_maito);
        fab_maito = findViewById(R.id.fab_maito);
        aika = new TimerActivity();
        recyclerview_maito.setLayoutManager(new LinearLayoutManager(MaitoActivity.this));

        Toast.makeText(MaitoActivity.this, "Lisää maitopumppu historia", Toast.LENGTH_SHORT).show();
        //add to ryc
        maito = maito_databases.getAlldata();
        adapter_maito = new Adapter_maito(maito, MaitoActivity.this, new OnitemDeleteItem() {
            @Override
            public void onItemdelete(int position) {
                poistaItem(position);
            }
        });
        recyclerview_maito.setAdapter(adapter_maito);

        //click event button
        fab_maito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MaitoActivity.this);
                View v2 = getLayoutInflater().inflate(R.layout.dialog_maito_pumppu,null);
                final EditText ed_maara = v2.findViewById(R.id.ed_maito_maara);
                final EditText ed_textit = v2.findViewById(R.id.ed_note_maito);
                Button btn_lisaa = v2.findViewById(R.id.btn_lisaa);
                Button poistuu = v2.findViewById(R.id.btn_poistu);
                builder.setView(v2);
                final Dialog dialog = builder.create();
                dialog.show();
                poistuu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                btn_lisaa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String aikoja = aika.getCurrentTime();
                        String texti = ed_textit.getText().toString();
                        int maarat = ParseDouble(ed_maara.getText().toString());
                         if(texti.equals("")){
                             Toast.makeText(MaitoActivity.this, "Täyttä puutuvat tiedot", Toast.LENGTH_SHORT).show();
                         }else {
                             maito_databases.insert(new MaitoPumppu(aikoja,maarat,texti));
                             Toast.makeText(MaitoActivity.this, "Lisätty onnistui", Toast.LENGTH_SHORT).show();
                                updatedata();
                                dialog.dismiss();
                         }
                    }
                });
            }
        });
    }

    /**
     * This method is used to update data to list
     */

    public void updatedata(){
        maito.clear();
        maito.addAll(maito_databases.getAlldata());
        adapter_maito.notifyDataSetChanged();
    }

    /**
     * This method is used to convert String to Double.
     * @param strNumber get String
     * @return 0
     */

    public int ParseDouble(String strNumber) {
        if (strNumber != null && strNumber.length() > 0) {
            try {
                return Integer.parseInt(strNumber);
            } catch (Exception e) {
                return -1;
            }
        } else {
            Toast.makeText(this, "Täyttä puutuvat tiedot", Toast.LENGTH_SHORT).show();
        }
        return 0;
    }

    /**
     * This method is used to delete item from the list.
     * @param position get position of the item from list
     */

    public void poistaItem(int position){
        maitoLista = new MaitoPumppu();
        maitoLista = maito.get(position);
        maito.remove(position);
        maito_databases.delete(maitoLista);
        updatedata();
    }

}
