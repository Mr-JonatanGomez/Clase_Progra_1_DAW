import model.Alumno;
import model.Asignatura;// para importar todas las clases un *
import model.Profesor;
import model.Universidad;

import java.util.ArrayList;

public class Entrada {  // public String get nombre en 1.32.00 de clase
    //PERDIDO EN 1.32.00
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura( 1);
        Asignatura lenguajeMarcas = new Asignatura( 2);
        Asignatura sistemas = new Asignatura( 3);
        Asignatura baseDatos = new Asignatura( 4);
        Asignatura Entornos = new Asignatura( 5);
        Asignatura fol = new Asignatura( 6);

        Alumno alumno1 = new Alumno("Pepe",programacion,sistemas,lenguajeMarcas);
        Alumno alumno2 = new Alumno("Sulivan",programacion,fol,lenguajeMarcas);
        Alumno alumno3 = new Alumno("Manola",1,2,4);

        Profesor borja = new Profesor();
        borja.ponerNotas(alumno3);
        alumno3.mostrarDatos();
        borja.calcularMedia(alumno3);



        ArrayList<Integer>listinNumeros = new ArrayList();
        listinNumeros.add(5);
        listinNumeros.add(7);
        listinNumeros.add(9);
        listinNumeros.add(1);

        //BORRAR
        listinNumeros.remove(0);//por indice
        listinNumeros.remove(2);//object no funciona con integer

        //OBTENER ELEMENTO
        listinNumeros.get(2); //me da la posicion 2
        // OBTENER TODOS ELEMENTOS CON FOR
        for (Integer item:listinNumeros) {
            System.out.println(item);
        }
        //CON FOR NORMAL
        for (int i = 0; i < listinNumeros.size()-1; i++) {//
            System.out.println(listinNumeros.get(i));
        }
        // cambiar un valor por otro

        listinNumeros.set(1,3); // posicion 1 le pone un 3 cambiando lo que habia
/*
        ArrayList <Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
*/
        Universidad universidad=new Universidad();
        universidad.matricularAlumno(alumno1);
        universidad.matricularAlumno(alumno2);
        universidad.matricularAlumno(alumno3);

    }


    // tengo 75264525 alumnos
    // arraylist? coleccion datos, con algo en comun
    // object[] cosas = new Object []{1,25,168, false, true, "asado"} --> son objetos
    // NO SON DINAMICOS los ARRAYS no se puede añadir ni eliminar, se puede cambiar a nulo como maximo
    //se asocian a posiciones

    //LOS ARRAY ¿LIST son listas de datos DINAMICA, puede crecer y decrecer//asociados a posiciones tambien


}
