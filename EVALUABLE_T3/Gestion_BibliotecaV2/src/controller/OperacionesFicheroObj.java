package controller;

import model.Libro;

import java.io.*;
import java.util.ArrayList;

public class OperacionesFicheroObj {

    public void escrituraLibros(){
        ObjectOutputStream objectOutputStream= null;
        File file = new File("src/resources/libros.obj");

        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
            ArrayList<Libro> listaObj = new ArrayList<>();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void borrarCrearObj(){
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
}
