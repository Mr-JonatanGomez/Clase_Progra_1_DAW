import controller.Operaciones;
import model.Estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // EMPEZADO 13:05
        ArrayList<Estudiante>listaEstudiantes= new ArrayList<>();

        Estudiante estudiante1 = new Estudiante("Juan", 27,3.2,5.6,8.3);
        Estudiante estudiante2 = new Estudiante("Ana", 35,7.4,6.5,3.9);

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        for (Estudiante estudiante:listaEstudiantes) {
             System.out.println(estudiante.toString());
        }

        Operaciones operaciones= new Operaciones();
        operaciones.leerFichero();

        estudiante2.compararEstudiante(estudiante1);
        estudiante2.compararEstudiante(estudiante2);
    }
}
