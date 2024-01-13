import java.util.Scanner;

public class Ejercicio2Rotacion {
    /* Programa de 5 variables enteras:
    a) que se muestren en una sola linea
    b) Roten los valores hacia la izquierda
    c) Se muestren de nuevo el valor como el apartado a
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero1");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce numero2");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce numero3");
        int numero3 = scanner.nextInt();
        System.out.println("Introduce numero4");
        int numero4 = scanner.nextInt();
        System.out.println("Introduce numero5");
        int numero5 = scanner.nextInt();
        System.out.println("Introduce tu nombre");
        String nombre = scanner.next();

        System.out.println("Me has dicho que te llamas " + nombre);
        System.out.println(" ");// para hacer salto linea
        System.out.println("numeros que ha leido la maquina en una sola linea.");
        System.out.println(numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);
        /* lo que hace scanner (minuscula es llamar a la variable Scanner
        y el .nextInt, es que nos pida introducir numero para continuar.
         */

        /*
        Para la rotacion de los numeros de manera simple,
        habria que igualar los identificadores una posicion
        hacia la izquierda: 1 2 3 4 5 -- 2 3 4 5 1
         */
        int aux = numero1;
        numero1 = numero2; // este lo hace bien
        numero2 = numero3; // este lo hace bien
        numero3 = numero4; // este lo hace bien
        numero4 = numero5; // este lo hace bien
        numero5 = aux; /* este lo hace mal, porque el numero,ya valdria 2,
         ya que oficialmente le has pisado,
         para evitarlo, creamos un int aux=numero1
         al principio y luego igualamos el 5 al AUXILIAR*/

        System.out.println(" ");// para hacer salto linea
        System.out.println("Rotacion hacia la izquiera, ha necesitado un aux");
        System.out.println(numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);

        /*Ahora lo vamos a rotar a la derecha
        Tenemos 2 3 4 5 1*/
        /*
        numero1 = numero5;
        numero2 = numero1;
        numero3 = numero2;
        numero4 = numero3;
        numero5 = numero4;

        System.out.println(" ");// para hacer salto linea
        System.out.println("Rotacion hacia la derecha, sin aux se pisan todos");
        System.out.println(numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);
        */
        /*Para devolver su valor original como menciona la parte c del ejercicio
        le metemos un aux, nuevamente,
       parrtimos de la base 2 3 4 5 1

         */
        int aux2 = numero5;
        numero5 = numero4;
        numero4 = numero3;
        numero3 = numero2;
        numero2 = numero1;
        numero1 = aux2;





        System.out.println(" ");// para hacer salto linea
        System.out.println("Rotacion hacia la derecha, con aux para que no se pisen y escritos al reves");
        System.out.println(numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);
    }
}
