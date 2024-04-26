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

            //1. SACAR EL TEXTO
            String linea = bufferedReader.readLine();
            System.out.println(linea);

            //2. SACAR caracteres, palabras y oraciones
            System.out.println("\nEl numero de caracteres es: " + linea.length());

            String[] caracteres = linea.split("");
            System.out.println("Caracteres por split:" + caracteres.length);

            String[] palabras = linea.split(" ");
            System.out.println("\nEl numero de palabras es: " + palabras.length);
            //System.out.println(palabras[90]);


            String[] oraciones = linea.split("\\.");
            System.out.println("\nEl numero de oraciones es: " + oraciones.length);
            int contador = 1;
            for (String item : oraciones) {
                System.out.println("FRASE " + contador);
                System.out.println(item);
                contador++;

            }


        } catch (FileNotFoundException e) {
            System.err.println("No existe el archivo");
        } catch (IOException e) {
            System.err.println("No se pudo leer");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar flujo");
            }
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

    public void conversorASCII() {
        //FILE-FILEREADER
        File file = new File("src/resources/texto.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;
            while ((codigo = fileReader.read()) != -1) {
                System.out.print(codigo + " "); // codigo + espacio
                if (codigo == 32) {
                    System.out.print("\t");// tabulador tras cada espacio
                } else if (codigo == 46) {
                    System.out.println("\n"); //
                }
            }


        } catch (FileNotFoundException e) {
            System.err.println("no existe archivo");
        } catch (IOException e) {
            System.err.println("Error de lectura");
        } finally {
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }
        }
    }

    public void conversorASCIIconEscritura() {
        //FILE-FILEREADER
        File file = new File("src/resources/texto.txt");
        File fileASCII = new File("src/resources/texto2.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            if (!fileASCII.exists()) {
                fileASCII.createNewFile();
            }
            fileWriter = new FileWriter(fileASCII, true);

            fileReader = new FileReader(file);
            int codigo = -1;
            while ((codigo = fileReader.read()) != -1) {
                System.out.println(codigo);
                fileWriter.write(codigo);

            }


        } catch (FileNotFoundException e) {
            System.err.println("no existe archivo");
        } catch (IOException e) {
            System.err.println("Error de lectura");
        } finally {
            try {
                assert fileReader != null;
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }
        }
    }


}

