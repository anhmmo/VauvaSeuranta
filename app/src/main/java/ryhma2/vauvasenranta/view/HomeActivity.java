package ryhma2.vauvasenranta.view;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.activity.MittausActivity;
import ryhma2.vauvasenranta.activity.MaitoActivity;
import ryhma2.vauvasenranta.activity.SleepActivity;
import ryhma2.vauvasenranta.activity.VaippaActivity;
import ryhma2.vauvasenranta.activity.InfoActivity;
import ryhma2.vauvasenranta.activity.RuokaActivity;
import ryhma2.vauvasenranta.activity.MeistaTiedot;

public class HomeActivity extends AppCompatActivity {

    private TextView menu;
    private RelativeLayout red;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        red = findViewById(R.id.rela2);
        red.setNestedScrollingEnabled(false);
         menu = findViewById(R.id.btnMenu);


        //click event button
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                View v12 = getLayoutInflater().inflate(R.layout.menu,null);
                Button vauvantiedot = v12.findViewById(R.id.btn_vauvan_tiedot);
                Button meista = v12.findViewById(R.id.btn_meista);

                builder.setView(v12);
                final Dialog dialog = builder.create();
                dialog.show();
                vauvantiedot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, MeistaTiedot.class);
                        startActivity(intent);
                    }
                });

                meista.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, MeistaTiedot.class);
                        startActivity(intent);
                    }
                });
            }
        });




    }

    public void avatar_ruoka(View view) {
        Intent intent = new Intent(HomeActivity.this, RuokaActivity.class);
        startActivity(intent);
    }

    public void avatar_maitopumppu(View view) {
        Intent intent = new Intent(HomeActivity.this, MaitoActivity.class);
        startActivity(intent);
    }

    public void avatar_vaippa(View view) {
        Intent intent = new Intent(HomeActivity.this, VaippaActivity.class);
        startActivity(intent);
    }

    public void avatar_mittaus(View view) {
        Intent intent = new Intent(HomeActivity.this, MittausActivity.class);
        startActivity(intent);
    }

    public void avatar_vinkki(View view) {
        Toast.makeText(this, "Yhdistetään sivustoon !!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(HomeActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    public void avatar_user(View view) {
        Intent intent = new Intent(HomeActivity.this, SleepActivity.class);
        startActivity(intent);
    }

}
