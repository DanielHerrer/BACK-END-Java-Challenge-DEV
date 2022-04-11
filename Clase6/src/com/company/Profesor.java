package com.company;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int numId, int ageInicio, int numDespacho, String departamento) {
        super(nombre, apellido, numId, ageInicio, numDespacho);
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + "Profesor{" + "\n" +
                "Departamento= " + departamento + "\n" +
                '}' + "\n";
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
