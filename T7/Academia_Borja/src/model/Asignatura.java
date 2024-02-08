package model;

public class Asignatura {
    // atributos siempre privados
    private int idAsignatura;
    private double calificacion;

    public Asignatura(){}
    public Asignatura(int idAsignatura){}



//GETTER Y SETTER

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
