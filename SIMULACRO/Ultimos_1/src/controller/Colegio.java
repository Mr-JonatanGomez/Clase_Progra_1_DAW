package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Alumno;

import java.util.ArrayList;

@Setter
@Getter
public class Colegio {
    /*
    b.	Colegio: con un listado de alumnos como propiedad. El colegio tendrá los métodos de listarAlumnos,
                darAlta con un parámetro de tipo un alumno para poder meterlo dentro de la lista y un método
                calificarAlumno con un patametro de tipo int (la matricula) otro de tipo double para poder calificar
                al alumno correspondiente. El número de matrícula tendrá que ser otorgado de forma automática cuando se
                registra el alumno

      */
    private ArrayList<Alumno>listadoAlumnos;
    private int numeracionMAtricula=1;

    public Colegio() {
        listadoAlumnos= new ArrayList<>();
    }
    public Colegio(ArrayList<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public void inscribirAlumno(Alumno alumno){
        alumno.setMatricula(numeracionMAtricula);
        numeracionMAtricula++;
        listadoAlumnos.add(alumno);
    }
    public void mostrarAlumnos(){
        for (Alumno item:listadoAlumnos) {
            item.mostrarDatos();
        }
    }

    public void calificarAlumnos(){
        for (Alumno item:listadoAlumnos) {

            item.setCalificacion((Math.random()*11));
        }
    }
//mejorar
    public void calificaAlumno(int matricula, double calificacion){
        for (Alumno item:listadoAlumnos) {

            item.setCalificacion((Math.random()*11));
        }
    }
}
