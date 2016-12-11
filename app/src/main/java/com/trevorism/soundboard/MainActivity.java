package com.trevorism.soundboard;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void playSong(int songResource) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, songResource);
        mediaPlayer.start();
    }

    public void chairs(View view) {
        playSong(R.raw.chairs);
    }

    public void shame(View view) {
        playSong(R.raw.shame);
    }

    public void doItLive(View view) {
        playSong(R.raw.do_it_live);
    }

    public void thingSucks(View view) {
        playSong(R.raw.thing_sucks);
    }

    public void theyWillDo(View view) {
        playSong(R.raw.they_will_do);
    }

    public void chopper(View view) {
        playSong(R.raw.chopper);
    }

    public void emotion(View view) {
        playSong(R.raw.emotion);

    }

    public void pushy(View view) {
        playSong(R.raw.pushy);

    }

    public void understand(View view) {
        playSong(R.raw.understand);
    }

    public void julep(View view) {
        playSong(R.raw.julep);
    }

    public void moron(View view) {
        playSong(R.raw.moron);
    }

    public void mobile(View view) {
        playSong(R.raw.mobile);
    }

    public void iceCube(View view) {
        playSong(R.raw.ice_cube);
    }

    public void heyya(View view) {
        playSong(R.raw.heyya);
    }

    public void gangster(View view) {
        playSong(R.raw.gangster);
    }

    public void froggy(View view) {
        playSong(R.raw.froggy);
    }

    public void baam(View view) {
        playSong(R.raw.baam);
    }
}
