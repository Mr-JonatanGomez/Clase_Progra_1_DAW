import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Persona p1 = new Persona("Fede", 18);
        Persona p2 = new Persona("Sully", 29);
        Persona p3 = new Persona("", 19);
        Persona p4 = new Persona("Giana", 45);
        Persona p5 = new Persona("Jolly", 33);

        ArrayList<Persona>lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);



        try {

            for (Persona per:lista) {
                System.out.println(per.toString());
                per.validarDatos();
            }
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage()
            );
        }


    }
}
