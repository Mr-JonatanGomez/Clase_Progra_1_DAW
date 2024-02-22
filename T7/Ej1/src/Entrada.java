import model.Coche;
import model.Garaje;

public class Entrada {
        /*Desarrollar una clase llamada Aplicacion que en su método main:

- Cree un garaje.
- Cree 2 coches.
- El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio (Math.random()) de la avería tratada.
- Si la avería del coche es “aceite” incrementar en 10 los litros de aceite.
- Los coches entrarán al menos 2 veces en el garaje.
- Mostrar la información de los coches al final del main.*/

    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche coche1 = new Coche("opel","corsa");
        Coche coche2 = new Coche("renault","megane");
    }



}
