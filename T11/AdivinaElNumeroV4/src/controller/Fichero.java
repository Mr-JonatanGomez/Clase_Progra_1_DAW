package controller;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Fichero {
    public void crearFicheros() {
        File fileRecord = new File("src/resources/recordMaximo.obj");
        File fileHistorial = new File("src/resources/historialJugadores.obj");
        if (!fileRecord.exists()) {
            try {
                fileRecord.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
        if (!fileHistorial.exists()) {
            try {
                fileRecord.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
    }

    public void guardarRecord (){
      //  var guardarRecord = new ObjectOutputStream();
    }
}
