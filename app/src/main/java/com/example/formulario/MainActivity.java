package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button save, cancelar;
EditText textnombre;
    EditText textnombre1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = (Button)findViewById(R.id.boton1);
        cancelar = (Button)findViewById(R.id.button3);

        //  textnombre = (EditText)findViewById((R.id.editTextTextPersonName));

       // Toast.makeText(MainActivity.this, "usario"  , Toast.LENGTH_SHORT)
       save.setOnClickListener(new View.OnClickListener() {
          @Override
        public void onClick(View v) {
              textnombre = (EditText)findViewById(R.id.editTextTextPersonName);
              textnombre1 = (EditText)findViewById(R.id.editTextTextPersonName2 );
              String nombre = textnombre.getText().toString();
              String nombre2 = textnombre1.getText().toString();

              Toast.makeText(MainActivity.this, "BIENVENIDO " + nombre + " " + nombre2, Toast.LENGTH_SHORT).show();

            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                                Toast.makeText(MainActivity.this, "REGISTRO CANCELADO " , Toast.LENGTH_SHORT).show();

            }
        });
    }

}