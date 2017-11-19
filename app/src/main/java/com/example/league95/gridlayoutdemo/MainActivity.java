package com.example.league95.gridlayoutdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    //int tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mediaPlayer = MediaPlayer.create(this)
        //GridLayout grid = (GridLayout) findViewById(R.id.grid);
        //tag = Integer.parseInt(grid.getChildAt(0).getTag().toString());

    }

    public void play(View v)
    {
        int tag = Integer.parseInt(v.getTag().toString());
        //Depending on which tag
        if (tag == 1)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        } else if (tag == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
        } else if (tag == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.hello);
        } else if (tag == 4)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
        } else if (tag == 5)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
        } else if (tag == 6)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
        } else if (tag == 7)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.please);
        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
        }
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }

    }
}
