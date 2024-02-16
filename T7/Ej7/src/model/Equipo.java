package model;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelMedia, nivelDefensa;
    private int goles;

    private ArrayList<Jugador>listaJugadores;


    public Equipo() {
    }//constructor vacio

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelDefensa = (int) (Math.random() * 101);
        this.nivelMedia = (int) (Math.random() * 101);
        this.nivelAtaque = (int) (Math.random() * 101);
        this.goles = 0;
        this.listaJugadores=new ArrayList<>();
    }

    public Equipo(String nombre, int nivelAtaque, int nivelMedia, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelDefensa = nivelDefensa;
        this.nivelMedia = nivelMedia;
        this.nivelAtaque = nivelAtaque;
        this.listaJugadores=new ArrayList<>();
    }

    public boolean atacar() {
        int ataque = (nivelAtaque * (int) (Math.random() * 2)) + ((nivelMedia * (int) (Math.random() * 2) / 2));

        if (ataque > 90) {
            return true;
        } return false;

    }

    public void ficharJugador (Jugador jugador){
        listaJugadores.add(jugador);//añade jugador
    }

    public void mostrarDelanteros(){
        System.out.println("MOSTRANDO DELANTEROS");
        for (Jugador item:listaJugadores) {
            if (item.getPosicion().equalsIgnoreCase("delantero")){
                item.mostrarDatos(item);
            }else {
            }
        }
    }
    public void mostrarPlantilla(){
        System.out.println("MOSTRANDO PLANTILLA");
        for (Jugador item:listaJugadores) {
                item.mostrarDatos(item);
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelMedia() {
        return nivelMedia;
    }

    public void setNivelMedia(int nivelMedia) {
        this.nivelMedia = nivelMedia;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
