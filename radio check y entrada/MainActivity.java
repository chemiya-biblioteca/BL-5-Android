package com.example.pruebasgit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText entrada_texto;
    RadioButton radio1,radio2;
    CheckBox check1,check2;
    TextView mostrar_entrada,mostrar_check,mostrar_radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=findViewById(R.id.boton);
        entrada_texto=findViewById(R.id.entrada_texto);
        check1=findViewById(R.id.check1);
        check2=findViewById(R.id.check2);

        radio1=findViewById(R.id.radio1);
        radio2=findViewById(R.id.radio2);

        mostrar_entrada=findViewById(R.id.mostrar_entrada);
        mostrar_radio=findViewById(R.id.mostrar_radio);
        mostrar_check=findViewById(R.id.mostrar_check);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar_entrada.setText(entrada_texto.getText().toString());
                if(radio1.isChecked()){
                    mostrar_radio.setText("radio 1 marcado");
                }
                if(radio2.isChecked()){
                    mostrar_radio.setText("radio 2 marcado");
                }

                if(check1.isChecked()){
                    mostrar_check.setText("check 1 marcado");
                }
                if(check2.isChecked()){
                    mostrar_check.setText("check 2 marcado");
                }
            }
        });
    }
}