package com.company.challenge;

public class Secretario extends Empleado {
    private int numFax;
    private String despacho;

    public Secretario(){
    }

    public Secretario(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario, int numFax, String despacho) {
        super(nombre, apellido, direccion, dni, antiguedad, telefono, salario);
        this.numFax = numFax;
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Secretario{" + "\n" +
                "Numero de Fax= " + numFax + "\n" +
                "Despacho= " + despacho + "\n" +
                '}' + "\n";
    }
}
