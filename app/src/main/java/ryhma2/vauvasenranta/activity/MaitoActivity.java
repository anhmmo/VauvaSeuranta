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
import ryhma2.vauvasenranta.interface1.OnitemDeleteItem;
import ryhma2.vauvasenranta.model.MaitoPumppu;
import ryhma2.vauvasenranta.sqlite.MaitoDAO;

import java.util.List;

public class MaitoActivity extends AppCompatActivity {
    RecyclerView recyclerview_maito;
    FloatingActionButton fab_maito;
    private List<MaitoPumppu> maito;
    private MaitoPumppu maitoLista;
    private Adapter_maito adapter_maito;
    private MaitoDAO maito_databases;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maito_pumppu);
        maito_databases = new MaitoDAO(MaitoActivity.this);
        recyclerview_maito = findViewById(R.id.recyclerview_maito);
        fab_maito = findViewById(R.id.fab_maito);
        recyclerview_maito.setLayoutManager(new LinearLayoutManager(MaitoActivity.this));


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
                final EditText ed_nimi = v2.findViewById(R.id.ed_sohieudan);
                final EditText ed_maara = v2.findViewById(R.id.ed_soluongdan);
                final EditText ed_textit = v2.findViewById(R.id.ed_tinhtrang);
                Button btn_them = v2.findViewById(R.id.btn_lisaa);
                Button huy = v2.findViewById(R.id.btn_poistu);
                builder.setView(v2);
                final Dialog dialog = builder.create();
                dialog.show();
                huy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                btn_them.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String nimet = ed_nimi.getText().toString();
                        String texti = ed_textit.getText().toString();
                        int maarat = ParseDouble(ed_maara.getText().toString());
                         if(nimet.equals("")|| texti.equals("")){
                             Toast.makeText(MaitoActivity.this, "Täyttä puutuvat tiedot", Toast.LENGTH_SHORT).show();
                         }else {
                             maito_databases.insert(new MaitoPumppu(nimet,maarat,texti));
                             Toast.makeText(MaitoActivity.this, "Lisätty onnistui", Toast.LENGTH_SHORT).show();
                                updatedata();
                                dialog.dismiss();
                         }
                    }
                });
            }
        });
    }
    public void updatedata(){
        maito.clear();
        maito.addAll(maito_databases.getAlldata());
        adapter_maito.notifyDataSetChanged();
    }

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
    public void poistaItem(int position){
        maitoLista = new MaitoPumppu();
        maitoLista = maito.get(position);
        maito.remove(position);
        maito_databases.delete(maitoLista);
        updatedata();
    }

}
