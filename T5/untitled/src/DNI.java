import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        System.out.println("Introduce numero de DNI");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        char tuLetra = letraDni(dni);

        System.out.println(" tu letra dni es: " + tuLetra);
    }

    public static char letraDni(int numeroDni) {
        char[] letrasDisponibles = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        // la posicion 0 = T...
        int indice = numeroDni % 23;
        //System.out.println(" el resultado de indice es"+ indice);
        return letrasDisponibles[indice];
    }

    /*
    Recuerda que desde una función puedes llamar a otra,
    es decir, que puedes utilizar la función que ya has
    creado en el punto anterior para averiguar cuál es
    la letra que le corresponde al DNI. Una vez la sepas,
    la puedes comparar con la que se ha pasado como segundo
     parámetro a la función que estás haciendo y, así, la
     función nos devolverá true si coindicen o false si no coinciden.
    */

}



