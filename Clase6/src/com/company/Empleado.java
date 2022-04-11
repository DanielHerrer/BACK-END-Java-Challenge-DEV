package com.company;

public class Empleado extends Persona{
    private int ageInicio;
    private int numDespacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int numId, int ageInicio, int numDespacho) {
        super(nombre, apellido, numId);
        this.ageInicio = ageInicio;
        this.numDespacho = numDespacho;
    }

    public String toString() {
        return super.toString() + "Empleado{" + "\n" +
                "AñoInicio= " + ageInicio + "\n" +
                "NumDespacho= " + numDespacho + "\n" +
                '}' + "\n";
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public int getAgeInicio() {
        return ageInicio;
    }

    public void setAgeInicio(int ageInicio) {
        this.ageInicio = ageInicio;
    }

    public int getNumDespacho() {
        return numDespacho;
    }
}
