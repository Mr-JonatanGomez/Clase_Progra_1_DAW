import model.Coche;
import model.Gasolinera;
import model.Surtidor;

public class Entrada {
    public static void main(String[] args) {
        Surtidor surtidor1= new Surtidor(1,1000, "Diesel");
        Surtidor surtidor2= new Surtidor(2,2000, "Gasolina");
        Surtidor surtidor3= new Surtidor(3, "Diesel");

        Gasolinera gasolinera = new Gasolinera();
        gasolinera.agregarSurtidor(surtidor1);
        gasolinera.agregarSurtidor(surtidor2);
        gasolinera.agregarSurtidor(surtidor3);

        Coche coche = new Coche("Gasolina");

        gasolinera.mostrarDatosSurtidores();


        coche.ponerCombustible(surtidor1,200);
        coche.ponerCombustible(surtidor2,100);
        coche.ponerCombustible(surtidor3,50);

        gasolinera.mostrarDatosSurtidores();
        coche.mostrarDatosCoche();
        coche.ponerCombustible(surtidor2,150);

        surtidor2.mostrarDatos();
        coche.mostrarDatosCoche();
    }
}
