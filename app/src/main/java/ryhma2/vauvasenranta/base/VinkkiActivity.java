package ryhma2.vauvasenranta.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ryhma2.vauvasenranta.R;

public class VinkkiActivity extends AppCompatActivity {
    TextView vinkkiNimi,vinkkiTiedot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinkkeja);
        vinkkiTiedot = findViewById(R.id.vinkki_tiedot);
        vinkkiNimi = findViewById(R.id.vinkki_nimi);
//get data from adapter
        vinkkiNimi.setText(getIntent().getStringExtra("vinkkiNimi"));
        vinkkiTiedot.setText(getIntent().getStringExtra("vinkkiTiedot"));
    }
}
