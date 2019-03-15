package br.ufc.quixada.dadm.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Item8Activity extends AppCompatActivity {

    private Button btnShowPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item8);

        initComponents();

    }

    private void initComponents() {
        btnShowPopupMenu = findViewById(R.id.btn_show_popup_menu);
    }

    public void btnShowPopupMenuClick(View v) {
        PopupMenu popup = new PopupMenu(Item8Activity.this, btnShowPopupMenu);
        popup.getMenuInflater().inflate(R.menu.menu_main_activity, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(Item8Activity.this, "You clicked " + item.getTitle(),
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        popup.show();
    }

}
