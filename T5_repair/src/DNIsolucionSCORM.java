import java.util.Scanner;

public class DNIsolucionSCORM {
/*
DUDAS
1- No seria mejor tener el metodo MAIN, al principio del codigo? en este ejemplo aparece antes el metodo del DNI
2- En metodo LETRADNI, como sabe el MAIN que numeroDNI(del otro metodo) es el DNI introducido por Scanner?
*/
    public static char letraDNI(int numeroDNI) {
        char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int indiceBusqueda = numeroDNI % 23;
        return letras[indiceBusqueda];
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un DNI: ");
        int dni = teclado.nextInt();
        char tuLetra = letraDNI(dni);// aqui a letra dni pasamos el valor del dni// relacionado con linea 9
        System.out.println("La letra del DNI es la " + tuLetra);
    }
}