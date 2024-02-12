import model.Carrera;
import model.Coche;
// tengo que cambiar formula de la velocidad que no esta sumando ni sirve por ahora
public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche ("Opel","Corsa","\uD83D\uDE97 13JGR",80);
        Coche coche2 = new Coche ("Hyundai","i30","\uD83C\uDFCE\uFE0F 03SNG",110);
        Coche coche3 = new Coche ("Seat","Panda","\uD83D\uDE99 ABUELO",30);


        // meter (coche,coche, vueltas y km??)
        Carrera carrera1 = new Carrera("Circuito de Corcega",coche1,coche3);
        carrera1.mostrarDatos();
        carrera1.iniciarCarrera();


    }
}
