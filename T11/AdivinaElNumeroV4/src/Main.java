import controller.Fichero;
import controller.JuegoYGuardadoFicheros;

public class Main {
    public static void main(String[] args) {
        JuegoYGuardadoFicheros juego = new JuegoYGuardadoFicheros();
        Fichero fichero = new Fichero();


        fichero.crearFicheros();

        //juego.crearFicheros();
        juego.partida();
    }
}
