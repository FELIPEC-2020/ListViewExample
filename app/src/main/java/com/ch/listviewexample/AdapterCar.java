package com.ch.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ch.listviewexample.models.Carro;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterCar extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Carro> carros;

    public AdapterCar(Activity activity, ArrayList<Carro> carros) {
        this.activity = activity;
        this.carros = carros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View objView = convertView;
        if (convertView == null) {
            LayoutInflater objInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            objView = objInflater.inflate(R.layout.car_item, null);
        }
        Carro objElemento = carros.get(position);
        TextView nombreCarro = objView.findViewById(R.id.tvNombre);
        TextView valorCarro = objView.findViewById(R.id.tvValor);
        TextView cilindrajeCarro = objView.findViewById(R.id.tvCilindraje);
        TextView modeloCarro = objView.findViewById(R.id.tvModelo);
        ImageView imagenCarro = objView.findViewById(R.id.imgCarro);

        nombreCarro.setText(objElemento.getNombre());
        valorCarro.setText(objElemento.getValor());
        cilindrajeCarro.setText(objElemento.getCilindraje());
        modeloCarro.setText(objElemento.getModelo());
        Picasso.get()
                .load("")
                .resize(120, 110)
                .centerCrop()
                .error(R.mipmap.ic_launcher)
                .into(imagenCarro);

        return objView;
    }


}
