import controller.Operaciones;

public class Entrada {
    //COMIENZO A LAS 10:52 11:17     24 MINUTOS


    /*2.	Crea un fichero llamado alumnos.txt con el siguiente contenido



En dicho fichero se guarda la información de una serie de alumnos, donde tenemos el nombre, apellido, correo y
media obtenida. Para la resolución del ejercicio tendrás que leerlo desde java y mostrar por consola el alumno
que tenga una media más alta.

Ten en cuenta que si en el fichero se añade cualquier fila debería seguir funcionando y devolviendo el alumno
con una media más alta
*/

    public static void main(String[] args) {

        Operaciones operaciones= new Operaciones();
        operaciones.leerFicheroYconvertirAlumnos();
        operaciones.mostrarTodosAlumnos();
        System.out.println();
        operaciones.mostrarNotaMasAltayBaja();
    }


}
