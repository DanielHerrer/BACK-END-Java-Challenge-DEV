package com.company;

public class Main {

    public static void main(String[] args) {

        PersonalServicio personal = new PersonalServicio();
        personal.setNumId(1);
        personal.setNombre("Raul");
        personal.setApellido("Guzman");
        personal.setEstadoCivil("Soltero");
        personal.setAgeInicio(1999);
        personal.setNumDespacho(33);
        personal.setSeccion("Secretario");

        Profesor profesor1 = new Profesor();
        profesor1.setNumId(2);
        profesor1.setNombre("Martin");
        profesor1.setApellido("Palomino");
        profesor1.setEstadoCivil("Casado");
        profesor1.setAgeInicio(1995);
        profesor1.setNumDespacho(22);
        profesor1.setDepartamento("Matematica");

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNumId(3);
        estudiante1.setNombre("Javier");
        estudiante1.setApellido("Allomeda");
        estudiante1.setEstadoCivil("Soltero");
        estudiante1.setCurso("Programacion");

        System.out.println(personal.toString());
        System.out.println();
        System.out.println(profesor1.toString());
        System.out.println();
        System.out.println(estudiante1.toString());
        System.out.println();

    }

}
