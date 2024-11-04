package org.ronal.pooHerencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;


    public Persona() {
        System.out.println("Persona: inicializando constructor...");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

public String saludar(){
        return "Hola soy una persona";
}
    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo los datos en comun del tipo Persona: ");

        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println(",Institucion: " + ((Alumno) persona).getInstitucion());
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

