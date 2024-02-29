import model.Gasolinera;
import model.Surtidor;

public class Entrada {
    public static void main(String[] args) {
        Surtidor surtidor1= new Surtidor(1000, "Diesel");
        Surtidor surtidor2= new Surtidor(2000, "Gasolina");
        Surtidor surtidor3= new Surtidor( "Diesel");

        Gasolinera gasolinera = new Gasolinera();
        gasolinera.agregarSurtidor(surtidor1);
        gasolinera.agregarSurtidor(surtidor2);
        gasolinera.agregarSurtidor(surtidor3);
    }
}
