package ryhma2.vauvasenranta.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ryhma2.vauvasenranta.R;

public class MainActivity extends AppCompatActivity {
    private static int waitingTime = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                startActivity(intent);
                finish();
            }
        },waitingTime);
    }

}
