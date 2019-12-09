package ryhma2.vauvasenranta.base;

import android.media.MediaPlayer;

public class MusicPlayer {
    private MediaPlayer music;
//David Neto https://stackoverflow.com/questions/18678873/android-button-click-to-play-music-click-again-to-stop-sound

    public MediaPlayer getMusic() {
        return music;
    }

    public void setMusic(MediaPlayer music) {
        this.music = music;
    }

    public void playMusic(MediaPlayer music) {
        if (music.isPlaying() == true)
        // Pause the music player
        {
            music.pause();
        }

        // If it's not playing
        else
        // Resume the music player
        {
            music.start();
            music.setLooping(true);

        }
    }

    public void stopPlayingMusic(MediaPlayer music1,MediaPlayer music20, MediaPlayer music2, MediaPlayer music3, MediaPlayer music4,MediaPlayer music5, MediaPlayer music6, MediaPlayer music7, MediaPlayer music8,MediaPlayer music9, MediaPlayer music10, MediaPlayer music11, MediaPlayer music12,MediaPlayer music13, MediaPlayer music14, MediaPlayer music15, MediaPlayer music16, MediaPlayer music17, MediaPlayer music18, MediaPlayer music19){
        if(music1.isPlaying())
        {music1.pause();}

        if(music2.isPlaying())
        {music2.pause();}

        if(music3.isPlaying())
        {music3.pause();}

        if(music4.isPlaying())
        {music4.pause();}


        if(music5.isPlaying())
        {music5.pause();}

        if(music6.isPlaying())
        {music6.pause();}

        if(music7.isPlaying())
        {music7.pause();}

        if(music8.isPlaying())
        {music8.pause();}

        if(music9.isPlaying())
        {music9.pause();}

        if(music10.isPlaying())
        {music10.pause();}

        if(music11.isPlaying())
        {music11.pause();}

        if(music12.isPlaying())
        {music12.pause();}


        if(music13.isPlaying())
        {music13.pause();}

        if(music14.isPlaying())
        {music14.pause();}

        if(music15.isPlaying())
        {music15.pause();}

        if(music16.isPlaying())
        {music16.pause();}

        if(music17.isPlaying())
        {music17.pause();}

        if(music18.isPlaying())
        {music18.pause();}

        if(music19.isPlaying())
        {music19.pause();}

        if(music20.isPlaying())
        {music20.pause();}

    }


}









