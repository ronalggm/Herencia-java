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
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }
//Metodo imprimir

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo los datos en comun del tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println(",Intiucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano:" + ((Alumno) persona).getNotaCastellano());
            System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");


            if (persona instanceof AlumnoInternacional) {
                System.out.println("Notqa idiomas:" + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("========sobre escritura promedio=======");
            System.out.println("Promedio: "+((Alumno)persona).calcularPromedio());

            if (persona instanceof Profesor) {
                System.out.println("Asignatura:" + ((Profesor) persona).getAsignatura());
            }
        }

    }}
