package model;

public class Alumno {
    private String nombre;
    private Asignatura asignatura1, asignatura2,asignatura3;
    private int nExpediente;

    public Alumno() {
    }

    public Alumno(String nombre, Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3, int nExpediente) {
        this.nombre= nombre;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.nExpediente=nExpediente;

    }

    public Alumno (String nombre, int id1, int id2, int id3, int nExpediente){// poder elegir asignaturas por id
        //iniciar 3 atributos
        this.nombre= nombre;
        this.nExpediente=nExpediente;
        this.asignatura1= new Asignatura(id1);
        this.asignatura2= new Asignatura(id2);
        this.asignatura3= new Asignatura(id3);
    }



    public void mostrarDatos(){
        System.out.println("Mostrar calificaciiones alumno con nombre"+nombre);
        System.out.println("NºExpediente: "+nExpediente);
        System.out.println("Asignatura con id "+asignatura1.getId());
        System.out.println("Calificacion "+asignatura1.getCalificacion());
        System.out.println("Asignatura con id "+asignatura2.getId());
        System.out.println("Calificacion "+asignatura2.getCalificacion());
        System.out.println("Asignatura con id "+asignatura2.getId());
        System.out.println("Calificacion "+asignatura2.getCalificacion());
    }

   // public String get nombre en 1.32.00 de clase


    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
