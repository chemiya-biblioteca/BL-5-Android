package com.example.pruebasgit;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleProducto extends AppCompatActivity {

    int idProducto;
    TextView idProductoMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);

        //obtener mensaje de anterior pantalla
         idProducto = getIntent().getExtras().getInt("idSeleccionado");

         idProductoMostrar=findViewById(R.id.id_producto_mostrar);

         idProductoMostrar.setText("producto seleccionado: "+idProducto );


         //notificacion
        Toast.makeText(DetalleProducto.this, "se ha abierto el producto", Toast.LENGTH_SHORT).show();

    }
}