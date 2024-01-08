/*1.    (OperacionesArray)
    v- Crear un array con 10 posiciones y asígnale
        números enteros entre 0 y 9, ambos inclusive (de forma automática).
    v- Se mostrarán los datos separados por una coma y un espacio.

    Una vez hecho esto se modificará el array del de la manera indicada
    en cada apartado, y se mostrará de nuevo.
    v- Incrementar en 1 los valores pares y en -1 los impares.
    v- Duplicar los valores positivos menores que 5
    v- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
    v- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
      segundo al tercero, ..., y el último al primero).
    - Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
    - Invertir el array
    - Mostrar la posición del primer par y del último impar.

**hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones***/
public class E5 {
    private static int[] arrayPos = new int[10];
    public static void main(String[] args) {
        rellenarArray();
        mostrarArray();
        incrementoDecremento();
        mostrarArray();
        duplicadoMenor5();
        mostrarArray();
        sumaMasMenos5Aleatorio();
        mostrarArray();
        rotacionDerecha();
        mostrarArray();
        intercambioPos();
        mostrarArray();
    }
    public static void rellenarArray() {
        arrayPos = new int[10];
        System.out.println("\nEl array actualmente es: ");
        for (int i = 0; i < arrayPos.length; i++) {
            arrayPos[i] = (int) (Math.random() * 10);
        }
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
    }
    public static void sumaMasMenos5Aleatorio() {
        //- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        for (int i = 0; i < arrayPos.length; i++) {
            int aleatorio;
            aleatorio = (int) (Math.random() * 11) - 5;
            System.out.print(" aleat." + aleatorio);
            arrayPos[i] += aleatorio;


        }
        System.out.println("\n\nArray tras sumar enteros entre +-5:");
    }
    public static void rotacionDerecha() {
        //- Mover los datos una posición hacia la derecha (1º almacenar ultimo valor, para darselo a posicion 0 más tarde
        int ultimoValor = arrayPos[arrayPos.length - 1];
        for (int i = arrayPos.length - 1; i > 0; i--) {
            arrayPos[i] = arrayPos[i - 1];
        }
        arrayPos[0] = ultimoValor;
        System.out.println("\n\nRotacion derecha: "); // comprobador del ultimo valor
    }
    public static void intercambioPos() {// CASI LO TENGO
        //-  Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
        for (int i = 0; i < arrayPos.length-1; i++) {
            if (arrayPos[i]%2==0){
                int temp =arrayPos[i];
                arrayPos[i]=arrayPos[i+1];
                arrayPos[i+1]=temp;
            }
        }
        System.out.println("\n\nintercambio posiciones: "); // comprobador del ultimo valor
    }

}