import controller.Biblioteca;
import model.elemento.CD;
import model.elemento.Elemento;

public class Entrada {
    public static void main(String[] args) {
        CD cd = new CD();
        Biblioteca bc=new Biblioteca();
        bc.registrarElemento(cd);
    }
}
