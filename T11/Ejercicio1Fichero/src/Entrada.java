import controller.OperacionFichero;

import controller.Registro;
import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Registro reg = new Registro();
        String opcion = null;


        do {
            Scanner sc = new Scanner(System.in);
            reg.registro();
            System.out.println("¿QUIERES CREAR OTRO USUARIO?");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("SI"));

        if (opcion.equalsIgnoreCase("NO")) {

            File file = new File("src/resources/usuarios.txt");
            FileWriter fileWriter = null;
            PrintWriter printWriter = null;


            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("el FILE no puede crearse porque ya existe");
                }
            }

            try {
                fileWriter = new FileWriter(file);
                printWriter = new PrintWriter(fileWriter);
            } catch (IOException e) {
                System.out.println("Error ecritura");
            }


            printWriter.println();

        }
        try {
        } catch (Exception e) {
            System.out.println("Tipo datos no valido");
        }
        reg.recorrer();
    }
}
