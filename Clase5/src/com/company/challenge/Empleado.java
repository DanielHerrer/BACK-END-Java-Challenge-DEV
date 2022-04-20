package com.company.challenge;

public class Empleado {
    private String nombre, apellido, direccion;
    private int dni, antiguedad, telefono, salario;
    private Empleado supervisor;

    public Empleado(){
    }

    public Empleado(String nombre, String apellido, String direccion, int dni, int antiguedad, int telefono, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null;
    }

    public String toString() {
        return "Empleado{" + "\n" +
                "Nombre= " + nombre + "\n" +
                "Apellido= " + apellido + "\n" +
                "Direccion= " + direccion + "\n" +
                "DNI= " + dni + "\n" +
                "Antiguedad= " + antiguedad + "\n" +
                "Telefono= " + telefono + "\n" +
                "Salario= " + salario + "\n" +
                '}' + "\n";
    }

    public void setSupervisor(Empleado newSupervisor) {
        this.supervisor = newSupervisor;
    }

    public void incrementarSalario(){

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
