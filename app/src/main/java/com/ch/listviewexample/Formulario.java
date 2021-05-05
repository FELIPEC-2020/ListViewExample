package com.ch.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.ch.listviewexample.models.Carro;

import java.util.ArrayList;

public class Formulario extends AppCompatActivity implements View.OnClickListener {
    private EditText txtNombre;
    private EditText txtModelo;
    private EditText txtCilindraje;
    private EditText txtValor;
    private EditText txtUrl;
    private Button btnGuardar;
    private Button btnListar;
    private ArrayList<Carro> listaCarros = new ArrayList<Carro>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        txtNombre = findViewById(R.id.txtNombre);
        txtModelo = findViewById(R.id.txtModelo);
        txtCilindraje = findViewById(R.id.txtCilindraje);
        txtValor = findViewById(R.id.txtValor);
        txtUrl = findViewById(R.id.txtUrl);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnListar = findViewById(R.id.btnListar);

        btnGuardar.setOnClickListener(this);
        btnListar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnGuardar){
            guardarCarro();

        }else if(v.getId() == R.id.btnListar){
            Intent objIntent = new Intent(this, MainActivity.class);
            Bundle objBundle = new Bundle();
            objBundle.putParcelableArrayList("listaCarros", listaCarros);
            objIntent.putExtras(objBundle);
            startActivity(objIntent);
        }

    }

    private void guardarCarro() {
        String nombre = txtNombre.getText().toString();
        String modelo = txtModelo.getText().toString();
        String cilindraje = txtCilindraje.getText().toString();
        String valor = txtValor.getText().toString();
        String url = txtUrl.getText().toString();

        Carro objIngresoCarro = new Carro(nombre, modelo, cilindraje, valor, url);
        listaCarros.add(objIngresoCarro);
        borrar();
    }

    public void borrar() {
        txtNombre.getText().clear();
        txtModelo.getText().clear();
        txtCilindraje.getText().clear();
        txtValor.getText().clear();
        txtUrl.getText().clear();
    }
}