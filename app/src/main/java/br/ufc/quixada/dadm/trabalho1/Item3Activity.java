package br.ufc.quixada.dadm.trabalho1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.dadm.trabalho1.constants.RequestCode;
import br.ufc.quixada.dadm.trabalho1.constants.ResultCode;
import br.ufc.quixada.dadm.trabalho1.dao.ContactDAO;
import br.ufc.quixada.dadm.trabalho1.entity.Contact;

public class Item3Activity extends AppCompatActivity {

    private List<String> names;
    private Integer selected;

    private ListView lstNames;
    private ArrayAdapter lstNamesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        initValues();
        initComponents();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RequestCode.ADD && resultCode == ResultCode.ADD) {
            String name = data.getExtras().get("name").toString();
            ContactDAO.getInstance().add(new Contact(name));
            names.add(name);
            lstNamesAdapter.notifyDataSetChanged();
        } else if (requestCode == RequestCode.EDIT && resultCode == ResultCode.ADD) {
            String name = data.getExtras().get("name").toString();
            ContactDAO.getInstance().get(selected).setName(name);
            names.set(selected, name);
            lstNamesAdapter.notifyDataSetChanged();
        } else if (resultCode == ResultCode.CANCEL) {
            // TODO: idk lol
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itm_add:
                callAddNameActivity();
                break;
            case R.id.itm_edit:
                callEditNameActivity();
                break;
            case R.id.itm_delete:
                deleteSelectedListViewItem();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initValues() {
        names = new ArrayList<>();
        for (Contact c : ContactDAO.getInstance().getAll()) {
            names.add(c.getName());
        }
        selected = -1;
    }

    private void initComponents() {
        lstNamesAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, names);
        lstNames = findViewById(R.id.lst_names);
        lstNames.setAdapter(lstNamesAdapter);
        lstNames.setSelector(android.R.color.holo_blue_light);
        lstNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selected = position;
            }
        });
    }

    private void callAddNameActivity() {
        Intent intent = new Intent(this, AddNameActivity.class);
        startActivityForResult(intent, RequestCode.ADD);
    }

    private void callEditNameActivity() {
        Intent intent = new Intent(this, AddNameActivity.class);
        intent.putExtra("name", ContactDAO.getInstance().get(selected).getName());
        startActivityForResult(intent, RequestCode.EDIT);
    }

    private void deleteSelectedListViewItem() {
        if (selected > -1) {
            names.clear();
            ContactDAO.getInstance().remove(selected);
            for (Contact c : ContactDAO.getInstance().getAll()) {
                names.add(c.getName());
            }
            lstNamesAdapter.notifyDataSetChanged();
        }
    }

}
