package org.ronal.ejemplo;

import org.ronal.pooHerencia.Alumno;
import org.ronal.pooHerencia.AlumnoInternacional;
import org.ronal.pooHerencia.Profesor;

public class ejemploHerencia {
    public static void main(String[] args) {

        System.out.println("==== creando la instancia de la clase alumno");

        Alumno alumno = new Alumno();
        alumno.setNombre("Antonio");
        alumno.setApellido("gomez");
        alumno.setInstitucion("Instituto nacional");
        alumno.getInstitucion();
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(7.0);
        alumno.setNotaMatematica(9.0);

        System.out.println("=====creando la instancia de la clase AlumnoInternacional=====");

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Goslin");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("VellaVista");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(5.0);
        alumnoInt.setNotaMatematica(10);
        alumnoInt.setNotaHistoria(5);

        System.out.println("====creando la instancia de la clase Profesor=====");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");

        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println();

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais()
        );
        System.out.println();

        System.out.println("Profesor "
                + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + alumno.getApellido());

        System.out.println();
        //variable de tipo class  uso de la reflexion
        Class clase = alumnoInt.getClass();

        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " Es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();

        }




    }
}
