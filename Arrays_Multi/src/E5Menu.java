import java.util.Scanner;

/*1.    (OperacionesArray)
    v- Crear un array con 10 posiciones y asígnale
        números enteros entre 0 y 9, ambos inclusive (de forma automática).
    v- Se mostrarán los datos separados por una coma y un espacio.

    Una vez hecho esto se modificará el array del de la manera indicada
    en cada apartado, y se mostrará de nuevo.
    1- Incrementar en 1 los valores pares y en -1 los impares.
    2- Duplicar los valores positivos menores que 5
    3- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
    4- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
      segundo al tercero, ..., y el último al primero).
    5- (yo solo excepto pequeña ayuda chatGPT) - Intercambiar el primero con el
      segundo, el tercero con el cuarto, ..., el penúltimo con el último.
    6- (hacer el intercambio en el mismo bucle, separado por coma chatGPT) Invertir el array
    7 Mostrar la posición del primer par y del último impar.

**hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones***/
public class E5Menu {

    private static int[] arrayPos = new int[10];

    private static int[] inverso = new int[10];
    public static void main(String[] args) {
        System.out.println("\t\n\n Tras mostrar el array inicial, podra elegir que hacer");

        rellenarArray();
        System.out.println("\n\n\t\t MENÚ PRINCIPAL");
        System.out.println("\n" +
                "    1- Sumar 1 a los valores pares, restar 1 los impares.\n" +
                "    2- Duplicar los valores positivos < 5\n" +
                "    3- Sumar a cada valor un valor entero aleatorio entre -5 y 5.\n" +
                "    4- Mover los datos una posición hacia la derecha.\n" +
                "    5- Intercambiar posiciones 0-1, 2-3, ...,8-9\n" +
                "    6- Invertir el array\n" +
                "    7- Mostrar la posición del primer par y del último impar.\n" +
                "    0- SALIR.\n");
// solo con menú hacemos lo que queremos
        menu();
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int numeroMenu;
        System.out.println(" ");
        System.out.println("Introduce una opcion");
        do {
            numeroMenu = sc.nextInt();

            switch (numeroMenu) {
                case 1:
                    incrementoDecremento();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 2:
                    duplicadoMenor5();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 3:
                    sumaMasMenos5Aleatorio();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 4:
                    rotacionDerecha();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 5:
                    intercambioPos();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 6:
                    invertirArray();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 7:
                    mostrarPrimParUltImpar();
                    System.out.println("\nIntroduce otra opcion");
                    break;
                case 0:
                    System.out.println("\t\t FIN DEL PROGRAMA ");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
        }while (numeroMenu!=0);



    }

    public static void rellenarArray() {
        arrayPos = new int[10];
        System.out.println("\nEl array actualmente es: ");
        for (int i = 0; i < arrayPos.length; i++) {
            arrayPos[i] = (int) (Math.random() * 10);
        }
        mostrarArray();
    }

    public static void incrementoDecremento() {
        for (int i = 0; i < arrayPos.length; i++) {
            if (arrayPos[i] % 2 == 0) {
                arrayPos[i] += 1;
            } else if (arrayPos[i] % 2 != 0) {
                arrayPos[i] -= 1;
            }
        }
        System.out.println("\n\nArray tras aumentar en 1 los numeros pares y decrementar en 1 los impares:");
        mostrarArray();
    }

    public static void mostrarArray() {


        for (int i = 0; i < arrayPos.length; i++) {
            System.out.print(arrayPos[i] + ", ");
        }
    }

    public static void duplicadoMenor5() {
        for (int i = 0; i < arrayPos.length; i++) {
            if (arrayPos[i] >= 0 && arrayPos[i] < 5) {
                arrayPos[i] *= 2;
            }

        }
        System.out.println("\n\nArray tras duplicar los positivos menores de 5:");
        mostrarArray();
    }

    public static void sumaMasMenos5Aleatorio() {
        //- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        System.out.println("Los aleatorios a sumar son:");
        for (int i = 0; i < arrayPos.length; i++) {
            int aleatorio;
            aleatorio = (int) (Math.random() * 11) - 5;
            System.out.print(aleatorio + ", ");
            arrayPos[i] += aleatorio;
        }
        System.out.println("\n");
        System.out.println("\n\nArray tras sumar enteros entre +-5:");
        mostrarArray();
    }

    public static void rotacionDerecha() {
        //- Mover los datos una posición hacia la derecha (1º almacenar ultimo valor, para darselo a posicion 0 más tarde
        int ultimoValor = arrayPos[arrayPos.length - 1];
        for (int i = arrayPos.length - 1; i > 0; i--) {
            arrayPos[i] = arrayPos[i - 1];
        }
        arrayPos[0] = ultimoValor;
        System.out.println("\n\nRotacion derecha: "); // comprobador del ultimo valor
        mostrarArray();
    }

    public static void intercambioPos() {
        //-  Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
        for (int i = 0; i < arrayPos.length - 1; i += 2) {
            //if (arrayPos[i]%2!=0){  // asi me salio sin ayuda de chat, pero fallaba en 2 parejas de 5, al quitar esta linea sale perfecto
            int temp = arrayPos[i];
            arrayPos[i] = arrayPos[i + 1];
            arrayPos[i + 1] = temp;
            // }
        }
        System.out.println("\n\nintercambio posiciones: "); // comprobador del ultimo valor
        mostrarArray();
    }

    public static void invertirArray() {
        // comida de cabeza, haciendo un for anidado, no funcionaba pero habia que hacer lo mismo dentro del unico FOR
        int auxiliar0 = arrayPos[0];
        System.out.println("\n\nArray invertido: ");
        for (int i = arrayPos.length - 1, j = 0; i >= 0; i--, j++) {
            inverso[j] = arrayPos[i];
        }
        // esto para igualar el inverso, y no tener que hacer muchos auxiliares
        for (int i = 0; i < arrayPos.length - 1; i++) {
            arrayPos[i] = inverso[i];
        }
        arrayPos[arrayPos.length - 1] = auxiliar0; // colocar aux 0 en ultima pos
        mostrarArray();
    }

    public static void mostrarPrimParUltImpar() {
        //- Mostrar la posición del primer par y del último impar.
        mostrarArray();
        System.out.println("\n\nPosicion Primer Par y ultimo Impar: ");
        for (int i = 0; i< arrayPos.length-1; i++) {
            if (arrayPos[i]%2==0){
                System.out.println("La posicion del primer par es: " +i+ ", y su contenido: "+arrayPos[i]);
                break;
            }
        }
        for (int i = arrayPos.length-1; i >=0 ; i--) {
            if (arrayPos[i]%2!=0){
                System.out.println("La posicion del ultimo impar es: " +i+ ", y su contenido: "+arrayPos[i]);
                break;
            }
        }


    }
}
