package com.company;

public class Persona {
    private String nombre, apellido;
    private String estadoCivil;
    private int numId;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int numId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numId = numId;
    }

    public String toString() {
        return "Persona{" + "\n" +
                "numId= " + numId + "\n" +
                "Nombre= " + nombre + "\n" +
                "Apellido= " + apellido + "\n" +
                "Estado Civil= " + estadoCivil + "\n" +
                '}' + "\n";
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }
}
