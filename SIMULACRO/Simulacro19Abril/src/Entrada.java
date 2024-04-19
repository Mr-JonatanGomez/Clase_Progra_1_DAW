import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 27, 3.2,5.6,8.3);
        Estudiante estudiante2 = new Estudiante("Ana", 35, 7.4,6.5,3.9);

        ArrayList <Estudiante> lista = new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);

        for (Estudiante estudiante :lista) {
            double notaMedia=(estudiante.getNota1()+ estudiante.getNota2()+ estudiante.getNota3())/3;
            System.out.println(estudiante.toString());
            System.out.println("Su nota media es: "+ notaMedia+"\n");

        }

    }
}
