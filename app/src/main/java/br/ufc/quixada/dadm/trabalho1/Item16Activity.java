package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class Item16Activity extends AppCompatActivity {

    private String[] numbers;

    private GridView grdExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item16);

        initValues();
        initComponents();

    }

    private void initValues() {
        numbers = new String[] {
                "A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y",
                "Z"
        };
    }

    private void initComponents() {
        grdExample = findViewById(R.id.grd_example);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, numbers);
        grdExample.setAdapter(adapter);
        grdExample.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), numbers[position],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
