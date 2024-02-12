package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Universidad {
    private ArrayList<Alumno> listaAlumnos;// aquí hay listas de alumnos NO INICIALIZAR AQUI ARRIBA
    private ArrayList<Profesor> listaProfesores;

    /* NO SE HACE CONSTRUCTOR AUTOMATICO
    Porqué haría esto, y los alumnos van a venir poco a pco, no están ya en la universidad

    public Universidad(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
     */
    //INICIALIZAMOS CONSTRUCTOR CON LISTA sin parametros
    public Universidad() {
        this.listaAlumnos = new ArrayList<>();
        this.listaProfesores = new ArrayList<>();
        // AÑADIMOS UN PROFESOR DE SERIE AL MONTAR LA UNIVERSIDAD
        listaProfesores.add(new Profesor());
    }

    public void contratarProfesor(Profesor profesor) {
        listaProfesores.add(profesor);// ya hay 2 profesores disponibles para contratar
    }

    public void matricularAlumno(Alumno alumno) { //necesitamos alumno para matricularlo
        this.listaAlumnos.add(alumno);           // agregamos alumno

    }

    public void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarDatos();
        }
    }

    public void calificarAlumnos() { // para calificar a todos los alumnos
        listaProfesores.get(0); // 0 hace que el primer porfesor es quien pone notas

        //PONEMOS CONDICION a que si:
        // NO HAY PROFESORES no se puede calificar
        // NO HAY ALUMNOS NO HAY A QUIEN CALIFICAR
        if (listaProfesores.size() == 0 || listaAlumnos.size() == 0) {
            System.out.println("No hay elementos para ejecutar la operacion");
        } else {
            for (Alumno alumno : listaAlumnos) {
                listaProfesores.get(0).ponerNotas(alumno);
            }


        }
    }

    public void mostrarTodoAprobados() {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getAsignatura1().getCalificacion() >= 5
                    && alumno.getAsignatura2().getCalificacion() >= 5
                    && alumno.getAsignatura3().getCalificacion() >= 5) {
                alumno.mostrarDatos();
            }
        }
    }

    public void ordenarPorExpediente (){
        listaAlumnos.sort(new Comparator<Alumno>() {
            /* compara posicion 0 y 1  si o1 es menor lo coloca antes (-1),
            si o1 es mayor lo coloca despues (1)
            si o1 y 02 son iguales los deja como estan (0)

            Tras esto, pasa a comparar posicion 1 y 2, 2 y 3 ...hasta acabar
            */
            @Override
            public int compare(Alumno o1, Alumno o2) {

                if (o1.getnExpediente()<o2.getnExpediente()){
                    return -1; // si o1 es menor -1 deja los valores como estan
                } else if (o1.getnExpediente()>o2.getnExpediente()) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });
    }
}
