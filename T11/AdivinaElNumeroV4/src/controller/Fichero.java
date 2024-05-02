package controller;

import model.Jugador;

import java.io.*;
import java.util.ArrayList;

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

    public void leerFicheroArray() {
        ObjectInputStream objectInputStream = null;
        File file = new File("src/resources/historialJugadores.obj");


        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Jugador> listadoJugadores = (ArrayList<Jugador>) objectInputStream.readObject();

            for (Jugador item : listadoJugadores) {
                item.mostrarDatos();
            }

                /*Libro item = (Libro) objectInputStream.readObject();

                while ((item = (Libro) objectInputStream.readObject()) != null) {
                    System.out.println(item);
                }*/

        } catch (IOException e) {
            System.out.println("El objeto no existe o no se puede leer");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en casteo de clase");
        } catch (ClassCastException e) {
            System.out.println("Error en casteo de clase (metodo LEERficheroCAT)");
        } catch (NullPointerException e) {
            System.out.println("El catalogo no esta creado, es nulo y no se puede leer fichero");
        } finally {
            try {
                if (objectInputStream!=null){
                    objectInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            } finally {
                System.out.println("Cerrado a Nulo");
            }
        }

    }
ArrayList<Jugador>listadoJugadores;
    public void escribirHistorial() {
        ObjectOutputStream objectOutputStream = null;
        File file = new File("src/resources/historialJugadores.obj");

        try {
            //PROBANDO SIN EL TRUE BORRA AL METER 2 libros en una vez
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));//, true
            //EL TRUE ES PARA NO SOBREESCRIBIR, NO HCAE FALTA PERO QUIERO PROBARLO
            objectOutputStream.writeObject(listadoJugadores);


        } catch (IOException e) {
            System.err.println("Error en la salida del file.obj");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar flujo");
            } catch (NullPointerException e) {
                //lo he dejado vacio, porque siempre imprime cerrado a nulo, sin ser cierto
                System.out.println("");
            }
        }

    }

    public void guardarHistorialArray() {
        ObjectOutputStream objectOutputStream = null;
        File file = new File("src/resources/historialJugadores.obj");

        try {
            //PROBANDO SIN EL TRUE BORRA AL METER 2 libros en una vez
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));//, true
            //EL TRUE ES PARA NO SOBREESCRIBIR, NO HCAE FALTA PERO QUIERO PROBARLO
            objectOutputStream.writeObject(listadoJugadores);


        } catch (IOException e) {
            System.err.println("Error en la salida del file.obj");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar flujo");
            } catch (NullPointerException e) {
                //lo he dejado vacio, porque siempre imprime cerrado a nulo, sin ser cierto
                System.out.println("");
            }
        }

    }
    public void leerHistorialArray() {
        ObjectInputStream objectInputStream = null;
        File file = new File("src/resources/historialJugadores.obj");


        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Jugador> listadoJugadores = (ArrayList<Jugador>) objectInputStream.readObject();

            for (Jugador item : listadoJugadores) {
                item.mostrarDatos();
            }

                /*Libro item = (Libro) objectInputStream.readObject();

                while ((item = (Libro) objectInputStream.readObject()) != null) {
                    System.out.println(item);
                }*/

        } catch (IOException e) {
            System.out.println("El objeto no existe o no se puede leer");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en casteo de clase");
        } catch (ClassCastException e) {
            System.out.println("Error en casteo de clase (metodo LEERficheroCAT)");
        } catch (NullPointerException e) {
            System.out.println("El catalogo no esta creado, es nulo y no se puede leer fichero");
        } finally {
            try {
                if (objectInputStream!=null){
                    objectInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            } finally {
                System.out.println("Cerrado a Nulo");
            }
        }

    }
}
