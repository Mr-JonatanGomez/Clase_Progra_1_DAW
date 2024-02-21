package controller;

import model.Vehiculo;
import model.Deportivo;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> listaVehiculos;

    public Concesionario() {
        listaVehiculos = new ArrayList<>();
    }

    public void acelerarStock() {
        for (Vehiculo item : listaVehiculos) {
            item.acelerar(10);
        }
    }

    public void agregarVehiculos(Vehiculo vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }

    public void listarStock() {
        for (Vehiculo item : listaVehiculos) {
            item.mostrarDatos();
        }
    }

    public void listarDeportivos() {
        for (Vehiculo item : listaVehiculos) {
            if (item instanceof Deportivo) {// istanceof es para ver lo que hay detras del new al crear el OBEJTO
                item.mostrarDatos();
            }
        }
    }

}

