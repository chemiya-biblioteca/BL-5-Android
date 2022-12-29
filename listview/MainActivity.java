package com.example.pruebasgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*
     *
     *en layout-->new-->xml-->layout xml file
     *
     *
     *
     *
     * */


    private ArrayList<Persona> listapersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas = new ArrayList<Persona>();
        listapersonas.add(new Persona("Juan", "masc"));
        listapersonas.add(new Persona("pedro", "masc"));
        listapersonas.add(new Persona("luis", "masc"));
        listapersonas.add(new Persona("ana", "fem"));
        listapersonas.add(new Persona("carla", "fem"));
        listapersonas.add(new Persona("maria", "fem"));
        listapersonas.add(new Persona("gustavo", "masc"));
        listapersonas.add(new Persona("carlos", "masc"));
        listapersonas.add(new Persona("marta", "fem"));
        listapersonas.add(new Persona("luisa", "fem"));
        listapersonas.add(new Persona("fernanda", "fem"));
        listapersonas.add(new Persona("jose", "masc"));
        listapersonas.add(new Persona("paola", "fem"));
        listapersonas.add(new Persona("lucrecia", "fem"));
        listapersonas.add(new Persona("oscar", "masc"));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        ListView lv1 = findViewById(R.id.list1);
        lv1.setAdapter(adaptador);


    }

    class AdaptadorPersonas extends ArrayAdapter<Persona> {

        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);

            TextView nombre = item.findViewById(R.id.nombre);
            nombre.setText(listapersonas.get(position).getNombre());


            TextView genero = item.findViewById(R.id.genero);
            genero.setText(listapersonas.get(position).getGenero());
            return (item);
        }
    }
}