package controller;

import model.Libro;

import java.io.*;
import java.util.ArrayList;

public class OperacionesFicheroObj {

    public void borrarObj(){
        File file = new File("src/resources/libros.obj");//ruta
        if (file.exists()){
            //si archhivo existe y es archivo (no directory)
            file.delete();
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero");
            }
        }

    }
    public void crearObjLibros(){
        File file = new File("src/resources/libros.obj");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
    }
    public void leerFichero() {
        ObjectInputStream objectInputStream = null;
        File file = new File("src/resources/libros.obj");


        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Libro> listaLibrosEnCatalogo = (ArrayList<Libro>) objectInputStream.readObject();

            for (Libro item : listaLibrosEnCatalogo) {
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
            System.out.println("El catalogo no esta creado nulo y no se puede leer fichero");
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
