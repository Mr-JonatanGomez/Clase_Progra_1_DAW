import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        //15:30 __>15:45, creo que un 2.75 aprox
        ArrayList<Estudiante>listaEstudiantes=new ArrayList<>();

        OperacionesFichero operacionesFichero= new OperacionesFichero();

        Estudiante estudiante1 = new Estudiante("Juan", 27, 3.2,5.6,8.3);
        Estudiante estudiante2 = new Estudiante("Ana", 35, 7.4,6.5,9);

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        for (Estudiante item:listaEstudiantes) {
            System.out.println(item.toString());
        }

        operacionesFichero.leerFichero();





    }
}
