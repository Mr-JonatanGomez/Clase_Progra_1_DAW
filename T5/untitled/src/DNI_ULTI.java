public class DNI_ULTI {
    /*Diseña una función en Java a la que le pases un número de DNI
     y te devuelva la letra que corresponde al número pasado como parámetro.
     Usa tu función en una aplicación que pida un DNI y muestre la letra que le corresponde
    */

    public static int letraDNI(int numeroDNI){ //metodo letra DNI ( necesita el parametro numeroDNI)
        char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int indice = numeroDNI%23; // el indice sale del resto de dividir numero DNI/23

        return letras[indice]; //devuelve la letra que esta en la posicion del indice
    }
}
