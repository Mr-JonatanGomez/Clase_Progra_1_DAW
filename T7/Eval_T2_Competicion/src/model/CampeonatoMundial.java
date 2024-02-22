package model;

import java.util.ArrayList;

public class CampeonatoMundial {
    private ArrayList<Coche> listaCoches;
    private ArrayList<CarreraCircuito> listaCircuitos;



    public CampeonatoMundial (){}
    public void inscribirCoche(Coche coche){
        this.listaCoches.add(coche);
    }
    public void agregarCarrera(CarreraCircuito carrera){
        this.listaCircuitos.add(carrera);
    }
}
