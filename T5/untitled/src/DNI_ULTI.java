import java.util.Scanner;

public class DNI_ULTI {
    /*Diseña una función en Java a la que le pases un número de DNI
     y te devuelva la letra que corresponde al número pasado como parámetro.
     Usa tu función en una aplicación que pida un DNI y muestre la letra que le corresponde
    */

    public static char letraDNI(int numeroDNI) { //metodo letra DNI ( necesita el parametro numeroDNI)
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int indice = numeroDNI % 23; // el indice sale del resto de dividir numero DNI/23

        return letras[indice]; //devuelve la letra que esta en la posicion del indice
    }
public static boolean comprobacion (){
        letraDNI()
}
    public static void main(String[] args) {
        System.out.println("Introduce el numero de DNI sin letra");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        char tuLetra = letraDNI(dni); // tu letra será lo que salga del metodo
        System.out.println(tuLetra);


    }
}
