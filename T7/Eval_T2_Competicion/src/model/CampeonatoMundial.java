package model;

import java.util.ArrayList;

public class CampeonatoMundial {
    private ArrayList<Coche> listaCoches;
    private ArrayList<CarreraCircuito> listaCircuitos;




    public CampeonatoMundial (){
        this.listaCircuitos=new ArrayList<>();
        this.listaCoches= new ArrayList<>();
    }

    public void agregarCarrera(CarreraCircuito carrera){
        this.listaCircuitos.add(carrera);
        carrera.mostrarDatosCircuito();
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
