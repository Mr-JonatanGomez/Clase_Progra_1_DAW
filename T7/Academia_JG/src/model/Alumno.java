package model;

/*- Tenga tres atributos private de tipo Asignatura.
- Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
- Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
- Tenga un getter para cada uno de los atributos.*/
public class Alumno {
    private String nombre;
    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno() {
    }

    public Alumno(String nombre, Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        // inicializa con nombre de asignatura
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.nombre = nombre;
    }

    public Alumno(String nombre, int id1, int id2, int id3){
        //para poder crear asignatura por el numero hay que inicializar asignatura aqui
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
}
