package com.example.pruebasgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto=findViewById(R.id.textoGuardado);

        Bundle parametros = this.getIntent().getExtras();
        String usuario = parametros.getString("usuario");
        texto.setText("Bienvenido "+usuario);
    }
}