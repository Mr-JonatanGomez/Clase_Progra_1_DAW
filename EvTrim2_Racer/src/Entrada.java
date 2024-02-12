import model.Carrera;
import model.Coche;
// tengo que cambiar formula de la velocidad que no esta sumando ni sirve por ahora
public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche ("Citroen","Xsara","\uD83D\uDE97 CollinMcRae_752",80);
        Coche coche2 = new Coche ("Hyundai","i30","\uD83C\uDFCE\uFE0F BoyceCodd_456",110);
        Coche coche3 = new Coche ("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_332",30);
        Coche coche4 = new Coche ("Toyota","Corolla","\uD83D\uDE99 C.Sainz_123",150);


        // meter (coche,coche, vueltas y km??)
        Carrera carrera1 = new Carrera("Circuito de Corcega",coche2,coche4);
        carrera1.mostrarDatos();
        carrera1.iniciarCarrera();


    }
}
