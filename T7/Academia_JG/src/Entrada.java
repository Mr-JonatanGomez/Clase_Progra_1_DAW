import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Entrada {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura baseDatos = new Asignatura(2);
        Asignatura sistemasInf = new Asignatura(3);
        Asignatura entornosDes = new Asignatura(4);
        Asignatura lenguajeMarcas = new Asignatura(5);
        Asignatura fol = new Asignatura(6);


        Alumno alumno2 = new Alumno("Jonatan",programacion,fol,sistemasInf);
        Alumno alumno3 = new Alumno("Liam",baseDatos,programacion,lenguajeMarcas);
        Alumno alumno4 = new Alumno("Sandra",programacion,entornosDes,sistemasInf);
        // alumno creado por id inicializando asignatura con id en la clase
        // esto evitaria tener declaradas las asignaturas aqui??
        Alumno alumno1 = new Alumno("dkk",1,53,1);

        Profesor borjaMartin = new Profesor();
        borjaMartin.ponerNotas(alumno2);
        alumno2.mostrarDatos();
    }


}
