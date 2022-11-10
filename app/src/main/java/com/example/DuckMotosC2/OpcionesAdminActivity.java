package com.example.DuckMotosC2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OpcionesAdminActivity extends AppCompatActivity {

    TextView nusu;
    Intent datosusuario;

    Button btnTablaUsuarios, btnSalir, btnTablaPerfiles, btnTablaImagenes, btnInternet;

    PHPController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_admin);

        controller = new PHPController(this);

        nusu = (TextView) findViewById(R.id.nusu);
        datosusuario = getIntent();

        String nombreCompletoUsuario = datosusuario.getStringExtra("usuario");
        nusu.setText(nombreCompletoUsuario);

        btnTablaUsuarios = (Button) findViewById(R.id.btnTablaUsuarios);
        btnSalir = (Button) findViewById(R.id.btnExit);
        btnTablaPerfiles = (Button) findViewById(R.id.btnTablaPerfiles);
        btnTablaImagenes = (Button) findViewById(R.id.btnTablaImagenes);
        btnInternet = (Button) findViewById(R.id.btnInternet);

        btnTablaUsuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.ReadAllUsuarios();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OpcionesAdminActivity.this, LoginActivity.class);
                Toast.makeText(getApplicationContext(), "Sesión Cerrada", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(OpcionesAdminActivity.this, Internet.class);
                Toast.makeText(getApplicationContext(), "Ingreso a 'Internet'", Toast.LENGTH_SHORT).show();
                startActivity(u);
            }
        });

        /*btnTablaComentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.ReadAllComentarios();
            }
        });*/

        btnTablaPerfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.ReadAllPerfiles();
            }
        });

        btnTablaImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.ReadAllImagenes();
            }
        });

        /*btnTablaPublicaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.ReadAllPublicaciones();
            }
        });*/
    }
}