import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  11 Mayo  16:15 -->16:35
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>notasAlumnos = new ArrayList<>();
        System.out.println("Introduce las notas de los 20 alumnos");
        int numeroAlumno = 0;
        int suspensos=0;
        int aprobados=0;
        int sumaNotas=0;
        int notaMayor=0;
        int notaMenor=0;
        double notaMedia=0;

        for (int i = 0; i <20 ; i++) {
            int nota=sc.nextInt();
            notasAlumnos.add(nota);
        }

        for (Integer nota:notasAlumnos) {
            numeroAlumno++;


            System.out.println("Alumno "+numeroAlumno+" nota: "+nota);
            sumaNotas += nota;

            if (nota>notaMayor){
                notaMayor=nota;
            } else if (nota<notaMenor) {
                notaMenor=nota;
            }
            if (nota >=5){
                aprobados++;
            } else if (nota<5) {
                suspensos++;
            }

        }

        notaMedia=(double)sumaNotas/(double)notasAlumnos.size();

        System.out.println("La nota mas alta fue: "+notaMayor );
        System.out.println("La nota mas baja fue: "+notaMenor );
        System.out.println("La cantidad de aprobados : "+aprobados );
        System.out.println("La cantidad de suspensos : "+suspensos );
        System.out.println("La cantidad de alumnos es de: "+notasAlumnos.size());
        System.out.println("La nota media fue: " +notaMedia);



        // HECHO DESPUES PARA PROBAR CON SORT DE NUEVO
        System.out.println("ORDENACION");
        notasAlumnos.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        for (Integer item:notasAlumnos) {
            System.out.print(item+", ");
        }
        System.out.println(notasAlumnos.get(0));
        System.out.println(notasAlumnos.get(19));

    }
}
