package com.example.pruebasgit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoVerImagen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoVerImagen extends Fragment {



    public FragmentoVerImagen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentoVerImagen.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoVerImagen newInstance(String param1, String param2) {
        FragmentoVerImagen fragment = new FragmentoVerImagen();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    EditText entradaFragment1;
    Button botonFragmento1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    //logica fragment
        View view=inflater.inflate(R.layout.fragment_fragmento_ver_imagen, container, false);
    entradaFragment1=view.findViewById(R.id.entradaFragment1);
    botonFragmento1=view.findViewById(R.id.botonFragment1);


//onclick boton
    botonFragmento1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //notificacion
            Toast.makeText(getActivity(), entradaFragment1.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    });



        return view;
    }
}