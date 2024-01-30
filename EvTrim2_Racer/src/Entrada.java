import model.Carrera;
import model.Coche;
// tengo que cambiar formula de la velocidad que no esta sumando ni sirve por ahora
public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche ("Opel","Corsa","13JGR",80);
        Coche coche2 = new Coche ("Hyundai","i30","03SNG",110);

        Carrera carrera1 = new Carrera(coche1,coche2);
        carrera1.iniciarCarrera();


    }
}
