package model;

public class Profesor {
    // al no crear constructor, el constructor vacio va implicito()
    public void ponerNotas(Alumno alumno){
        //para esto solo necesito el alumno y la calificacion,
        // ya que las asignaturas van intrinsecas al alumno
        //para ello vamos al alumno/asignatura y ponemos calif.

        alumno.getAsignatura1().setCalificacion(Math.random()*11);
        alumno.getAsignatura2().setCalificacion(Math.random()*11);
        alumno.getAsignatura3().setCalificacion(Math.random()*11);
    }
}
