import controller.OperacionesFicheroObjeto;
import controller.OperacionesFicherosTextoPlano;

public class Entrada {
    public static void main(String[] args) {
        OperacionesFicherosTextoPlano operacionesFicheros = new OperacionesFicherosTextoPlano();
        OperacionesFicheroObjeto operacionesFicheroObjeto = new OperacionesFicheroObjeto();

        // operacionesFicheros.lecturaInformacion();
        // operacionesFicheros.escrituraFichero();
        // operacionesFicheros.leerFichero();
        // operacionesFicheros.escrituraFichero();
        // operacionesFicheroObjeto.escrituraObjeto();
        operacionesFicheroObjeto.lecturaObjeto();
    }
}
