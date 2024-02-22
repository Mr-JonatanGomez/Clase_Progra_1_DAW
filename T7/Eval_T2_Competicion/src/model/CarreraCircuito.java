package model;

import java.util.ArrayList;

public class CarreraCircuito {
    private String nombre;
    private int kmCircuito, numeroVueltas, numeroVueltasDadas;
    private ArrayList<Coche> listaCoches;

    public CarreraCircuito(){}
    public CarreraCircuito(String nombre, int kmCircuito, int numeroVueltas){
        this.nombre=nombre;
        this.kmCircuito=kmCircuito;
        this.numeroVueltas=numeroVueltas;
        this.numeroVueltasDadas=0;
    }
}
