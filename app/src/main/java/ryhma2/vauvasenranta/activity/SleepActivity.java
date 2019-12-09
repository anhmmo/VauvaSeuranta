package ryhma2.vauvasenranta.activity;


import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.base.MusicPlayer;


public class SleepActivity extends AppCompatActivity {

private TextView menu2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeping);


        menu2 = findViewById(R.id.buttonmusicmenu);


        //click event button
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SleepActivity.this);
                View v14 = getLayoutInflater().inflate(R.layout.menu2,null);
                Button version = v14.findViewById(R.id.btn_version);
                Button aboutus = v14.findViewById(R.id.btn_aboutus);


                builder.setView(v14);
                final Dialog dialog = builder.create();
                dialog.show();
                version.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SleepActivity.this, MusicInfo.class);
                        startActivity(intent);
                    }
                });

                aboutus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SleepActivity.this, MeistaTiedot.class);
                        startActivity(intent);
                    }
                });

            }
        });






        final Button one = (Button)this.findViewById(R.id.button0);
        final Button two = (Button)this.findViewById(R.id.button1);
        final Button three = (Button)this.findViewById(R.id.button2);
        final Button fouth = (Button)this.findViewById(R.id.button3);
        final Button five = (Button)this.findViewById(R.id.button4);
        final Button six = (Button)this.findViewById(R.id.button5);
        final Button seven = (Button)this.findViewById(R.id.button6);
        final Button eihth = (Button)this.findViewById(R.id.button7);
        final Button nine = (Button)this.findViewById(R.id.button8);
        final Button ten = (Button)this.findViewById(R.id.button9);
        final Button eleven = (Button)this.findViewById(R.id.button10);
        final Button twen = (Button)this.findViewById(R.id.button11);
        final Button thirteen = (Button)this.findViewById(R.id.button12);
        final Button fouthteen = (Button)this.findViewById(R.id.button13);
        final Button fifteen = (Button)this.findViewById(R.id.button14);
        final Button sixteen = (Button)this.findViewById(R.id.button15);
        final Button seventeen = (Button)this.findViewById(R.id.button16);
        final Button eitheen = (Button)this.findViewById(R.id.button17);
        final Button nineteen = (Button)this.findViewById(R.id.button18);
        final Button twenty = (Button)this.findViewById(R.id.button19);
        final Button twentyone = (Button)this.findViewById(R.id.button20);




        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.lullaby_1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.lullaby_2);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.lullaby_3);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.airplane);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.brown_noise);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.bus);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.car);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.cat_purring);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.fire);
        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.creek);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.forest);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.hair_dryer);
        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.heart_beat);
        final MediaPlayer mp14 = MediaPlayer.create(this, R.raw.night);
        final MediaPlayer mp15 = MediaPlayer.create(this, R.raw.wind);
        final MediaPlayer mp16 = MediaPlayer.create(this, R.raw.washing_machine);
        final MediaPlayer mp17 = MediaPlayer.create(this, R.raw.train);
        final MediaPlayer mp18 = MediaPlayer.create(this, R.raw.shower);
        final MediaPlayer mp19 = MediaPlayer.create(this, R.raw.rain);
        final MediaPlayer mp20 = MediaPlayer.create(this, R.raw.ocean);
        final MediaPlayer mp21 = MediaPlayer.create(this, R.raw.lullaby_4);



        final MusicPlayer music = new MusicPlayer();

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp1);
                if(mp1.isPlaying()){
                    one.setBackgroundResource(R.drawable.play_button);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);
                }
                else
                one.setBackgroundResource(R.drawable.ic_lullaby_1);




            }
        });


        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp1,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp2);
                if(mp2.isPlaying()){
                    two.setBackgroundResource(R.drawable.play_button);
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);
                }
                else
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
            }

        });

        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp1,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp3);
                if(mp3.isPlaying()){
                    three.setBackgroundResource(R.drawable.play_button);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
            }
        });

        fouth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp1,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp4);

                if(mp4.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.play_button);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    fouth.setBackgroundResource(R.drawable.ic_plane);

            }
        });

        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp1,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp5);
                if(mp5.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.play_button);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp1,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp6);
                if(mp6.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.play_button);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    six.setBackgroundResource(R.drawable.ic_bus);
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp1,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp7);
                if(mp7.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.play_button);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    seven.setBackgroundResource(R.drawable.ic_car);
            }
        });

        eihth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp1,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp8);
                if(mp8.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.play_button);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    eihth.setBackgroundResource(R.drawable.ic_cat);
            }
        });

        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp1,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp9);
                if(mp9.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.play_button);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    nine.setBackgroundResource(R.drawable.ic_fire);
            }
        });

        ten.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp1,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp10);
                if(mp10.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.play_button);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    ten.setBackgroundResource(R.drawable.ic_creek);
            }
        });

        eleven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp1,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp11);
                if(mp11.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.play_button);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    eleven.setBackgroundResource(R.drawable.ic_forest);
            }
        });

        twen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp1,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp12);
                if(mp12.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.play_button);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp1,mp14,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp13);
                if(mp13.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.play_button);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
            }
        });

        fouthteen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp1,mp15,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp14);
                if(mp14.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.play_button);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp1,mp16,mp17,mp18,mp19,mp20);
                music.playMusic(mp15);
                if(mp15.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.play_button);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
            }
        });

        sixteen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp1,mp17,mp18,mp19,mp20);
                music.playMusic(mp16);
                if(mp16.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.play_button);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
            }
        });

        seventeen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp1,mp18,mp19,mp20);
                music.playMusic(mp17);
                if(mp17.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.play_button);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    seventeen.setBackgroundResource(R.drawable.ic_train);
            }
        });

        eitheen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp1,mp19,mp20);
                music.playMusic(mp18);
                if(mp18.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.play_button);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
            }
        });

        nineteen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp1,mp20);
                music.playMusic(mp19);
                if(mp19.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.play_button);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
            }
        });

        twenty.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                music.stopPlayingMusic(mp21,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp1);
                music.playMusic(mp20);
                if(mp20.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.play_button);
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);

                }
                else
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
            }
        });

        twentyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.stopPlayingMusic(mp20,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp1);
                music.playMusic(mp21);
                if(mp21.isPlaying()){
                    one.setBackgroundResource(R.drawable.ic_lullaby_1);
                    two.setBackgroundResource(R.drawable.ic_lullaby_2);
                    three.setBackgroundResource(R.drawable.ic_lullaby_3);
                    fouth.setBackgroundResource(R.drawable.ic_plane);
                    five.setBackgroundResource(R.drawable.ic_brown_noise);
                    six.setBackgroundResource(R.drawable.ic_bus);
                    seven.setBackgroundResource(R.drawable.ic_car);
                    eihth.setBackgroundResource(R.drawable.ic_cat);
                    nine.setBackgroundResource(R.drawable.ic_fire);
                    ten.setBackgroundResource(R.drawable.ic_creek);
                    eleven.setBackgroundResource(R.drawable.ic_forest);
                    twen.setBackgroundResource(R.drawable.ic_hair_dryer);
                    thirteen.setBackgroundResource(R.drawable.ic_heart);
                    fouthteen.setBackgroundResource(R.drawable.ic_night);
                    fifteen.setBackgroundResource(R.drawable.ic_wind);
                    sixteen.setBackgroundResource(R.drawable.ic_washing_machine);
                    seventeen.setBackgroundResource(R.drawable.ic_train);
                    eitheen.setBackgroundResource(R.drawable.ic_shower);
                    nineteen.setBackgroundResource(R.drawable.ic_rain);
                    twenty.setBackgroundResource(R.drawable.ic_ocean);
                    twentyone.setBackgroundResource(R.drawable.play_button);

                }
                else
                    twentyone.setBackgroundResource(R.drawable.ic_lullaby_4);
            }
        });


    }


}
