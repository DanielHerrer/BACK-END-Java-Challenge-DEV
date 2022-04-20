package com.company.challenge;

import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    private CocheEmpresa coche;
    ArrayList<Vendedor> vendedores;

    public JefeDeZona(){
    }

    public JefeDeZona(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario, ArrayList<Vendedor> vendedores) {
        super(nombre, apellido, direccion, dni, antiguedad, telefono, salario);
        this.vendedores = vendedores;
        this.coche = new CocheEmpresa();
    }

    @Override
    public String toString() {
        return super.toString() + "JefeDeZona{" + "\n" +
                "Vendedores= " + vendedores + "\n" +
                '}' + "\n" + coche;
    }

    public void darDeAlta(Vendedor vendedor){
        vendedores.add(vendedor);
        System.out.println("Se ha añadido un vendedor llamado" +vendedor.getNombre());
    }

    public void darDeBajaUltimo(){
        vendedores.remove(vendedores.size() - 1);
    }
}
