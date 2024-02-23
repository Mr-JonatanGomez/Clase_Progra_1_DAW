package model;

import java.util.ArrayList;
import java.util.Comparator;

public class CarreraCircuito {
    private String nombre;
    private int kmCircuito, numeroVueltas, numeroVueltasDadas;
    private ArrayList<Coche> listaCoches;


    public CarreraCircuito(){
        this.listaCoches = new ArrayList<>();
    }
    public CarreraCircuito(String nombre, int kmCircuito, int numeroVueltas){
        this.nombre=nombre;
        this.kmCircuito=kmCircuito;
        this.numeroVueltas=numeroVueltas;
        this.numeroVueltasDadas=0;
        this.listaCoches = new ArrayList<>();
    }

    public void iniciarCarrera(CarreraCircuito carreraCircuito) {
        boolean raceOver = false;
        numeroVueltasDadas = 0;

        //foreach para poner los kmRecorridos de coche a 0 y posicion tambien
        for (Coche coche : listaCoches) {
            coche.setKmRecorridos(0);
            coche.setPosicionCarrera(0);
            coche.setPuntosCarrera(0);
        }
        System.out.println("\uD83D\uDEA5 COMIENZA LA CARRERA \uD83D\uDEA5" + carreraCircuito.getNombre());

        do {
            for (Coche coche : listaCoches) {
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

clasificacionCarrera(carreraCircuito);
    }

    public void clasificacionCarrera(CarreraCircuito carrera){
        int posicion = 1;
        for (Coche coche:listaCoches) {
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
        listaCoches.sort(new Comparator<Coche>() {
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
        for (Coche coche:listaCoches) {
            coche.mostrarDatosCocheClasfCarrera();

        }

    }

    public void inscribirCoche(Coche coche){
        this.listaCoches.add(coche);
       // coche.mostrarDatosCoche();
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
