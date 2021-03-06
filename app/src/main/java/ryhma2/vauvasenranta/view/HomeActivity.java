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
import ryhma2.vauvasenranta.activity.MeistaTiedot;
import ryhma2.vauvasenranta.activity.MittausActivity;
import ryhma2.vauvasenranta.activity.MaitoActivity;
import ryhma2.vauvasenranta.activity.SleepActivity;
import ryhma2.vauvasenranta.activity.VaippaActivity;
import ryhma2.vauvasenranta.activity.InfoActivity;
import ryhma2.vauvasenranta.activity.RuokaActivity;

/**
 * Show homepage of application
 */
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
                Button music = v12.findViewById(R.id.btn_music);
                Button meista = v12.findViewById(R.id.btn_meista);
                Button syominen = v12.findViewById(R.id.btn_ruokabutton);
                Button maitopump = v12.findViewById(R.id.btn_maitopump);
                Button vaipaa = v12.findViewById(R.id.btn_vaipaat);
                Button painoe = v12.findViewById(R.id.btn_painopituus);

                builder.setView(v12);
                final Dialog dialog = builder.create();
                dialog.show();
                music.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, SleepActivity.class);
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

                syominen.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, RuokaActivity.class);
                        startActivity(intent);
                    }
                });

                maitopump.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, MaitoActivity.class);
                        startActivity(intent);
                    }
                });

                vaipaa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, VaippaActivity.class);
                        startActivity(intent);
                    }
                });

                painoe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, MittausActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });




    }

    /**
     * Open RuokaActivity when user click on the avatar_ruoka
     * @param view using Intent to open second view
     */

    public void avatar_ruoka(View view) {
        Intent intent = new Intent(HomeActivity.this, RuokaActivity.class);
        startActivity(intent);
    }

    /**
     * Open MaitoActivity when user click on the avatar_maitopumppu
     * @param view using Intent to open second view
     */
    public void avatar_maitopumppu(View view) {
        Intent intent = new Intent(HomeActivity.this, MaitoActivity.class);
        startActivity(intent);
    }

    /**
     * Open VaippaActivity when user click on the avatar_vaippa
     * @param view using Intent to open second view
     */
    public void avatar_vaippa(View view) {
        Intent intent = new Intent(HomeActivity.this, VaippaActivity.class);
        startActivity(intent);
    }

    /**
     * Open MittausActivity when user click on the avatar_mittaus
     * @param view using Intent to open second view
     */
    public void avatar_mittaus(View view) {
        Intent intent = new Intent(HomeActivity.this, MittausActivity.class);
        startActivity(intent);
    }

    /**
     * Open InfoActivity when user click on the avatar_vinkki
     * @param view using Intent to open second view
     */
    public void avatar_vinkki(View view) {
        Toast.makeText(this, "Yhdistetään sivustoon !!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(HomeActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    /**
     * Open SleepActivity when user click on the avatar_user
     * @param view using Intent to open second view
     */
    public void avatar_user(View view) {
        Intent intent = new Intent(HomeActivity.this, SleepActivity.class);
        startActivity(intent);
    }

}
