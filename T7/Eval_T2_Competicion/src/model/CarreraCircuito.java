package model;

import java.util.ArrayList;
import java.util.Comparator;

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

    public void iniciarCarrera (CarreraCircuito carreraCircuito){
        boolean raceOver = false;
        numeroVueltasDadas=0;
        //foreach para poner los kmRecorridos de coche a 0
        for (Coche coche:listaCoches) {
            coche.setKmRecorridos(0);
        }
        System.out.println("\uD83D\uDEA5 COMIENZA LA CARRERA \uD83D\uDEA5"+carreraCircuito.getNombre());

        do {
            int posicion = 1;
            for (Coche coche:listaCoches) {
                coche.acelerar((int)Math.random()*45);
                System.out.println("km recorridos "+coche.getKmRecorridos());
            }
            numeroVueltasDadas++;
            listaCoches.sort(new Comparator<Coche>() {
                @Override
                public int compare(Coche o1, Coche o2) {
                    if (o1.getKmRecorridos()> o2.getKmRecorridos()){
                        return -1;
                    } else if (o1.getKmRecorridos()< o2.getKmRecorridos()) {
                        return 1;
                    } else{
                        return 0;
                    }

                }
            });
        }while (!raceOver);



    }

    public void mostrarDatosCircuito(){
        System.out.println("\tNombre de la prueba: "+nombre);
        System.out.println("Km del circuito: "+kmCircuito);
        System.out.println("Nº de vueltas: "+numeroVueltas+"\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKmCircuito() {
        return kmCircuito;
    }

    public void setKmCircuito(int kmCircuito) {
        this.kmCircuito = kmCircuito;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public int getNumeroVueltasDadas() {
        return numeroVueltasDadas;
    }

    public void setNumeroVueltasDadas(int numeroVueltasDadas) {
        this.numeroVueltasDadas = numeroVueltasDadas;
    }

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }
}
