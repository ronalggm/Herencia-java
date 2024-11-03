package org.ronal.pooHerencia;

public class ejemploCasting {
    public static void main(String[] args) {
        Persona alumno = new Alumno();
        alumno.setNombre("Antonio");
        alumno.setApellido("gomez");
        ((Alumno) alumno).getInstitucion(); //casteo de persona a alumno


        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");

        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + ((Alumno) alumno).getInstitucion());

        System.out.println("Profesor "
                + profesor.getAsignatura()
                + ": " + profesor.getNombre()

                + " " + ((Persona) alumno).getApellido());
    }
}