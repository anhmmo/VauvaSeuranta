package ryhma2.vauvasenranta.activity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import ryhma2.vauvasenranta.R;


public class SleepActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeping);
        Button two = (Button)this.findViewById(R.id.button3);




        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.lullaby_3);
        two.setOnClickListener(new View.OnClickListener(){
           //David Neto https://stackoverflow.com/questions/18678873/android-button-click-to-play-music-click-again-to-stop-sound
            public void onClick(View v) {

                // If the music is playing

            }
        });
    }

}
