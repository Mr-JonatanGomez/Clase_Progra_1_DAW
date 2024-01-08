import java.util.Scanner;

/*4. (PosicionesArray) Crea una aplicación que:
    x- pida por teclado la longitud de un array
    x- cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0
      pasa a la posición 1 y así sucesivamente. El elemento que está en la
      última posición pasa a la primera
    - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente*/
public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce longitud array: ");
        int longitud = sc.nextInt();
        int[] array = new int[longitud];

        System.out.println("Introduce todos los datos del array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("El Array es: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print("\t" + array[i]);//imprimimos array
        }





//ROTA DCHA

        int auxUlt = array.length - 1;
        int valorAux = array[auxUlt];
        System.out.println("\nel aux es " + valorAux);
        System.out.println("\nTras rotar a derecha el array es: ");

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = valorAux; // reescribimos el valor de [0]
       //imprimir
        for (int elem : array) {
            System.out.print(elem + "\t");
        }
        System.out.println("");
        System.out.println("");
// ROTA IZQ

        System.out.println("El Array ahora es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);//imprimimos array
        }

        int auxPrim = array[0];
        System.out.println("\nel valor auxPrim es " + auxPrim);
        System.out.println("Tras rotar a izquierda el array es: ");

        for (int i =0; i <  array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1] = auxPrim; // al poner la p0 a p1...p2 es p3, nos falta decir que la ultima pos. es el valor aux

        for (int elem : array) {
            System.out.print(elem + "\t");
        }
        // ROTA IZQ SEGUNDA

        System.out.println("El Array ahora es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);//imprimimos array
        }

        int auxPrim2 = array[0];
        System.out.println("\nel valor auxPrim es " + auxPrim2);
        System.out.println("Tras rotar a izquierda 2 veces el array es: ");

        for (int i =0; i <  array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length-1] = auxPrim2; // al poner la p0 a p1...p2 es p3, nos falta decir que la ultima pos. es el valor aux

        for (int elem : array) {
            System.out.print(elem + "\t");
        }}

}
/*
public static void intercambioPos() {
        //-  Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
        for (int i = 0; i < arrayPos.length-1; i++) {
            if (arrayPos[i]%2==0){
                int temp =arrayPos[i];
                arrayPos[i]=arrayPos[i+1];
                arrayPos[i+1]=temp;
            }
        }
    }
*/