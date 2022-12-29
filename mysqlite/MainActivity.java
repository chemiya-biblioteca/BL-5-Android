package com.example.pruebasgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button alta,baja,modificacion,consulta_codigo,consulta_descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        alta=findViewById(R.id.alta);
        baja=findViewById(R.id.baja);
        modificacion=findViewById(R.id.modificacion);
        consulta_codigo=findViewById(R.id.consulta_codigo);
        consulta_descripcion=findViewById(R.id.consulta_descripcion);

        alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(MainActivity.this,
                        "administracion", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String cod = et1.getText().toString();
                String descri = et2.getText().toString();
                String pre = et3.getText().toString();
                ContentValues registro = new ContentValues();
                registro.put("codigo", cod);
                registro.put("descripcion", descri);
                registro.put("precio", pre);
                bd.insert("articulos", null, registro);
                bd.close();
                et1.setText("");
                et2.setText("");
                et3.setText("");
                Toast.makeText(MainActivity.this, "Se cargaron los datos del artícul",Toast.LENGTH_SHORT).show();
            }
        });

        consulta_codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(MainActivity.this,
                        "administracion", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String cod = et1.getText().toString();
                Cursor fila = bd.rawQuery(
                        "select descripcion,precio from articulos where codigo=" + cod, null);
                if (fila.moveToFirst()) {
                    et2.setText(fila.getString(0));
                    et3.setText(fila.getString(1));
                } else
                    Toast.makeText(MainActivity.this, "No existe un artículo con dicho código",
                            Toast.LENGTH_SHORT).show();
                bd.close();
            }
        });

        consulta_descripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(MainActivity.this,
                        "administracion", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String descri = et2.getText().toString();
                Cursor fila = bd.rawQuery(
                        "select codigo,precio from articulos where descripcion='" + descri +"'", null);
                if (fila.moveToFirst()) {
                    et1.setText(fila.getString(0));
                    et3.setText(fila.getString(1));
                } else
                    Toast.makeText(MainActivity.this, "No existe un artículo con dicha descripción",
                            Toast.LENGTH_SHORT).show();
                bd.close();
            }
        });

        baja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(MainActivity.this,
                        "administracion", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String cod= et1.getText().toString();
                int cant = bd.delete("articulos", "codigo=" + cod, null);
                bd.close();
                et1.setText("");
                et2.setText("");
                et3.setText("");
                if (cant == 1)
                    Toast.makeText(MainActivity.this, "Se borró el artículo con dicho código",
                            Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "No existe un artículo con dicho código",
                            Toast.LENGTH_SHORT).show();
            }
        });

        modificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(MainActivity.this,
                        "administracion", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String cod = et1.getText().toString();
                String descri = et2.getText().toString();
                String pre = et3.getText().toString();
                ContentValues registro = new ContentValues();
                registro.put("codigo", cod);
                registro.put("descripcion", descri);
                registro.put("precio", pre);
                int cant = bd.update("articulos", registro, "codigo=" + cod, null);
                bd.close();
                if (cant == 1)
                    Toast.makeText(MainActivity.this, "se modificaron los datos", Toast.LENGTH_SHORT)
                            .show();
                else
                    Toast.makeText(MainActivity.this, "no existe un artículo con el código ingresado",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
}