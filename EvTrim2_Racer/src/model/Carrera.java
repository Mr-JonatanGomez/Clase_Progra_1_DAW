package model;

import java.util.Scanner;

public class Carrera {

    private Coche coche1, coche2, coche3;
    private String ganador, nombreCircuito;
    private int numeroVueltas = 10, kmCircuito = 637, numeroVueltasDadas = 0;

    public Carrera() {
    }

    public Carrera(String nombreCircuito, Coche coche1, Coche coche2) {// añadir aqui km y vueltas??
        this.nombreCircuito= nombreCircuito;
        this.coche1 = coche1;
        this.coche2 = coche2;
// añadir aqui Scanner para nº de vueltas y km del circuito
    }


    public void iniciarCarrera() {
        boolean raceOver = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Los participantes son:\n\n");
        coche1.mostrarDatos();
        System.out.println();
        coche2.mostrarDatos();
        System.out.println();

        System.out.println("\uD83D\uDEA5 COMIENZA LA CARRERA \uD83D\uDEA5");

        numeroVueltasDadas = 0;

        // esta hecho solo por km, tengo que implementar las vueltas quizas con un fori de vueltas y aceleron
        do {


            //int aceleracion= sc.nextInt();

            int aceleracion = (int) (Math.random() * 50) + 10;
            System.out.println("Los coches han acelerado en esta vuelta: " + aceleracion);
            coche1.aceleron(aceleracion);
            coche2.aceleron(aceleracion);

            numeroVueltasDadas++;

            System.out.println("El coche 1 lleva :" + coche1.getKmRecorridos()+" km recorridos"+" y una velocidad de "+ coche1.getVelocidad());
            System.out.println("El coche 2 lleva :" + coche2.getKmRecorridos()+" km recorridos"+" y una velocidad de "+ coche2.getVelocidad());
            System.out.println("Llevamos " + numeroVueltasDadas + " vueltas terminadas");
            if (coche1.getKmRecorridos()> coche2.getKmRecorridos()){
                System.out.println(coche1.getMatricula()+" va en cabeza, con una ventaja de "+ (coche1.getKmRecorridos()- coche2.getKmRecorridos())+" km");
            } else {
                System.out.println(coche2.getMatricula()+" va en cabeza, con una ventaja de "+ (coche2.getKmRecorridos()- coche1.getKmRecorridos())+" km");
            }

//COMIENZO DE PRUEBA
            if (coche1.getKmRecorridos() > kmCircuito || numeroVueltasDadas == numeroVueltas) {
                raceOver = true;
            } else if (coche2.getKmRecorridos() > kmCircuito || numeroVueltasDadas == numeroVueltas) {
                raceOver = true;
            }//else?
            System.out.println();

        } while (!raceOver);

        System.out.println("\uD83C\uDFC1 LA CARRERA HA FINALIZADO \uD83C\uDFC1");

        if (coche1.getKmRecorridos() > kmCircuito && coche1.getKmRecorridos() > coche2.getKmRecorridos()) {
            ganador = coche1.getMatricula();
            System.out.println("The WINNER is \uD83C\uDFC6 " + ganador+" \uD83C\uDFC6");
            coche1.mostrarDatos();

        } else if (coche2.getKmRecorridos() > kmCircuito && coche2.getKmRecorridos() > coche1.getKmRecorridos()) {
            ganador = coche2.getMatricula();
            System.out.println("The WINNER is \uD83C\uDFC6 " + ganador+" \uD83C\uDFC6");
            coche2.mostrarDatos();

        }
    }

    public void mostrarDatos() {
        System.out.println(nombreCircuito);
        System.out.println(kmCircuito + " km");
        System.out.println(numeroVueltas + " vueltas");
    }
}


