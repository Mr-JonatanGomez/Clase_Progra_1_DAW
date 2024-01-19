import java.util.Scanner;

public class ClaseMetodoE3PaseParametros {
    //Crea un array y rellenalo con 10 numeros por teclado, y mostrarlo normal inverso normal

    //NO QUEREMOS VARIABLE COMPARTIDA PORQUE VAMOS A PASARLE PARAMETROS
    // static int[] numeros=new int[10];
    // el ARRAY se declara en su metodo dentro de parametros (int[]array)
    // eso no es declararlo
    public static void main(String[] args) {
        System.out.println("Ejercicio con 3 metodos");
        Scanner sc = new Scanner(System.in);


        System.out.println("De cuantos numeros quieres el array1");
        int numerosArray= sc.nextInt();
        int[]numeros=rellenarArray(numerosArray);

        System.out.println("De cuantos numeros quieres el array2");
        numerosArray= sc.nextInt();
        int[]numeros2=rellenarArray(numerosArray);

        //llenarArray(numerosArray);// al pasar parametros se piden al hacerlo

        /*
        System.out.println("Que array quieres mostrar (1 o 2)");
        int opcionElegida= sc.nextInt();
        System.out.println("Que orden quieres mostrarlo (normal o inverso");
        String ordenElegido = sc.next();

        if (opcionElegida==1){
            if (ordenElegido.equalsIgnoreCase("normal")){
                mostrarArray(numeros);
            }else {
                mostrarInverso(numeros);
            }
        }else {
            if (ordenElegido.equalsIgnoreCase("normal")){
                mostrarArray(numeros2);
            }else {
                mostrarInverso(numeros2);
            }
        }
*/ // LO DE ARRIBA ES UN MENU CON OPCION

        mostrarArray(numeros);
        mostrarInverso(numeros);
        mostrarArray(numeros2);
        mostrarInverso(numeros2);
        mostrarArray(numeros2);
        System.out.println("indica cuantas posciones de ARRAY en esta linea de mostrar lo rellenado");
        mostrarArray(rellenarArray(sc.nextInt()));


    }
    // rellenar array
    public static int[]  rellenarArray(int n){// (int n) es para decirle por sc cuantos numeros rellenar
        // como este metodo rellena el array cambiamos void por int

        int[] numeros = new int[n];// declaramos aqui el array
        System.out.println("Indica numeros");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();// cada posicion será rellenada con el nº del scanner,
            // tambien puede hacerse variable int numerito= sc.nextint, e igualar numeros[i] = numerito
        }

        return numeros;// devuelvo numeros
    }

    // mostrar array

    public static void mostrarArray(int [] array){// al no haber declarado array lo indicamos aqui
        for (int numero:array) {
            System.out.print(numero+" ");// imprime siempre en orden desde 0 con el FOREACH
        }
        System.out.println();
    }
    // mostrar inverso
    public static void mostrarInverso (int[] array){
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
