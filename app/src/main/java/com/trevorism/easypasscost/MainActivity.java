package com.trevorism.easypasscost;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void shame(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.shame);
        mediaPlayer.start();
    }

    public void doItLive(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.do_it_live);
        mediaPlayer.start();
    }

    public void thingSucks(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.thing_sucks);
        mediaPlayer.start();
    }

    public void theyWillDo(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.they_will_do);
        mediaPlayer.start();
    }

    public void chopper(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.chopper);
        mediaPlayer.start();

    }

    public void emotion(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.emotion );
        mediaPlayer.start();

    }
    public void pushy(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.pushy);
        mediaPlayer.start();

    }
    public void understand(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.understand);
        mediaPlayer.start();

    }
}
