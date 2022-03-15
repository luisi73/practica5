package com.example;

public class Clientes {
    private String nombre;
    private String correo;
    private Number numero;

    public String getNombre() {
        return nombre;
    }
    public Number getNumero() {
        return numero;
    }
    public void setNumero(Number numero) {
        this.numero = numero;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
