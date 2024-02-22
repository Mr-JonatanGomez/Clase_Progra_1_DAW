package model;

import java.util.ArrayList;

public class Jornada {
    private ArrayList<Partido> listaJornadas;

    public Jornada(ArrayList<Equipo> equipos) {
        this.listaJornadas = generarPartidos(equipos);
    }

    private ArrayList<Partido> generarPartidos(ArrayList<Equipo> equipos) {
        ArrayList<Partido> partidos = new ArrayList<>();

        // Generar todos los posibles pares de equipos
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);
                Partido partido = new Partido(equipoLocal, equipoVisitante);
                partidos.add(partido);
            }

        }

        for (int i = 0; i < equipos.size(); i++) {
            for (int j = equipos.size() - 1; j > i; j--) { // Comienza desde el último equipo y termina en i + 1
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);
                Partido partido = new Partido(equipoLocal, equipoVisitante);
                partidos.add(partido);
            }
        }

        return partidos;
    }


    public void realizarPartidos (){
        for (Partido partido : getListaJornadas()) {
            partido.iniciarPartido();
            listaJornadas.add(partido);
        }

    }

    public ArrayList<Partido> getListaJornadas() {
        return listaJornadas;
    }

    public void setListaJornadas(ArrayList<Partido> listaJornadas) {
        this.listaJornadas = listaJornadas;
    }


}

