package model;

public class Jugador {
    private String nombre, posicion;
    private boolean estrella;
    private int calidad;

    public Jugador (){}//VACIO
    public Jugador(String nombre, String posicion, int calidad){
        this.nombre=nombre;
        this.posicion=posicion;
        this.calidad=calidad;
        if (calidad>90){
            this.estrella=true;
        }else{
            this.estrella=false;
        }
    }
}
