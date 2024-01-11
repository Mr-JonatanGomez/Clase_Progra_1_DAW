import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        System.out.println("Introduce numero de DNI");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        char tuLetra = letraDni(dni);

        System.out.println(" tu letra dni es: "+ tuLetra);
    }

    public static char letraDni (int numeroDni) {
        char[] letrasDisponibles = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        // la posicion 0 = T...
        int indice = numeroDni % 23;
        //System.out.println(" el resultado de indice es"+ indice);
        return letrasDisponibles [indice];
    }
}
