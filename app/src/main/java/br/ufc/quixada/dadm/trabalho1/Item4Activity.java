package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.dadm.trabalho1.dao.ContactDAO;
import br.ufc.quixada.dadm.trabalho1.entity.Contact;

public class Item4Activity extends AppCompatActivity {

    private List<String> names;

    private AutoCompleteTextView actxtNames;
    private ArrayAdapter actxNamesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        initValues();
        initComponents();

    }

    private void initValues() {
        names = new ArrayList<>();
        for (Contact c : ContactDAO.getInstance().getAll()) {
            names.add(c.getName());
        }
    }

    private void initComponents() {
        actxtNames = findViewById(R.id.actxt_names);
        actxNamesAdapter = new ArrayAdapter(this,
                android.R.layout.simple_dropdown_item_1line, names);
        actxtNames.setThreshold(1);
        actxtNames.setAdapter(actxNamesAdapter);
    }

}
