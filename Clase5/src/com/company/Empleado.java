package com.company;

abstract public class Empleado {
    private String nombre, apellido, direccion, supervisor;
    private int dni, antiguedad, telefono, salario;

    public Empleado(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni=" + dni + '\'' +
                ", antiguedad=" + antiguedad + '\'' +
                ", telefono=" + telefono + '\'' +
                ", salario=" + salario + '\'' +
                '}';
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public void incrementarSalario(){

    }
}
