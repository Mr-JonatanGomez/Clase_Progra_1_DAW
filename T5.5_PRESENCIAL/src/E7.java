import java.util.Scanner;

public class E7 {
    /*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos
entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número
destacado entre dobles asteriscos.
Nota: para generar los números aleatorios podemos utilizar n = (int)(Math.random() * 501);*/

    static int[] arrayAleatorio = new int[10];//cambiar a 100
    static int rangoMaximo = 5;//cambiar a 500
    static int numeroMaximo = 0;
    static int numeroMinimo = rangoMaximo;


    public static void rellenarArray() {
        int posicion = 0;
        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = (int) (Math.random() * (rangoMaximo + 1));
            /*System.out.println("posicion :"+posicion+", contenido del array: "+arrayAleatorio[i]);
            posicion++;*/
        }
    }

    public static void mostrarArray() {
        for (int items : arrayAleatorio) {
            System.out.print(items + ", ");
        }
    }

    public static void maximoMinimo() {
        for (int items : arrayAleatorio) {
            if (items > numeroMaximo) {
                numeroMaximo = items;
            } else if (items<numeroMinimo) {
                numeroMinimo = items;
            }
        }
    }

    public static void main(String[] args) {
        rellenarArray();
        mostrarArray();
        maximoMinimo();
        System.out.println("Quieres mostrar el numero máximo o el minimo contenido en el array?" +
                "\n Introduzca MAX o MIN");
        Scanner sc= new Scanner(System.in);
        if (sc.next().equalsIgnoreCase(String maximo)){

        }
    }

}
