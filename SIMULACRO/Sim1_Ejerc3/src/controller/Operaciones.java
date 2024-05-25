package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Estudiante;

import java.io.*;
import java.util.ArrayList;

@Getter@Setter
@NoArgsConstructor
public class Operaciones {
    public void leerFichero(){
        File file = new File("src/resources/estudiantes.txt");
        BufferedReader bufferedReader= null;
        ArrayList<Estudiante>listadoAlumnosPorFichero = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea="";
            String[] separa=linea.split(",");
            while((linea= bufferedReader.readLine())!=null){
                System.out.println(linea);
                Estudiante estudiante=new Estudiante(separa[0],Integer.valueOf(separa[1]),Double.valueOf(separa[2]),Double.valueOf(separa[3]),Double.valueOf(separa[4]));
                listadoAlumnosPorFichero.add(estudiante);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error not found");
        } catch (IOException e) {
            System.err.println("Error lectura");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error cerrado");
            }
        }
    }
}
