package controller;

import lombok.Getter;
import lombok.Setter;
import model.Jugador;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class JuegoYFicheros {
    private ArrayList<Jugador> listaJugadores;
    private Jugador jugador;
    private int mejorRecord=150;

    public void leerRecordActual() {

    }

    public void crearFicheroObj() {
        File file = new File("src/resources/record.obj");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
    }

    public void escribirObjetoJugador(Jugador jugador) {
        //ObjectOutputStream - FileOutputStream -file
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;

        File file = new File("src/resources/record.obj");
        File file2 = new File("src/resources/historial.obj");

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file2, true));
//INSCRIBIR RECORD
            if (jugador.getPuntuacionAct() < mejorRecord) {
                objectOutputStream.writeObject(jugador);
            }
//INSCRIBIR HISTORIAL RECORD PERSONAL con arrayList
            objectOutputStream2.writeObject(jugador);

        } catch (IOException e) {
            System.err.println("Error en IO");
        }catch (NullPointerException e) {
            System.err.println("jugador no existe aun");
        }  finally {
            try {
                assert objectOutputStream != null;
                objectOutputStream.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }
        }

    }

    public void leerQuienRecordTotal() {
        //ObjectOutputStream - FileOutputStream -file
        ObjectInputStream objectInputStream = null;

        File file = new File("src/resources/record.obj");

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            Jugador jugador = (Jugador) objectInputStream.readObject();
            mejorRecord = jugador.getRecordPersonal();
            System.out.println("🏆 El record actual lo ostenta:");

            jugador.mostrarDatos();

            System.out.println("SI QUIERES SER EL MEJOR, REBAJA LA CIFRA\n");

        } catch (IOException e) {
            System.err.println("Error en IO");
        } catch (ClassNotFoundException e) {
            System.err.println("Class no encontrada");
        }catch (NullPointerException e) {
            System.err.println("NullObject");
        }  finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }catch (NullPointerException e) {
                System.err.println("Error de cerrado por objeto nulo");
            }
        }

    }

    public void leerRecordPersonales(){
        //ObjectOutputStream - FileOutputStream -file
        ObjectInputStream objectInputStream = null;

        File file = new File("src/resources/historial.obj");

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            Jugador jugador = (Jugador) objectInputStream.readObject();
            mejorRecord = jugador.getRecordPersonal();
            System.out.println("🏆 Los records personales de cada jugador son:");

            jugador.mostrarDatos();


        } catch (IOException e) {
            System.err.println("Error en IO");
        } catch (ClassNotFoundException e) {
            System.err.println("Class no encontrada");
        }catch (NullPointerException e) {
            System.err.println("NullObject");
        }  finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }catch (NullPointerException e) {
                System.err.println("Error de cerrado por objeto nulo");
            }
        }

    }


    public void partida() {
        leerQuienRecordTotal();
        crearFicheroObj();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del jugador");
        String nombre = sc.next();
        Jugador jugador = new Jugador(nombre);


        int numeroAleatorio;
        int intentos = 0;
        int numeroUser = 0;
        int record = -1;
        int recordActual = -1;

        numeroAleatorio = (int) (Math.random() * 20) + 1;
        //System.out.println(numeroAleatorio);


        do {

            intentos++;
            do {
                System.out.println("Introduce un numero (1-50) intentando adivinar el número oculto");
                numeroUser = sc.nextInt();
                if(numeroUser <1 || numeroUser > 50){
                    System.err.println("numero invalido sobrepasa limite");
                }
            } while(numeroUser <1 || numeroUser > 50);


            if (numeroUser == numeroAleatorio) {
                System.out.println("Enhorabuena, has acertado el número oculto ("+ numeroAleatorio+") en un total de " + intentos);
                record = intentos;

                jugador.setPuntuacionAct(intentos);

            }

        } while (numeroUser != numeroAleatorio);
        //guardar mejor record del jugador si su puntuacion supera su record
        if (jugador.getPuntuacionAct()<jugador.getRecordPersonal()){
            jugador.setRecordPersonal(jugador.getPuntuacionAct());
        }

        if (jugador.getRecordPersonal()<mejorRecord){
            escribirObjetoJugador(jugador);
        }


    }

    public JuegoYFicheros(ArrayList<Jugador> listaJugadores, Jugador jugador, int mejorRecord) {
        this.listaJugadores = new ArrayList<>();
        this.jugador = jugador;
        this.mejorRecord = mejorRecord;
    }

    public JuegoYFicheros() {
        this.listaJugadores = new ArrayList<>();
    }
}
