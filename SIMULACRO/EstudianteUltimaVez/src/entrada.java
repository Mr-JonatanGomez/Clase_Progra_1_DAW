import controller.Operaciones;
import model.Estudiante;

import java.util.ArrayList;

public class entrada {
//EMPEZADO17:35
    public static void main(String[] args) {

        ArrayList<Estudiante>listadoEstudiantes= new ArrayList<>();

        Estudiante estudiante1 = new Estudiante("Juan", 27,3.2,5.6,8.3);
        Estudiante estudiante2 = new Estudiante("Ana", 35,7.4,6.5,9);


        listadoEstudiantes.add(estudiante1);
        listadoEstudiantes.add(estudiante2);


        System.out.println(estudiante1.equals(estudiante2));
        System.out.println(estudiante1.equals(estudiante1));

        for (Estudiante item:listadoEstudiantes) {
            System.out.println(item.toString());
        }

        Operaciones operaciones = new Operaciones();
        operaciones.leerFichero();

    }
}
