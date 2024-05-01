import controller.JuegoYFicheros;
import model.Jugador;

import java.util.Scanner;

public class MainAdivina {
    public static void main(String[] args) {

        JuegoYFicheros juegoYFicheros = new JuegoYFicheros();

        juegoYFicheros.leerRecordPersonales();//lee los records de cada
        juegoYFicheros.partida();


    }
}
