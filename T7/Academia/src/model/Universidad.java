package model;

import java.util.ArrayList;

public class Universidad {

    private ArrayList<Alumno>listaAlumnos;
    private ArrayList<Alumno>listaProfesores;

    public Universidad() {//creo universidad con 0 alumnos
        this.listaAlumnos=new ArrayList<>();
        this.listaProfesores=new ArrayList<>();

    }
    public void matricularAlumno(Alumno alumno){
        this.listaAlumnos.add(alumno);
    }

    public void mostrarAlumnos(){
        for (Alumno alumno:listaAlumnos) {
            alumno.mostrarDatos();
        }
    }
    public void calificarAlumnos(){
        for (Alumno alumno:listaAlumnos) {
            listaProfesores.get(0).ponerNotas(alumno);
        }
    }

}
