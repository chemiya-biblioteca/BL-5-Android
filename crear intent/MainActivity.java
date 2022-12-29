package com.example.pruebasgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText entrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton=findViewById(R.id.boton);
        entrada=findViewById(R.id.entrada);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Segunda.class);

                Bundle usuarioPasar = new Bundle();
                usuarioPasar.putString("usuario", entrada.getText().toString());
                intent.putExtras(usuarioPasar);
                startActivity(intent);
            }
        });
    }


}