package controller;

import lombok.Getter;
import lombok.Setter;
import model.Jugador;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class JuegoYGuardadoFicheros {
    private Jugador jugador;
    private ArrayList<Jugador> listadoJugadores;
    private int mejorRecord = 150;

    public JuegoYGuardadoFicheros() {
        this.listadoJugadores = new ArrayList<>();
    }

    public void crearFicheros() {
        File fileRecord = new File("src/resources/recordMaximo.obj");
        File fileHistorial = new File("src/resources/historialJugadores.obj");
        if (!fileRecord.exists()) {
            try {
                fileRecord.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
        if (!fileHistorial.exists()) {
            try {
                fileRecord.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
    }

    public void partida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String nombre = sc.next();
        Jugador jugador = new Jugador(nombre);


        int numeroAleatorio;
        int intentos = 0;
        int numeroUser = 0;
        int puntosPartida = -1;
        int recordActual = -1;

        numeroAleatorio = (int) (Math.random() * 20) + 1;
        System.out.println(numeroAleatorio);
        do {


            intentos++;
            do {
                System.out.println("Introduce numero entre el 1 y el 20");
                numeroUser= sc.nextInt();
                if (numeroUser < 1 || numeroUser > 20) {
                    System.err.println("Numero fuera del rango del juego");
                }
            } while (numeroUser < 1 || numeroUser > 20);

            if (numeroUser==numeroAleatorio){
                System.out.println("Enhorabuena, has acertado el número oculto (" + numeroAleatorio + ") en un total de " + intentos);
                puntosPartida = intentos;

                jugador.setPuntuacionActual(intentos);
            }

        } while (numeroUser!= numeroAleatorio);
    }

}
