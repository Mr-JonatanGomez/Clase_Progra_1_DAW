package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Pelicula;

import java.io.*;
import java.util.ArrayList;

@Setter
@Getter
public class OperacionFichero {
    ArrayList<Pelicula>listadoPorFichero;

    public OperacionFichero() {
        listadoPorFichero=new ArrayList<>();

    }

    public void leerPeliculas(){
        File file = new File("src/resources/peliculas.txt");
        BufferedReader bufferedReader=null;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            String linea;
            while((linea= bufferedReader.readLine())!=null){
                String[]deparado=linea.split(",");
                Pelicula pelicula= new Pelicula(deparado[0],deparado[1],Double.valueOf(deparado[2]),Double.valueOf(deparado[3]),Double.valueOf(deparado[4]) );
                listadoPorFichero.add(pelicula);

            }
            for (Pelicula peli:listadoPorFichero) {
                peli.calcularNotaMedia();
                System.out.println(peli.toString());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Error de lectura");
        }

    }
}
