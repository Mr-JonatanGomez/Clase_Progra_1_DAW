package model;

import java.util.ArrayList;

public class Equipo {

    private int idEquipo;
    private String nombre;
    private int nivelAtaque, nivelCentrocampista, nivelDefensa;
    private int goles, puntos;

    private ArrayList<Jugador>listaJugadores;


    public Equipo() {
    }//constructor vacio

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelDefensa = (int) (Math.random() * 101);
        this.nivelCentrocampista = (int) (Math.random() * 101);
        this.nivelAtaque = (int) (Math.random() * 101);
        this.goles = 0;
        this.puntos=0;
        this.listaJugadores=new ArrayList<>();
    }

    public Equipo(int idEquipo,String nombre, int nivelAtaque, int nivelCentrocampista, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentrocampista = nivelCentrocampista;
        this.nivelAtaque = nivelAtaque;
        this.listaJugadores=new ArrayList<>();
        this.goles=0;
        this.puntos=0;

    }

    public boolean atacar() {
        int ataque = (nivelAtaque * (int) (Math.random() * 2)) + ((nivelCentrocampista * (int) (Math.random() * 2) / 2));

        if (ataque > 90) {
            goles++;
            return true;
        } return false;

    }

    public boolean atacarDefendido(Equipo equipo1,Equipo equipo2){
        int ataque=(equipo1.getNivelAtaque() * (int) (Math.random() * 2)) + ((equipo1.getNivelCentrocampista() * (int) (Math.random() * 2) / 2));
        int defensa=(equipo2.getNivelDefensa() * (int) (Math.random() * 2)) + ((equipo2.getNivelCentrocampista() * (int) (Math.random() * 2) / 2));

        if (ataque > defensa) {
            goles++;
            return true;
        } return false;

    }

    public void ficharJugador (Jugador jugador){
        listaJugadores.add(jugador);//añade jugador
    }

    /*public void mostrarDelanteros(){
        System.out.println("MOSTRANDO DELANTEROS");
        for (Jugador item:listaJugadores) {
            if (item.getPosicion().equalsIgnoreCase("delantero")){
                item.mostrarDatos(item);
            }else {
            }
        }
    }*/ // metodo mostrar delantero no sirve para NADA
    public void mostrarPlantilla(){
        System.out.println("MOSTRANDO PLANTILLA DEL "+getNombre());//nombre equipo
        for (Jugador item:listaJugadores) {
                item.mostrarDatos(item);
        }
        System.out.println();
    }

    public void mostrarDatos(){
        System.out.println(getNombre());
        System.out.println(getPuntos()+" Puntos");
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

    public int getNivelCentrocampista() {
        return nivelCentrocampista;
    }

    public void setNivelCentrocampista(int nivelCentrocampista) {
        this.nivelCentrocampista = nivelCentrocampista;
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

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
}
