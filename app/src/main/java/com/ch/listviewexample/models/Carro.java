package com.ch.listviewexample.models;

public class Carro {
    private String nombre;
    private String modelo;
    private String cilindraje;
    private String valor;
    private String imagen;

    public Carro(String nombre, String modelo, String cilindraje, String valor, String imagen) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.valor = valor;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
