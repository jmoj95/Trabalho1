package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Item1Activity extends AppCompatActivity {

    private ToggleButton tgl1;
    private ToggleButton tgl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);

        initComponents();

    }

    private void initComponents() {
        tgl1 = findViewById(R.id.tgl_1);
        tgl2 = findViewById(R.id.tgl_2);
    }


    public void btnDisplayClick(View v) {
        String result = "toggleButton1: " + tgl1.getText().toString() + "\n"
                + "toggleButton2: " + tgl2.getText().toString();
        Toast.makeText(Item1Activity.this, result, Toast.LENGTH_SHORT).show();
    }

}
