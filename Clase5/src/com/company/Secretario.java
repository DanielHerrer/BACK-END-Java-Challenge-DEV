package com.company;

public class Secretario extends Empleado {
    private int numFax;
    private String despacho;

    public Secretario(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario, int numFax, String despacho) {
        super(nombre, apellido, direccion, dni, antiguedad, telefono, salario);
        this.numFax = numFax;
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "numFax=" + numFax +
                ", despacho='" + despacho + '\'' +
                '}';
    }
}
