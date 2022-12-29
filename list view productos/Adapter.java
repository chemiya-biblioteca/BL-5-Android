package com.example.pruebasgit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


//clase para el list view
public class Adapter extends BaseAdapter {
    Context context;
    List<Producto> lista;

    public Adapter(Context context, List<Producto> lista) {
        this.context = context;
        this.lista = lista;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView nombre,descripcion,precio;
        Producto pr=lista.get(i);

        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.vista_producto,null);
            nombre=view.findViewById(R.id.nombre);
            descripcion=view.findViewById(R.id.descripcion);
            precio=view.findViewById(R.id.precio);

            nombre.setText(pr.getNombre());
            descripcion.setText(pr.getDescripcion());
            precio.setText(pr.getPrecio());
        }

        return view;

    }
}
