package com.company.challenge;

public class CocheEmpresa {
    private int matricula;
    private String marca, modelo;

    public CocheEmpresa(){
    }

    public CocheEmpresa(int matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "CocheEmpresa{" + "\n" +
                "Matricula= " + matricula + "\n" +
                "Marca= " + marca + "\n" +
                "Modelo= " + modelo + "\n" +
                '}' + "\n";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
