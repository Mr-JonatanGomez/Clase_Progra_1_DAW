package model;

import java.util.ArrayList;
import java.util.Comparator;

public class CampeonatoMundial {
    private ArrayList<Coche> listaCoches;
    private ArrayList<CarreraCircuito> listaCircuitos;

    private ArrayList<CarreraCircuito>listadoCarrerasPRUEBA;
    private ArrayList<CarreraCircuito>listadoCochesPRUEBA;

    public CampeonatoMundial() {
        this.listaCircuitos = new ArrayList<>();
        this.listaCoches = new ArrayList<>();
    }
//VAMOS A VER
    private ArrayList<CarreraCircuito>generarCarreras(CarreraCircuito carreraCircuito){
        ArrayList<CarreraCircuito>carreras=new ArrayList<>();

        return carreras;
    }



    public void agregarCarrera(CarreraCircuito carrera) {//OBSOLETO POR EL DE ABAJO
        this.listaCircuitos.add(carrera);
        carrera.mostrarDatosCircuito();

    }

    public void agregarCarrerasYdisputarlas(CarreraCircuito... carreras) {
        for (CarreraCircuito carrera:carreras) {
            this.listaCircuitos.add(carrera);
            carrera.mostrarDatosCircuito();
            carrera.iniciarCarrera(carrera);
        }

    }
    public void agregarCarrerasYdisputarlasPRUEBAS(CarreraCircuito... carreras) {
        for (CarreraCircuito carrera:carreras) {
            this.listadoCarrerasPRUEBA.add(carrera);
            carrera.mostrarDatosCircuito();
            carrera.iniciarCarrera(carrera);
        }

    }

    public void inscribirCoches(Coche... coches) {
        for (Coche coche : coches) {
            for (CarreraCircuito carrera : listaCircuitos) {
                carrera.inscribirCoche(coche);
            }
        }
        for (Coche coche : coches) {
            coche.mostrarDatosCoche();
        }
    }

    public void iniciarCarreras(CarreraCircuito... carreras) {

            for (CarreraCircuito carrera : listaCircuitos) {
                carrera.iniciarCarrera(carrera);
                carrera.clasificacionCarrera(carrera);

        }

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

    public ArrayList<CarreraCircuito> getListadoCarrerasPRUEBA() {
        return listadoCarrerasPRUEBA;
    }

    public void setListadoCarrerasPRUEBA(ArrayList<CarreraCircuito> listadoCarrerasPRUEBA) {
        this.listadoCarrerasPRUEBA = listadoCarrerasPRUEBA;
    }

    public ArrayList<CarreraCircuito> getListadoCochesPRUEBA() {
        return listadoCochesPRUEBA;
    }

    public void setListadoCochesPRUEBA(ArrayList<CarreraCircuito> listadoCochesPRUEBA) {
        this.listadoCochesPRUEBA = listadoCochesPRUEBA;
    }
}
