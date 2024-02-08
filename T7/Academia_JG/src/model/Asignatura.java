package model;

public class Asignatura {

    private int idAsignatura;
    double calificacion;

    public Asignatura (){}
    public Asignatura (int idAsig){// para crear asignatura solo necesitamos un int id
        this.idAsignatura=idAsig;
        //calificacion no se hace hasta que alguien lo vaya a calificar, ahora vale 0.0
    }

    public void mostrarDatos (){
        System.out.println("Identificador es: "+idAsignatura);
        System.out.println("Calificacion es: "+calificacion);

    }



    //Getters&Setters
    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
