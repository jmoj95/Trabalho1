package br.ufc.quixada.dadm.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Componente do item 1 */
    public void btnItem1Click(View view) {
        Intent intent = new Intent(this, Item1Activity.class);
        startActivity(intent);
    }

    /* Componente do item 2 */
    public void btnItem2Click(View view) {
        Intent intent = new Intent(this, Item2Activity.class);
        startActivity(intent);
    }

    /* Componente do item 3 */
    public void btnItem3Click(View view) {
        Intent intent = new Intent(this, Item3Activity.class);
        startActivity(intent);
    }

    /* Componente do item 4 */
    public void btnItem4Click(View view) {
        Intent intent = new Intent(this, Item4Activity.class);
        startActivity(intent);
    }

    /* Componente do item 5 */
    public void btnItem5Click(View view) {
        Intent intent = new Intent(this, Item5Activity.class);
        startActivity(intent);
    }

    /* Componente do item 6 */
    public void btnItem6Click(View view) {
        Intent intent = new Intent(this, Item6Activity.class);
        startActivity(intent);
    }

    /* Componente do item 8 */
    public void btnItem8Click(View view) {
        Intent intent = new Intent(this, Item8Activity.class);
        startActivity(intent);
    }

    /* Componente do item 10 */
    public void btnItem10Click(View view) {
        Intent intent = new Intent(this, Item10Activity.class);
        startActivity(intent);
    }

    /* Componente do item 13 */
    public void btnItem13Click(View view) {
        Intent intent = new Intent(this, Item13Activity.class);
        startActivity(intent);
    }

    /* Componente do item 16 */
    public void btnItem16Click(View view) {
        Intent intent = new Intent(this, Item16Activity.class);
        startActivity(intent);
    }

    /* Componente do item 17 */
    public void btnItem17Click(View view) {
        Intent intent = new Intent(this, Item17Activity.class);
        startActivity(intent);
    }

}
