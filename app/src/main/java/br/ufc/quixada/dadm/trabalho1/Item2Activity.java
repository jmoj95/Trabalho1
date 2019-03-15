package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Item2Activity extends AppCompatActivity {

    private EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);

        initComponents();

    }

    private void initComponents() {
        edt1 = findViewById(R.id.edt_1);
    }

    public void btnEdt1Click(View v) {
        String text = edt1.getText().toString();
        Toast.makeText(Item2Activity.this, text, Toast.LENGTH_SHORT).show();
    }

}
