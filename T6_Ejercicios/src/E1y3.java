import model.Persona;

import java.util.Scanner;

public class E1y3 {
    /*1. Crea una clase llamada persona con los siguientes elementos
    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    - Métodos:
        - mostrarDatos: sacará por pantalla los datos de la persona formateados
        - Métodos getters y setters asociados
        - Constructores:
            - un constructor que permita crear una persona con todos los datos
            - un constructor que permita crear una persona sin peso ni altura
            - un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
            - un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona();
        //p1.mostrarDatos();
        //p2 se le cambia name y apellido
        Persona p2 = new Persona("Jonatan", "Gomez", "555222r","hombre", 36, 179.0, 84.4);
        p2.mostrarDatos();
        //p2.incrementoEdad(7);
        p2.mostrarDatos();
        //p2.iMC(p2.getPeso(), p2.getAltura());
        p2.estadoFisico();// ya esta invlocurado el IMC
        Persona p3 = new Persona("Sandra", "Nieves", "112254r","mujer", 33, 161.0, 52.4);
        p3.mostrarDatos();
        p3.estadoFisico();

        //PERSONA INTRODUCIDA
        /*Persona p7 = new Persona();
        System.out.println("Introduce nombre para p7: ");
        p7.setNombre(sc.nextLine());
        System.out.println("Introduce apellido para p7: ");
        p7.setApellido(sc.nextLine());
        System.out.println("Introduce DNI para p7: ");
        p7.setDni(sc.nextLine());
        System.out.println("Introduce edad para p7: ");
        p7.setEdad(sc.nextInt());
        System.out.println("Introduce Altura en cm para p7: ");
        p7.setAltura(sc.nextDouble());
        System.out.println("Introduce Peso en cm para p7: ");
        p7.setPeso(sc.nextDouble());

        p7.mostrarDatos();
        p7.iMC(p7.getPeso(),p7.getAltura());*/
    }
}
