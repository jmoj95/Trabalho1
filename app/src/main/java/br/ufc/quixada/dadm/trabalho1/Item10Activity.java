package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Item10Activity extends AppCompatActivity {

    private TextView txtLongPressTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item10);

        initComponents();

    }

    private void initComponents() {
        txtLongPressTarget = findViewById(R.id.txt_long_press_target);
        txtLongPressTarget.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(Item10Activity.this,
                        "You have long pressed me. Congratulations!",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

}
