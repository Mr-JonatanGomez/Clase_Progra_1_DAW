package model;

public class Jugador {
    private String nombreJ, posicion;
    private boolean estrella;
    private int calidad, idJugador;

    public Jugador (){}//VACIO
    public Jugador(int idJugador, String nombre, String posicion, int calidad){
        this.idJugador=idJugador;
        this.nombreJ=nombre;
        this.posicion=posicion;
        this.calidad=calidad;
        if (calidad>90){
            this.estrella=true;
        }else{
            this.estrella=false;
        }
    }

    public void mostrarDatos  (Jugador jugador){
        System.out.println("Nombre Jugador: "+ jugador.getNombre());
        System.out.println("Posicion Jugador: "+ jugador.getPosicion());
        System.out.println("Calidad Jugador: "+ jugador.getCalidad());

    }


    public String getNombre() {
        return nombreJ;
    }

    public void setNombre(String nombre) {
        this.nombreJ = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }
}
