package org.ronal.pooHerencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;


    public Alumno() {

        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }


    public Alumno(String nombre, String apellido, int edad, String institucion) {
        this(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre,
                  String apellido,
                  int edad,
                  String institucion,
                  double notaMatematica,
                  double notaCastellano,
                  double notaHistoria) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;

    }


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno";
    }

    public double calcularPromedio() {
        if (this instanceof AlumnoInternacional) {
            System.out.println("calcular Promedio " + AlumnoInternacional.class.getCanonicalName());
        } else {
            System.out.println("caluclar Promedio:" + Alumno.class.getCanonicalName());

        }
        return (notaHistoria + notaCastellano + notaMatematica) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria+
                ", promedio"+this.calcularPromedio();

    }
}
