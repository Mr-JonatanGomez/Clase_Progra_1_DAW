package model;

import java.util.ArrayList;
import java.util.Comparator;

public class CampeonatoMundial {
    private ArrayList<Coche> listaCoches;
    private ArrayList<CarreraCircuito> listaCircuitos;


    public CampeonatoMundial() {
        this.listaCircuitos = new ArrayList<>();
        this.listaCoches = new ArrayList<>();
    }

    public void agregarCarrera(CarreraCircuito carrera) {
        this.listaCircuitos.add(carrera);
        carrera.mostrarDatosCircuito();
    }

    public void ClasificacionFinal() {
        listaCoches.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getPuntosGeneral() > o2.getPuntosGeneral()) {
                    return -1;
                } else if (o1.getPuntosGeneral() < o2.getPuntosGeneral()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (Coche coche:listaCoches) {
            coche.mostrarDatosCocheClasfCarrera();

        }
    }


    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public ArrayList<CarreraCircuito> getListaCircuitos() {
        return listaCircuitos;
    }

    public void setListaCircuitos(ArrayList<CarreraCircuito> listaCircuitos) {
        this.listaCircuitos = listaCircuitos;
    }
}
