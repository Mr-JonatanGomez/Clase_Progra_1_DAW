package model;

import java.util.Scanner;

public class Carrera {

    private Coche coche1, coche2, coche3;
    private String ganador;
    private int numeroVueltas = 10, kmCircuito = 637, numeroVueltasDadas = 0;

    public Carrera() {
    }

    public Carrera(Coche coche1, Coche coche2) {// añadir aqui km y vueltas??
        this.coche1 = coche1;
        this.coche2 = coche2;
// añadir aqui Scanner para nº de vueltas y km del circuito
    }

    public Carrera(Coche coche1, Coche coche2, Coche coche3) {// añadir aqui km y vueltas??
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.coche3 = coche3;
// añadir aqui Scanner para nº de vueltas y km del circuito
    }

    public void iniciarCarrera() {
        boolean raceOver = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Jungle-Race, Break on through to the other win\n" +
                "The cars for this race: \n");
        coche1.mostrarDatos();
        System.out.println();
        coche2.mostrarDatos();

        numeroVueltasDadas = 0;

        // esta hecho solo por km, tengo que implementar las vueltas quizas con un fori de vueltas y aceleron
        do {

            System.out.println("Introduce que aceleracion tendrán los coches");
            //int aceleracion= sc.nextInt();

            int aceleracion = 15;//PARA PROBAR luego devolver el sc.nextInt
            coche1.aceleron(aceleracion);
            coche2.aceleron(aceleracion);

            numeroVueltasDadas++;
            System.out.println("Km recorriodps por coche1 son:" + coche1.getKmRecorridos());
            System.out.println("Km recorriodps por coche2 son: " + coche2.getKmRecorridos());
            System.out.println("Llevamos " + numeroVueltasDadas + " vueltas terminadas");
//COMIENZO DE PRUEBA
            if (coche1.getKmRecorridos()>kmCircuito && numeroVueltasDadas>=numeroVueltas){
                raceOver=true;
            } else if (coche2.getKmRecorridos()>kmCircuito&& numeroVueltasDadas>=numeroVueltas) {
                raceOver=true;
            }//else?
            System.out.println();

        } while (!raceOver);
        //} while (numeroVueltasDadas < numeroVueltas); VOY A PROBAR OTRAS




        if (coche1.getKmRecorridos() > kmCircuito && coche1.getKmRecorridos()>coche2.getKmRecorridos()) {
            System.out.println("The WINNER is " + coche1.getMatricula());
            coche1.mostrarDatos();
            coche1.getKmRecorridos();
        } else if (coche2.getKmRecorridos() > kmCircuito && coche2.getKmRecorridos()>coche1.getKmRecorridos()) {
            System.out.println("The WINNER is " + coche2.getMatricula());
            coche2.mostrarDatos();
            coche2.getKmRecorridos();
        }
    }
}


