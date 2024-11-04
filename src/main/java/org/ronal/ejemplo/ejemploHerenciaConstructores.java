package org.ronal.ejemplo;

import org.ronal.pooHerencia.*;


public class ejemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("==== creando la instancia de la clase alumno");

        Alumno alumno = new Alumno("Antonio", "Gomez", 23, "Instuto Miranda");
//alumno
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(7.0);
        alumno.setNotaMatematica(9.0);
        alumno.setEmail("antonio@gmail.com");

        System.out.println("=====creando la instancia de la clase AlumnoInternacional=====");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter ", "Goslin", "Australia");
//Alumno int
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("VellaVista");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(5.0);
        alumnoInt.setNotaMatematica(10);
        alumnoInt.setNotaHistoria(5);
alumnoInt.setEmail("");
        System.out.println("====creando la instancia de la clase Profesor=====");

        Profesor profesor = new Profesor("Luci", "gimenez", "matematicas");
        profesor.setEdad(34);

        profesor.setAsignatura("Matematicas");


        System.out.println("======+++++======");
        Persona.imprimir(alumno);
        System.out.println();
        Persona.imprimir(alumnoInt);
        System.out.println();
        Persona.imprimir(profesor);

    }




    //Metodo imprimir

    }
