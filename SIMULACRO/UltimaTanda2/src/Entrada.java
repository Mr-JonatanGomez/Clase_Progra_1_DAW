import controller.Operaciones;

public class Entrada {
    public static void main(String[] args) {
        // EMPEZADO 16:50 -- 17:29
        // HUBIERA SIDO MENOS SI BORJA NO HUBIERA METIDO ESPACIOS en el TXT ha copiar
        // YA QUE LO TENIA BIEN ANTES

        Operaciones operaciones= new Operaciones();

        operaciones.leerFichero();
        operaciones.mostrarTodos();
        operaciones.mostrarAlumnoMejorNota();

    }
}
