package ryhma2.vauvasenranta.view;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.activity.MittausActivity;
import ryhma2.vauvasenranta.activity.MaitoActivity;
import ryhma2.vauvasenranta.activity.SleepActivity;
import ryhma2.vauvasenranta.activity.VaippaActivity;
import ryhma2.vauvasenranta.activity.InfoActivity;
import ryhma2.vauvasenranta.activity.RuokaActivity;

public class HomeActivity extends AppCompatActivity {
    private RelativeLayout red;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        red = findViewById(R.id.rela2);
        red.setNestedScrollingEnabled(false);
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
