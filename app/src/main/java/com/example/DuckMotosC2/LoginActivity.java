package com.example.DuckMotosC2;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText txtLogUser, txtLogPass;
    Button btnLogin, btnIrRegister, btnMostrarAlcances;
    TextView mostrarAlcances;

    PHPController phpController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phpController = new PHPController(this);

        txtLogUser = (EditText) findViewById(R.id.txtLogUser);
        txtLogPass = (EditText) findViewById(R.id.txtLogPass);
        // mostrarAlcances = (TextView) findViewById(R.id.mostrarAlcances);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnIrRegister = (Button) findViewById(R.id.btnIrRegister);
        // btnMostrarAlcances = (Button) findViewById(R.id.btnMostrarAlcances);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ingresar();
            }
        });

        btnIrRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        /* btnMostrarAlcances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alcances();
            }
        });*/
    }

    /*public void Alcances() {
        String alcances = "Se busca realizar una aplicación dinámica e\n" +
                "intuitiva en donde los usuarios puedan vizualizar\n" +
                " todas las caracteristicas de las motocicletas que\n" +
                "la tienda ofrece al momento de que el usuario la\n" +
                "quiera adquirir una o varias motocicletas.";
        mostrarAlcances.setText(alcances);
    } */

    public void Ingresar() {
        String username = txtLogUser.getText().toString().trim();
        String password = txtLogPass.getText().toString().trim();
        phpController.Login(username, password);
    }


    // Menú desbordante
    //Implementación método acerca de la App
    public void acerca_app(View view) {
        alertOneButtonAcercaAulaapMovil(); //Método a invocar
    }

    public void dev(View view) {
        alertOneButtonAcercaAulaapMovil2();
    }

    public void more(View view) {
        alertOneButtonAcercaAulaapMovil3();
    }

    //Implementación método salir
    public void salir_app(View view) {
        finish();
    }

    //Implemetación Menú de opciones

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_menu, (android.view.Menu) menu);
        return true;
    }*/

    //Configuración de opciones de navegación
    @Override
    public boolean onOptionsItemSelected(MenuItem opcion) {
        int id = opcion.getItemId();
        //Ejecuta el metodo acerca_app
        if (id == R.id.info_app) {
            acerca_app(null);
            Toast.makeText(getApplicationContext(), "Información App", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.dev) {
            dev(null);
            Toast.makeText(getApplicationContext(), "Desarrolladores", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.more) {
            more(null);
            Toast.makeText(getApplicationContext(), "Referencias", Toast.LENGTH_SHORT).show();
            return true;
        }
        //Ejecuta el metodo salir_app
        if (id == R.id.salir) {
            salir_app(null);
            Toast.makeText(getApplicationContext(), "Salir", Toast.LENGTH_SHORT).show();
            return true;
        }
        //Selección de la opción
        return super.onOptionsItemSelected(opcion);
    }

    //Método que permite describir información en la ventana de dialogo de la App
    private void alertOneButtonAcercaAulaapMovil() {
        new AlertDialog.Builder(LoginActivity.this)
                .setTitle("Descripción de la App")
                .setMessage("Se busca realizar una aplicación dinámica e intuitiva en donde los usuarios puedan vizualizar todas las caracteristicas de las motocicletas que la tienda ofrece al momento de que el usuario quiera adquirir una o varias motocicletas.")
                .setPositiveButton("Salir",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(11)
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                System.exit(0);
                                finish();
                            }
                        })
                .setNegativeButton("Continuar", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }

    private void alertOneButtonAcercaAulaapMovil2() {
        new AlertDialog.Builder(LoginActivity.this)
                .setTitle("Desarrolladores de la App")
                .setMessage("• Diegody Herrera\n" + "• David Gonzalez")
                .setPositiveButton("Salir",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(11)
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                System.exit(0);
                                finish();
                            }
                        })
                .setNegativeButton("Continuar", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }

    private void alertOneButtonAcercaAulaapMovil3() {
        new AlertDialog.Builder(LoginActivity.this)
                .setTitle("Referencias del Proyecto")
                .setMessage("Proyecto libre con su respectivo repositorio en: https://github.com/Diegody?tab=repositories")
                .setPositiveButton("Salir",
                        new DialogInterface.OnClickListener() {
                            @TargetApi(11)
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                System.exit(0);
                                finish();
                            }
                        })
                .setNegativeButton("Continuar", new DialogInterface.OnClickListener() {
                    @TargetApi(11)
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }

}