package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Pelicula;

import java.io.*;
import java.util.ArrayList;

@NoArgsConstructor
@Setter
@Getter
public class Registro {

    private ArrayList<Pelicula>listaPeliculas;

    public Registro(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = new ArrayList<>();
    }

    public void guardarPeliculaFichero(ArrayList<Pelicula>listaPeliculas){
//objectOutput - fileOutput - file
        ObjectOutputStream objectOutputStream = null;
        File file = new File("src/resources/peliculas.obj");

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error en la creacion del archivo");
            }
        }

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
            for (Pelicula item:listaPeliculas) {
                objectOutputStream.writeObject(item);
            }

        } catch (IOException e) {
            System.err.println("Error entrada datos");
        }
    }

    public void leerPeliculaFichero(ArrayList<Pelicula>listaPeliculas){
        //Input-FlieInput-File
        ObjectInputStream objectInputStream= null;
        File file = new File("src/resources/peliculas.obj");

        try {
            objectInputStream= new ObjectInputStream(new FileInputStream(file));
            while((objectInputStream.readObject())!=null){
                System.out.println(objectInputStream.readObject());
            }


        } catch (IOException e) {
            System.err.println("Error de lectura");
        } catch (ClassNotFoundException e) {
            System.err.println("Class NOT found");
        }

    }


}
