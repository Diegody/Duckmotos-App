package com.example.DuckMotosC2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OpcionesUsuarioActivity extends AppCompatActivity {

    //Contenido del layout

    //Cabecera
    TextView nusu;
    Intent datosusuario;

    //PHP
    PHPController phpController;
    PHPController controller;
    Button btnTablaImagenes, btnSalir, btnInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_usuario);

        //Contenido del layout

        //PHP
        phpController = new PHPController(this);
        controller = new PHPController(this);

        //Cabecera
        nusu = (TextView) findViewById(R.id.nusu);
        datosusuario = getIntent();
        String nombreCompletoUsuario = datosusuario.getStringExtra("usuario");
        nusu.setText(nombreCompletoUsuario);

        btnTablaImagenes = (Button) findViewById(R.id.btnTablaImagenes);
        btnTablaImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.ReadAllImagenes();
            }
        });

        btnSalir = (Button) findViewById(R.id.btnExit);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OpcionesUsuarioActivity.this, LoginActivity.class);
                Toast.makeText(getApplicationContext(), "Sesión Cerrada", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btnInternet = (Button) findViewById(R.id.btnInternet);
        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(OpcionesUsuarioActivity.this, Internet.class);
                Toast.makeText(getApplicationContext(), "Ingreso a Internet", Toast.LENGTH_SHORT).show();
                startActivity(u);
            }
        });

    }


}