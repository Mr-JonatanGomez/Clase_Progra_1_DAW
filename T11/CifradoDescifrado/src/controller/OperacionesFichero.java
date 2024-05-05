package controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;
import java.util.Scanner;

@Setter
@Getter

@NoArgsConstructor
public class OperacionesFichero {
    public void leerFichero() {
        File file = new File("src/resources/fichero.txt");
        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }


        } catch (FileNotFoundException e) {
            System.err.println("file no encontrado");
        } catch (IOException e) {
            System.err.println("Error de entrada en Lectura");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }
        }
    }

    public void cifrarFichero(String mensaje, int clave) {
        /*
        El sistema pedirá el mensaje (mediante
    BufferedReader) y cual es la clave con la que se va a cifrar (un numero). Una vez
    introducido ambas, se pedirá el nombre del fichero y escribirá dicho fichero con
    los codigos ASCII del mensaje cifrado
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero");
        String ficheroNuevo = sc.next();
        File file = new File("src/resources/" + ficheroNuevo + ".txt");
        FileWriter fileWriter = null;


        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Fallo al crear el file");
            }
        }

        try {
            fileWriter = new FileWriter(file);
            for (int i = 0; i < mensaje.length(); i++) {
                fileWriter.write(mensaje.charAt(i) * clave);
            }


        } catch (IOException e) {
            System.err.println("Error de Entrada de datos");
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("Error cerrado de flujo");
            }
        }


    }

    public void descifrarFichero(String nombreFichero, int clave) {


        File file = new File("src/resources/" + nombreFichero + ".txt");
        FileReader fileReader = null;

        if (!file.exists()) {
            System.err.println("El archivo no existe");
            throw new RuntimeException("No existe el archivo");
        }


        try {
            fileReader = new FileReader(file);
            int codificado = -1;
            while((codificado= fileReader.read())!=-1){
                System.out.print((char)(codificado/clave));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado");
        } catch (IOException e) {
            System.err.println("Error en la lectura");
        } finally{
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar flujo");
            }
        }

    }


}

