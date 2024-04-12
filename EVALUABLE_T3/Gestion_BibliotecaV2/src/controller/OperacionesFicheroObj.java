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
}
