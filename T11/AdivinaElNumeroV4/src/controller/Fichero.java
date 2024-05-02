package controller;

import model.Jugador;

import java.io.*;

public class Fichero {
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

    public void guardarRecord (Jugador jugador){
      //  var guardarRecord = new ObjectOutputStream();
        ObjectOutputStream fileRecord = null;
        File file = new File("src/resources/recordMaximo.obj");


        try {
            fileRecord=new ObjectOutputStream(new FileOutputStream(file));
            fileRecord.writeObject(jugador);
        } catch (IOException e) {
            System.err.println("error en la escritura");//
        } catch (NullPointerException e){
            System.err.println("error NullPointer");
        } finally {
            try {
                assert fileRecord != null;
                fileRecord.close();
            } catch (IOException e) {
                System.err.println("Error en cierre de fichero");
            }
        }
    }

    public void leerRecord(){
        //HACER SIEMPRE AL COMENZAR PARTIDA para IGUALAR RECORD
        ObjectInputStream objectRecord = null;
        File file = new File("src/resources/recordMaximo.obj");

        try {
            objectRecord = new ObjectInputStream(new FileInputStream(file));
            Jugador jugador= (Jugador) objectRecord.readObject();
            jugador.getRecordPersonal();
        } catch (IOException e) {
            System.err.println("Error en la lectura");
        } catch (ClassNotFoundException e) {
            System.err.println("Error Class Not Found");
        }
    }
    public void guardarHistorial (Jugador jugador){
        //  var guardarRecord = new ObjectOutputStream();
        ObjectOutputStream fileHistorial = null;
        File file = new File("src/resources/recordMaximo.obj");


        try {
            fileHistorial=new ObjectOutputStream(new FileOutputStream(file, true));
            fileHistorial.writeObject(jugador);
        } catch (IOException e) {
            System.err.println("error en la escritura");//
        } catch (NullPointerException e){
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

    public void leerQuienRecordTotal() {
        //ObjectOutputStream - FileOutputStream -file
        ObjectInputStream objectInputStream = null;

        File file = new File("src/resources/recordMaximo.obj");

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            Jugador jugador = (Jugador) objectInputStream.readObject();
           // mejorRecord = jugador.getRecordPersonal();
            System.out.println("🏆 El record actual lo ostenta:");

            jugador.mostrarDatos();


        } catch (IOException e) {
            System.err.println("Error en IO");
        } catch (ClassNotFoundException e) {
            System.err.println("Class no encontrada");
        } catch (NullPointerException e) {
            System.err.println("NullObject");
        } finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado flujo");
            } catch (NullPointerException e) {
                System.err.println("Error de cerrado por objeto nulo");
            }
        }

    }
}
