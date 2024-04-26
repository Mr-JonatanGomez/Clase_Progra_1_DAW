package controller;

import java.io.*;

public class Lector {
    public Lector() {
    }

    public void lectorTexto() {
        //FILE - FILE READER -FILE BUFFERED
        File file = new File("src/resources/texto.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            // SACAR EL TEXTO
            String linea = bufferedReader.readLine();
            System.out.println(linea);

            System.out.println("\nEl numero de caracteres es: " + linea.length());

            String[] palabras = linea.split(" ");
            System.out.println("\nEl numero de palabras es: " + palabras.length);
            //System.out.println(palabras[90]);


            String[] oraciones = linea.split("\\.");
            System.out.println("\nEl numero de oraciones es: " + oraciones.length);
int contador=1;
            for (String item:oraciones) {
                System.out.println("FRASE "+contador);
                System.out.println(item);
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("No existe el archivo");
        } catch (IOException e) {
            System.err.println("No se pudo leer");
        }
    }

    public void lectorTextoContadorLetras() {
        //FILE - FILE READER -FILE BUFFERED
        File file = new File("src/resources/texto.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            System.out.println(linea.length());

        } catch (FileNotFoundException e) {
            System.err.println("No existe el archivo");
        } catch (IOException e) {
            System.err.println("No se pudo leer");
        }
    }
}
