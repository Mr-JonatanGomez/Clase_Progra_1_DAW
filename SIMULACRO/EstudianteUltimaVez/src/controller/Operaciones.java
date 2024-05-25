package controller;

import model.Estudiante;

import java.io.*;
import java.util.ArrayList;

public class Operaciones {

    ArrayList<Estudiante>listadoEstudiantesPorFichero=new ArrayList<>();
    public void leerFichero(){
        File file = new File("src/resources/estudiantes.txt");
        BufferedReader bufferedReader= null;

        try {
            bufferedReader= new BufferedReader(new FileReader(file));
            String linea;
            while((linea= bufferedReader.readLine())!=null){

                String[]estudianteLinea= linea.split(",");
                Estudiante estudiante= new Estudiante(estudianteLinea[0],Integer.valueOf(estudianteLinea[1]),Double.valueOf(estudianteLinea[2]),Double.valueOf(estudianteLinea[3]),Double.valueOf(estudianteLinea[4]));
                listadoEstudiantesPorFichero.add(estudiante);
            }

            System.out.println("LEYENDO ESTUDIANTES CON ARRAYLIST SACADO DEL FICHERO");
            for (Estudiante item:listadoEstudiantesPorFichero) {
                System.out.println(item.toString());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error File not Foiund");
        } catch (IOException e) {
            System.err.println("Error lectura");
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error cerrado");
            }
        }
    }



}
