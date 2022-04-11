package com.company;

import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    private int telefonoMovil;
    private String área;
    private double porcentaje;
    private ArrayList<String> clientes;

    public Vendedor(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario, int telefonoMovil, String area, double porcentaje, ArrayList<String> clientes, teléfono móvil, teléfono área, de venta, de lista, de clientes1, y porcentaje1) {
        super(nombre, apellido, direccion, dni, antiguedad, telefono, salario);
        this.telefonoMovil = telefonoMovil;
        this.porcentaje = 0.05;
        this.clientes = new ArrayList<>();
        this.móvil = móvil;
        this.área = área;
        this.venta = venta;
        this.lista = lista;
    }


}
