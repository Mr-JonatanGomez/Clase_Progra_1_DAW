import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Setter
@Getter

public class Colegio {
    private ArrayList<Alumno>listadoAlumnos;
    private int numeracionMatriculas=1;

    public Colegio() {
        this.listadoAlumnos = new ArrayList<>();

    }

    public Colegio(ArrayList<Alumno> listadoAlumnos) {
        this.listadoAlumnos = new ArrayList<>();
    }

    public void mostrarAlumnos(){
        for (Alumno item:listadoAlumnos) {
            item.mostrarDatos();
        }
    }
    public void darAltaAlumno (Alumno alumno){
        listadoAlumnos.add(alumno);
        alumno.setNumeroMatricula(numeracionMatriculas);
        numeracionMatriculas++;
    }

    public void calificarAlumnos(){
        for (Alumno item:listadoAlumnos) {
            item.setCalificacion((double)(Math.random()*10)+1);
        }

    }
}
