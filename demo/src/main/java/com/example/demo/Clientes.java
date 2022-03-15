package com.example.demo;

public class Clientes {
    private String nombre;
    private String apellido;
    private String correo;
    private Number numero;
    private boolean trato;
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
