import model.Alumno;
import model.Asignatura;
import model.Profesor;
import model.Universidad;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura baseDatos = new Asignatura(2);
        Asignatura sistemasInf = new Asignatura(3);
        Asignatura entornosDes = new Asignatura(4);
        Asignatura lenguajeMarcas = new Asignatura(5);
        Asignatura fol = new Asignatura(6);

        /* con los constructores sin id, si ponemos notas a 1 alumno y
        mostramos los 3 alumnos, las asignaturas compartidas por los otros alumnos
        tomaran el valor del alumno calificado por eso es mejor hacerlo mediante id
         Y ESTOS LOS DEJO COMENTADOS

        Alumno alumno1NoId = new Alumno("NoId_Jonatan",programacion,fol,sistemasInf);
        Alumno alumno2NoId = new Alumno("NoId_Liam",baseDatos,programacion,lenguajeMarcas);
        Alumno alumno3NoId = new Alumno("NoId_Sandra",sistemasInf,entornosDes,programacion);


        /*El constructor de asignaturas por id, hace propia del alumno cada nota,
        del modo anterior, se califica a la asignatura, por eso repite los valores */
        Alumno alumno1 = new Alumno("Jonatan",1,6,3);
        Alumno alumno2 = new Alumno("Liam",2,1,5);
        Alumno alumno3 = new Alumno("Sandra",3,4,1);
        Alumno alumno4 = new Alumno("Eustaquio",9,12,1);

        /*CREACION DE UN ARRAYLIST
        ArrayList<Alumno>listaAlumnos = new ArrayList();
        listaAlumnos.add(alumno1),
        listaAlumnos.add(alumno2),
        listaAlumnos.add(alumno3),
        listaAlumnos.add(alumno4),


        LO COMENTO PARA CREAR UNIVERSIDAD que ya tiene dentro el ARRAY LIST de alumno */

        Universidad universidad = new Universidad();

        universidad.contratarProfesor(new Profesor());



        universidad.matricularAlumno(alumno1);
        universidad.matricularAlumno(alumno2);
        universidad.matricularAlumno(alumno3);
        universidad.matricularAlumno(alumno4);

        universidad.calificarAlumnos();
        //universidad.mostrarAlumnos();
        universidad.mostrarTodoAprobados();


        //Profesor borjaMartin = new Profesor();

/*
        borjaMartin.ponerNotas(alumno1NoId);
        alumno1NoId.mostrarDatos();
        alumno2NoId.mostrarDatos();*/

//METODOS

/*
        borjaMartin.ponerNotas(alumno1);
        alumno1.mostrarDatos();
        alumno2.mostrarDatos();
        alumno3.mostrarDatos();
*/



    }

//MINUTO 35 de CLASE
}
