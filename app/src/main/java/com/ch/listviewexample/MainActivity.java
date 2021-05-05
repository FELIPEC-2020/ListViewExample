package com.ch.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ch.listviewexample.models.Carro;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lvLista;
    private ArrayList<Carro> listaCarros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle objBundle = getIntent().getExtras();
        listaCarros = objBundle.getParcelableArrayList("listaCarros");
        lvLista = findViewById(R.id.lvLista);
        AdapterCar objAdapterCar = new AdapterCar(this, listaCarros);
        lvLista.setAdapter(objAdapterCar);
        lvLista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Usted ha precionado " + listaCarros.get(position).getNombre(), Toast.LENGTH_LONG).show();
    }
}