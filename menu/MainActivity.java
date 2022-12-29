package com.example.pruebasgit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/*
* new android resoucrce file en res-->menu
*
*
* */

    TextView entrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada=findViewById(R.id.entrada);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }



    //opcion seleccionada del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.primero:
                entrada.setText("primero");
                return true;
            case R.id.segundo:
                entrada.setText("segundo");

                return true;
            case R.id.tercero:
                entrada.setText("tercero");



                return true;

            case R.id.cuarto:
                entrada.setText("cuarto");



                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}