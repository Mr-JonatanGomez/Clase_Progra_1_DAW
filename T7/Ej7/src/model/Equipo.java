package model;

import java.util.ArrayList;

public class Equipo {

    private int idEquipo;
    private String nombre;
    private int nivelAtaque, nivelCentrocampista, nivelDefensa, nivelPorteria;
    private int goles, puntos,golesFavor, golesContra;

    private ArrayList<Jugador>listaJugadores;


    public Equipo() {
    }//constructor vacio

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.goles = 0;
        this.puntos=0;
        this.listaJugadores=new ArrayList<>();
        this.idEquipo=idEquipo;
        this.golesFavor=golesFavor;
        this.golesContra=golesContra;



    }

    public Equipo(int idEquipo,String nombre, int nivelAtaque, int nivelCentrocampista, int nivelDefensa) {
        this.idEquipo=idEquipo;
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

    }// obsoleto con la mejora

    public boolean atacarDefendido(Equipo equipo1,Equipo equipo2){
        int ataque=(equipo1.getNivelAtaque() * (int) (Math.random() * 2)) + ((equipo1.getNivelCentrocampista() * (int) (Math.random() * 2) / 2));
        int defensa=(equipo2.getNivelDefensa() * (int) (Math.random() * 2)) + ((equipo2.getNivelCentrocampista() * (int) (Math.random() * 2) / 2))+((int)(Math.random()*(nivelPorteria/10)+1));

        if (ataque > defensa) {
            goles++;
            return true;
        } return false;

    }

    public void ficharJugador (Jugador jugador){
        listaJugadores.add(jugador);//añade jugador
    }

    public void calcularNivelHabilidad(){
        int sumaAtaque=0;
        int sumaCentrocampo=0;
        int sumaDefensa=0;
        int sumaPortero=0;

        int contadorDelantero=0;
        int contadorDefensa=0;
        int contadorCentrocampista=0;
        int contadorPortero=0;

        for (Jugador jugador:listaJugadores) {
            if (jugador.getPosicion().equalsIgnoreCase("delantero")){
                sumaAtaque+= jugador.getCalidad();
                contadorDelantero++;
            } else if (jugador.getPosicion().equalsIgnoreCase("centrocampista")){
                sumaCentrocampo+= jugador.getCalidad();
                contadorCentrocampista++;
            } else if (jugador.getPosicion().equalsIgnoreCase("defensa")){
                sumaDefensa+= jugador.getCalidad();
                contadorDefensa++;
            } else if (jugador.getPosicion().equalsIgnoreCase("portero")){
                sumaPortero+= jugador.getCalidad();
                contadorPortero++;
            }
        }
        nivelAtaque=sumaAtaque/contadorDelantero;
        nivelCentrocampista=sumaCentrocampo/contadorCentrocampista;
        nivelDefensa=sumaDefensa/contadorDefensa;
        nivelPorteria=sumaPortero/contadorPortero;// para math random sumar a defensa
        //

    }


    public void mostrarPlantilla(){
        System.out.println("MOSTRANDO PLANTILLA DEL "+getNombre());//nombre equipo
        for (Jugador item:listaJugadores) {
                item.mostrarDatos(item);
        }
        System.out.println();
    }

    public void mostrarDatosParaClasificacion(){
        System.out.print(getNombre()+", ");
        System.out.print(getPuntos()+" Puntos, ");
        System.out.print(getGolesFavor()+" GF, ");
        System.out.println(getGolesContra()+" GC");

    }
    public void mostrarDatosCalidad(){
        System.out.println(getNombre()+" ");
        System.out.println("Calidad portería "+getNivelPorteria());
        System.out.println("Calidad defensa "+getNivelDefensa());
        System.out.println("Calidad centrocampo "+getNivelCentrocampista());
        System.out.println("Calidad delantera "+getNivelAtaque());

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

    public int getNivelPorteria() {
        return nivelPorteria;
    }

    public void setNivelPorteria(int nivelPorteria) {
        this.nivelPorteria = nivelPorteria;
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

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }


}
