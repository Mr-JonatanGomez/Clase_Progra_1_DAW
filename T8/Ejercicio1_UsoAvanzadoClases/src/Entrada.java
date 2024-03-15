import controller.Supermercado;
import model.Alimento;
import model.Silla;

import java.util.ArrayList;

//NO LO CONSIGO
public class Entrada {
    public static void main(String[] args) {
        Silla silla = new Silla("hierro", 25,10,4);
        Silla silla1 = new Silla("vintage", 2,25,2);

        Supermercado supermercado = new Supermercado();
        supermercado.registrarProducto(silla1);
        supermercado.registrarProducto(silla);
        silla1.calcularPrecio();
    }
}
