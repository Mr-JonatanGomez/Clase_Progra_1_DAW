package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Setter
@Getter
@NoArgsConstructor
public class OperacionFichero {


    public void escribir() {
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

// TODO: 15/04/2024 CREO QUE VA CON LA CLASE EJERCICIOS3 DE LOS JUEVES, con split y demas 
            printWriter.println();

        } catch (IOException e) {
            System.out.println("Error ecritura");
        }finally {
            try {
                fileWriter.close();
                printWriter.close();

            } catch (IOException e) {
                System.out.println("Error de cierre flujo");
            }
        }




    }
}


