package com.company.challenge.libreria;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String nombre, String apellido, int numId, int ageInicio, int numDespacho, String seccion) {
        super(nombre, apellido, numId, ageInicio, numDespacho);
        this.seccion = seccion;
    }

    public String toString() {
        return super.toString() + "PersonalServicio{" + "\n" +
                "Seccion= " + seccion + "\n" +
                '}' + "\n";
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }
}
