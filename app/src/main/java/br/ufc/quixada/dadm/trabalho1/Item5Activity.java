package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.dadm.trabalho1.dao.ContactDAO;
import br.ufc.quixada.dadm.trabalho1.entity.Contact;

public class Item5Activity extends AppCompatActivity {

    private List<String> names;
    private Integer selected;

    private Spinner spnrNames;
    private ArrayAdapter spnrNamesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item5);

        initValues();
        initComponents();

    }

    private void initValues() {
        selected = -1;
        names = new ArrayList<>();
        for (Contact c : ContactDAO.getInstance().getAll()) {
            names.add(c.getName());
        }
    }

    private void initComponents() {
        spnrNames = findViewById(R.id.spnr_names);
        spnrNamesAdapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, names);
        spnrNames.setAdapter(spnrNamesAdapter);
        spnrNames.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selected = -1;
            }
        });
    }

}
