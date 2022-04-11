package com.company;

public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int numId, String curso) {
        super(nombre, apellido, numId);
        this.curso = curso;
    }

    public String toString() {
        return super.toString() + "Estudiante{" + "\n" +
                "Curso= " + curso + "\n" +
                '}' + "\n";
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}
