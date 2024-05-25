import controller.Colegio;
import model.Alumno;

import java.util.ArrayList;

public class Entrada {
    //EMPEZADO 10:25 -- 10:52 (27 minutos tranquilamente)
    public static void main(String[] args) {
      /*

            c.	Entrada: con un método main con la siguiente funcionalidad
                    i.	Crea 4 alumnos con datos manuales
                    ii.	Agrega los alumnos al colegio
                    iii.	Califica los a todos los alumnos
                    iv.	Muestra los datos de todos los alumnos


       */
        Alumno alumno1 = new Alumno("Jon","Gom","12a");
        Alumno alumno2 = new Alumno("Lim","Gom","13b");
        Alumno alumno3 = new Alumno("San","Niv","14c");
        Alumno alumno4 = new Alumno("Lai","Gom","15d");

        Colegio colegio = new Colegio();

        colegio.inscribirAlumno(alumno1);
        colegio.inscribirAlumno(alumno2);
        colegio.inscribirAlumno(alumno3);
        colegio.inscribirAlumno(alumno4);
        colegio.calificarAlumnos();
        colegio.mostrarAlumnos();
    }
}
