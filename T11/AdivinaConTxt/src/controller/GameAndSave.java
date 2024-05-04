package controller;

import lombok.Getter;
import lombok.Setter;
import model.Jugador;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@Getter
@Setter
public class GameAndSave {
    private Jugador jugador;
    private ArrayList<Jugador> listadoJugadores;
    private int mejorRecord = 9999;

    public GameAndSave() {

    }

    public void crearFicheros() {
        File fileRecord = new File("src/resources/record.txt");
        File fileHistorial = new File("src/resources/historial.txt");
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

    public void guardarRecord(Jugador jugador) {
        //  file-fileWrite-PrintWrite

        File file = new File("src/resources/record.txt");

        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.write(jugador.getNombre() + " " + jugador.getRecordPersonal());
        } catch (IOException e) {
            System.err.println("Error en la escritura de datos");
        } finally {
            assert printWriter != null;
            printWriter.close();
        }


    }

    public void leerRecord() {
        //HACER SIEMPRE AL COMENZAR PARTIDA para IGUALAR RECORD

        File file = new File("src/resources/record.txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String jugadorYrecord;
            jugadorYrecord = bufferedReader.readLine();
            String [] separarRecord = jugadorYrecord.split(" ");

            // [0] nombre y [1] puntuacion

            int pasandoRecordInt =Integer.parseInt(separarRecord[1]);

            mejorRecord = pasandoRecordInt;//igualamos record leido al mejor guardado, para cuando se inicie el juego

            System.out.println("El actual record lo ostenta: ");
            System.out.println(separarRecord[0] +" acertando el numero oculto en "+separarRecord[1]+" intentos");




        } catch (FileNotFoundException e) {
            System.err.println("Archivo no existe, y no se puede leer");
        } catch (IOException e) {
            System.err.println("Error en la lectura IO");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error cerrando el flujo");
            }
        }


    }

    public void guardarHistorial(Jugador jugador) {
        //  var guardarRecord = new ObjectOutputStream();
        ObjectOutputStream fileHistorial = null;
        File file = new File("src/resources/historialJugadores.obj");


        try {
            fileHistorial = new ObjectOutputStream(new FileOutputStream(file, true));
            fileHistorial.writeObject(jugador);
        } catch (IOException e) {
            System.err.println("error en la escritura");//
        } catch (NullPointerException e) {
            System.err.println("error NullPointer");
        } finally {
            try {
                assert fileHistorial != null;
                fileHistorial.close();
            } catch (IOException e) {
                System.err.println("Error en cierre de fichero");
            }
        }
    }

    public void leerHistorial() {
        //HACER SIEMPRE AL COMENZAR PARTIDA para IGUALAR RECORD
        ObjectInputStream leerHistorial = null;
        File file = new File("src/resources/historialJugadores.obj");

        try {
            leerHistorial = new ObjectInputStream(new FileInputStream(file));

            Jugador jugador = (Jugador) leerHistorial.readObject();
            //mejorRecord = jugador.getRecordPersonal();//igualamos record al mejor guardado
            System.out.println("Los records de los participantes son: ");
            System.out.println(jugador.getNombre() + "\tacertó el numero oculto en " + jugador.getRecordPersonal() + " intentos");

/*
            jugador = null;
            while ((jugador = (Jugador) leerHistorial.readObject()) != null) {
                System.out.println(jugador);
            }
*/


        } catch (IOException e) {
            System.err.println("");
        } catch (NullPointerException e) {
            System.err.println("Error Null Pointer");
        } catch (ClassCastException e) {
            System.err.println("Error Class Cast");
        } catch (ClassNotFoundException e) {
            System.err.println("Error Class Not Found");
        } finally {
            try {
                assert leerHistorial != null;
                leerHistorial.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar flujo lectura");
            } catch (NullPointerException e) {
                System.err.println("1ª PARTIDA, NO EXISTE RECORD");
            }
        }
    }


    public void partida() {
        // antes de iniciar creamos instancia a fichero

        crearFicheros();

        //leerHistorial();
        // leerRecord();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String nombre = sc.next();
        Jugador jugador = new Jugador(nombre);


        int numeroAleatorio;
        int intentos = 0;
        int numeroUser = 0;
        int puntosPartida = -1;


        numeroAleatorio = (int) (Math.random() * 20) + 1;
        System.out.println(numeroAleatorio);
        do {


            intentos++;
            do {
                System.out.println("Introduce numero entre el 1 y el 20");
                numeroUser = sc.nextInt();
                if (numeroUser < 1 || numeroUser > 20) {
                    System.err.println("Numero fuera del rango del juego");
                }
            } while (numeroUser < 1 || numeroUser > 20);

            if (numeroUser == numeroAleatorio) {
                System.out.println("Enhorabuena, has acertado el número oculto (" + numeroAleatorio + ") en un total de " + intentos);
                puntosPartida = intentos;

                jugador.setPuntuacionPartidaActual(intentos);
            }

        } while (numeroUser != numeroAleatorio);

        // SI SUPERA RECORD PERSONAL LO ESTABLECEMOS
        if (jugador.getPuntuacionPartidaActual() < jugador.getRecordPersonal()) {
            jugador.setRecordPersonal(jugador.getPuntuacionPartidaActual());

        }

        //SI SE SUPERA EL RECORD INSCRIBIR RECORD
        if (jugador.getPuntuacionPartidaActual() <= mejorRecord) {
            guardarRecord(jugador);
        }

        // DE CUALQUIER MODO LO INSCRIBIMOS AL HISTORIAL
        // A FUTURO:
        // -SIEMPRE SI NO HAY NADIE CON ESE NOMBRE
        // -SI EXISTE, SOLO SI MEJORA RECORD

        //guardarHistorial(jugador);
        //guardarHistorial();

    }

}
