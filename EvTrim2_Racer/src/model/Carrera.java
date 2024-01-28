package model;

import java.util.Scanner;

public class Carrera {

    private Coche coche1, coche2;
    private String ganador;
    private int numeroVueltas=10, kmCircuito=637;

    public Carrera() {
    }

    public Carrera(Coche coche1, Coche coche2) {// añadir aqui km y vueltas??
        this.coche1 = coche1;
        this.coche2 = coche2;
// añadir aqui Scanner para nº de vueltas y km del circuito
    }

    public void iniciarCarrera (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to the Jungle-Race, Break on through to the other win\n" +
                "The cars for this race: \n");
        coche1.mostrarDatos();
        System.out.println();
        coche2.mostrarDatos();

        // esta hecho solo por km, tengo que implementar las vueltas quizas con un fori de vueltas y aceleron
        do {

            System.out.println("Introduce que aceleracion tendrán los coches");
            int aceleracion= sc.nextInt();
            coche1.aceleron(aceleracion);
            coche2.aceleron(aceleracion);
        }while (coche1.getKmRecorridos()<kmCircuito || coche2.getKmRecorridos()<kmCircuito);

        if (coche1.getKmRecorridos()>= kmCircuito && coche2.getKmRecorridos()>= kmCircuito){
            System.out.println("The Race is DRAW");
            coche1.mostrarDatos();
        } else if (coche1.getKmRecorridos()>= kmCircuito) {
            System.out.println("The WINNER is ");
            coche1.mostrarDatos();
            System.out.println("Realizó "+coche1.getKmRecorridos());
        } else if (coche2.getKmRecorridos()>= kmCircuito) {
            System.out.println("The WINNER is ");
            coche2.mostrarDatos();
            System.out.println("Realizó "+coche2.getKmRecorridos());
        }
    }

}


