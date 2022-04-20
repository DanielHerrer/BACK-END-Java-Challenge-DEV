package com.company.challenge;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    private CocheEmpresa coche;
    private int telefonoMovil;
    private String area;
    private double porcentaje;

    private ArrayList<String> clientes;

    public Vendedor(){
    }

    public Vendedor(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario, int telefonoMovil, String area, ArrayList<String> clientes) {
        super(nombre, apellido, direccion, dni, antiguedad, telefono, salario);
        this.telefonoMovil = telefonoMovil;
        this.area = area;
        this.clientes = clientes;
        this.coche = new CocheEmpresa();
    }

    @Override
    public String toString() {
        return super.toString() + "Vendedor{" + "\n" +
                "Telefono Movil= " + telefonoMovil + "\n" +
                "Area= " + area + "\n" +
                "Porcentaje= " + porcentaje + "\n" +
                "Clientes= " + clientes + "\n" +
                '}' + "\n" + coche;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }

}
