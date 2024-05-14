package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
@NoArgsConstructor
public class Operaciones2Rememory {

    public void leerFichero(){
        File file= new File("src/resources/fichero.txt");

        BufferedReader bufferedReader= null;

        try {
            bufferedReader= new BufferedReader(new FileReader(file));
            String linea;
            while((linea = bufferedReader.readLine())!=null){

                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado");

        } catch (IOException e) {
            System.err.println("Error de lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("IO error");
            }
        }
    }
}
