package br.ufc.quixada.dadm.trabalho1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Item17Activity extends AppCompatActivity {

    private MediaPlayer player;
    private ToggleButton tglPlayPauseSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item17);

        initComponents();

    }

    private void initComponents() {
        player = MediaPlayer.create(getApplicationContext(), R.raw.s01);
        tglPlayPauseSong = findViewById(R.id.tgl_play_pause_song);
    }

    public void tglPlayPauseSongClick(View view) {
        if (tglPlayPauseSong.isChecked()) {
            player.start();
        } else {
            player.pause();
        }
    }

}
