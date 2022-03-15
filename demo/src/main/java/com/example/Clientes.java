package com.example;

public class Clientes {
    private String nombre;
    private String correo;
    private Number numero;
    private boolean trato;
    public String getNombre() {
        return nombre;
    }
    public boolean isTrato() {
        return trato;
    }
    public void setTrato(boolean trato) {
        this.trato = trato;
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
