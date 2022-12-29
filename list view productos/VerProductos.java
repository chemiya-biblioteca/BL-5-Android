package com.example.pruebasgit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


//pantalla con un list view
public class VerProductos extends AppCompatActivity {

    ListView lista;
    List<Producto> listaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_productos);

        lista=findViewById(R.id.lista);
        Adapter ad=new Adapter(this,ObtenerDatos());
        lista.setAdapter(ad);


        //click sobre un elemento
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Producto pr=listaProductos.get(i);
                Intent detalle = new Intent(view.getContext(), DetalleProducto.class);
                detalle.putExtra("idSeleccionado",i);
                startActivity(detalle);
            }
        });

    }

    private List<Producto> ObtenerDatos() {
        listaProductos=new ArrayList<>();
        listaProductos.add(new Producto("nombre","desc","precio"));
        listaProductos.add(new Producto("nombre1","desc2","precio3"));
        return listaProductos;
    }
}