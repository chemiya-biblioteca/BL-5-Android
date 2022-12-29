package com.example.pruebasgit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoVerImagen2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoVerImagen2 extends Fragment {



    EditText entradaFragment2;
    Button botonFragment2;
    TextView mostrarTexto;



    public FragmentoVerImagen2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentoVerImagen2.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoVerImagen2 newInstance(String param1, String param2) {
        FragmentoVerImagen2 fragment = new FragmentoVerImagen2();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // logica fragment
        View view =inflater.inflate(R.layout.fragment_fragmento_ver_imagen2, container, false);
    entradaFragment2=view.findViewById(R.id.entradaFragment2);
        botonFragment2=view.findViewById(R.id.botonFragment2);
        mostrarTexto=view.findViewById(R.id.mostrarTexto);


    //onclick boton
        botonFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtener texto de entrada
                String textoFragment2=entradaFragment2.getText().toString();
        //mostrar texto
                mostrarTexto.setText("en el segundo: "+textoFragment2);


                //snackbar
                Snackbar.make(view, "cambio guardado", Snackbar.LENGTH_LONG)
                        //.setActionTextColor(Color.CYAN)
                        .setActionTextColor(getResources().getColor(R.color.snackbar_action))
                        .setAction("deshacer", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mostrarTexto.setText("deshecho el cambio");
                            }
                        })
                        .show();
            }
        });

        return view;

    }
}