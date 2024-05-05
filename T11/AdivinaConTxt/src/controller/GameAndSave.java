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
    private ArrayList<String> listadoJugadores;
    private int mejorRecord = 9999;

    public GameAndSave() {
        this.listadoJugadores = new ArrayList<>();
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
            String[] separarRecord = jugadorYrecord.split(" ");

            // [0] nombre y [1] puntuacion ?? quizas 1 espacio y 2 puntuacion

            int pasandoRecordInt = Integer.parseInt(separarRecord[1]);

            mejorRecord = pasandoRecordInt;//igualamos record leido al mejor guardado, para cuando se inicie el juego

            System.out.println("El actual record lo ostenta: ");
            System.out.println(separarRecord[0] + " acertando el numero oculto en " + separarRecord[1] + " intentos");


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
        // File-Writer-Print
        File file = new File("src/resources/historial.txt");
        PrintWriter printWriter= null;

        try {
            printWriter =new PrintWriter(new FileWriter(file, true));
            // AQUI METER CONDICIONALES LEER RECORD PARA VER SI EXISTE YA ESTE USER...hacer luego
            printWriter.write(jugador.getNombre() + " " + jugador.getRecordPersonal());


        } catch (IOException e) {
            System.err.println("Error en el guardado Out");
        } finally {
            assert printWriter != null;
            printWriter.flush();
            printWriter.close();
        }


    }

    public void leerHistorial() {
        ArrayList<String> listado = new ArrayList<>();
        //HACER SIEMPRE AL COMENZAR PARTIDA para IGUALAR RECORD
        File file = new File("src/resources/historial.txt");
        BufferedReader bufferedReader = null;

        try {


            bufferedReader = new BufferedReader(new FileReader(file));
            String jugadorYrecord = null;
            System.out.println("HISTORIAL");
            while ((jugadorYrecord = bufferedReader.readLine()) != null) {
                //asi leemos mientras no se null, y guardamos a un listado
                listado.add(jugadorYrecord);
            }
            for (String item : listado) {
                System.out.println(item);

            }

            //IGUALAMOS ESTE ARRAY AL COMUN, para que pueda ser usado
            listadoJugadores = listado;


            // String [] separarRecord = jugadorYrecord.split(" ");


            // [0] nombre y [1] puntuacion

            //  int pasandoRecordInt =Integer.parseInt(separarRecord[1]);


            // System.out.println("El actual record lo ostenta: ");
            // System.out.println(separarRecord[0] +" acertando el numero oculto en "+separarRecord[1]+" intentos");


        } catch (FileNotFoundException e) {
            System.err.println("Archivo no existe, y no se puede leer");
        } catch (IOException e) {
            System.err.println("Error en la lectura IO");
        } finally {
            System.out.println("");
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error cerrando el flujo");
            }
        }

    }

    public void comprobarExistenciaJugadorParaRecordANTESGUARDARHISTORIAL() {
        for (String item : listadoJugadores) {
            //psamos cada item a Array
            String[] jugadorYrecord = item.split(" ");
            if (jugador.getNombre().equalsIgnoreCase(jugadorYrecord[0])) {

                // si nombre es igual pasamos los puntos del jugador a String para guardarlos

                String puntos = String.valueOf(jugador.getRecordPersonal());

                // pasamos esos puntos al string
                jugadorYrecord[1] = puntos;


            } else {
                guardarHistorial(jugador);
            }

        }

    }

    public void partida() {
        // antes de iniciar creamos instancia a fichero

        crearFicheros();

        leerHistorial();
        leerRecord();

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

        //comprobarExistenciaJugadorParaRecordANTESGUARDARHISTORIAL();
        guardarHistorial(jugador);
        //guardarHistorial();

    }


}
