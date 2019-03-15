package br.ufc.quixada.dadm.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.ufc.quixada.dadm.trabalho1.constants.ResultCode;

public class AddNameActivity extends AppCompatActivity {

    private EditText edtName;
    private Button btnAdd;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_name);

        initComponents();
    }

    private void initComponents() {
        edtName = findViewById(R.id.edt_name);

        if (getIntent().getExtras() != null) {
            edtName.setText(getIntent().getExtras().get("name").toString());
        }

        btnAdd = findViewById(R.id.btn_add);
        btnCancel = findViewById(R.id.btn_cancel);
    }

    public void btnAddClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", edtName.getText().toString());
        setResult(ResultCode.ADD, intent);
        finish();
    }

    public void btnCancelClick(View view) {
        setResult(ResultCode.CANCEL);
        finish();
    }

}
