package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Item6Activity extends AppCompatActivity {

    private RadioGroup radgSatisfaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item6);

        initComponents();

    }

    private void initComponents() {
        radgSatisfaction = findViewById(R.id.radg_satisfaction);
        radgSatisfaction.clearCheck();
        radgSatisfaction.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radb = group.findViewById(checkedId);
                if (radb != null && checkedId > -1) {
                    Toast.makeText(Item6Activity.this,
                            radb.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
