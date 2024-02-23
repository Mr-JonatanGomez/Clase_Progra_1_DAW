package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Carrera {


    private Coche coche1, coche2, coche3;
    private String ganador, nombreCircuito;
    private int numeroVueltas, kmCircuito, numeroVueltasDadas;

    private ArrayList<Coche> listadoCoches;

    public Carrera() {
    }

    public Carrera(String nombreCircuito, Coche coche1, Coche coche2) {// añadir aqui km y vueltas??
        this.nombreCircuito= nombreCircuito;
        this.coche1 = coche1;
        this.coche2 = coche2;

// añadir aqui Scanner para nº de vueltas y km del circuito
    }

// CONSTRUCTOR PARA ARRAY
    public Carrera (String nombreCircuito, int kmCircuito, int numeroVueltas,ArrayList<Coche> listadoCoches){
        this.nombreCircuito=nombreCircuito;
        this.kmCircuito=kmCircuito;
        this.numeroVueltas=numeroVueltas;
        this.numeroVueltasDadas=0;
        this.listadoCoches = listadoCoches;
    }




    public void iniciarCarrera(Carrera carrera) {
        boolean raceOver = false;
        numeroVueltasDadas = 0;

        //foreach para poner los kmRecorridos de coche a 0 y posicion tambien
        for (Coche coche : listadoCoches) {
            coche.setKmRecorridos(0);
            coche.setPosicionCarrera(0);
            coche.setPuntosCarrera(0);

        }
        System.out.println("\uD83D\uDEA5 COMIENZA LA CARRERA \uD83D\uDEA5" + carrera.getNombreCircuito());

        do {
            for (Coche coche : listadoCoches) {
                coche.acelerar((int) Math.random() * 45);
                System.out.println("km recorridos " + coche.getKmRecorridos() + "por el coche de " + coche.getMatricula());
            }
            numeroVueltasDadas++;
            System.out.println(numeroVueltasDadas + " numero vueltas dadas");

            // Condición para terminar la carrera
            if (numeroVueltasDadas >= numeroVueltas) {
                raceOver = true;
            }
        } while (!raceOver);


        //CLASIFICACION
        listadoCoches.sort(new Comparator<Coche>() {
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

        clasificacionCarrera(carrera);
    }

    public void clasificacionCarrera(Carrera carrera){
        int posicion = 1;
        for (Coche coche:listadoCoches) {
            coche.setPosicionCarrera(posicion);
            posicion++;
            //REPARTO DE PUNTOS
            if (coche.getPosicionCarrera()==1){
                coche.setPuntosCarrera(10);
                coche.setPuntosGeneral(coche.getPuntosGeneral()+10);
                //edito los puntos, cogiendo los puntos que tiene y sumando los nuevos
            } else if (coche.getPosicionCarrera()==2) {
                coche.setPuntosCarrera(6);
                coche.setPuntosGeneral(coche.getPuntosGeneral()+6);
            } else if (coche.getPosicionCarrera()==3) {
                coche.setPuntosCarrera(4);
                coche.setPuntosGeneral(coche.getPuntosGeneral()+4);
            } else if (coche.getPosicionCarrera()==4) {
                coche.setPuntosCarrera(2);
                coche.setPuntosGeneral(coche.getPuntosGeneral()+2);
            }else if (coche.getPosicionCarrera()==5) {
                coche.setPuntosCarrera(1);
                coche.setPuntosGeneral(coche.getPuntosGeneral()+1);
            }

        }
        listadoCoches.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getPosicionCarrera()< o2.getPosicionCarrera()) {
                    return -1;
                }else if (o1.getPosicionCarrera()> o2.getPosicionCarrera()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (Coche coche:listadoCoches) {
            coche.mostrarDatosCocheClasfCarrera();

        }

    }

    public void mostrarDatosCarrera() {
        System.out.println("\uD83C\uDFC1"+nombreCircuito+"\uD83C\uDFC1");
        System.out.println(kmCircuito + " km - " + numeroVueltas + " vueltas\n");

    }





    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public Coche getCoche3() {
        return coche3;
    }

    public void setCoche3(Coche coche3) {
        this.coche3 = coche3;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public int getKmCircuito() {
        return kmCircuito;
    }

    public void setKmCircuito(int kmCircuito) {
        this.kmCircuito = kmCircuito;
    }

    public int getNumeroVueltasDadas() {
        return numeroVueltasDadas;
    }

    public void setNumeroVueltasDadas(int numeroVueltasDadas) {
        this.numeroVueltasDadas = numeroVueltasDadas;
    }

    public ArrayList<Coche> getListadoCoches() {
        return listadoCoches;
    }

    public void setListadoCoches(ArrayList<Coche> listadoCoches) {
        this.listadoCoches = listadoCoches;
    }
}



