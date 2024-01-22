import java.util.Scanner;

public class E7 {
    /*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos
entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número
destacado entre dobles asteriscos.
Nota: para generar los números aleatorios podemos utilizar n = (int)(Math.random() * 501);*/

    static int[] arrayAleatorio = new int[100];//cambiar a 100
    static int rangoMaximo = 500;//cambiar a 500
    static int numeroMaximo = 0;
    static int numeroMinimo = rangoMaximo;

    static String eleccion;


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
        System.out.println();

    }

    public static void mostrarArray2() {
        for (int i = 0; i < arrayAleatorio.length; i++) {
            if (i % 25 == 0){
                System.out.println();
            }
            else if (arrayAleatorio.length% i !=1)
            System.out.print(arrayAleatorio[i] + ", ");
            else if (i== (arrayAleatorio.length-1)){
                System.out.print(arrayAleatorio[i]+". ");
            }
        }
        System.out.println();
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
    public static void operacionEleccion (){
        String max = "MAX";
        String min = "MIN";
        Scanner sc= new Scanner(System.in);
        System.out.println("Quieres mostrar el numero máximo o el minimo contenido en el array?" +
                "\n Introduzca MAX o MIN");
        boolean terminar = false;
        do {
            eleccion = sc.next();

            if (eleccion.equalsIgnoreCase(max)){
                System.out.println("El numero mayor es: "+ numeroMaximo);
                terminar = true;

            }
            else if (eleccion.equalsIgnoreCase(min)){
                System.out.println("El numero menor del array es: "+ numeroMinimo);
                terminar = true;

            } else  {
                System.out.println("introduce opcion valida");

            }
        }while (!terminar);
    }
    public static void destacarEleccion() {
        if (eleccion.equalsIgnoreCase("max")){
            for (int i = 0; i < arrayAleatorio.length; i++) {
                if (i % 25 == 0){
                    System.out.println();
                } else if (arrayAleatorio[i]== numeroMaximo) {
                    System.out.print("**"+arrayAleatorio[i]+"** ");
                } else if (arrayAleatorio.length% i !=1)
                    System.out.print(arrayAleatorio[i] + ", ");
                else if (i== (arrayAleatorio.length-1)){
                    System.out.print(arrayAleatorio[i]+". ");
                }
            }
            System.out.println();

        } else if (eleccion.equalsIgnoreCase("min")){
            for (int i = 0; i < arrayAleatorio.length; i++) {
                if (i % 25 == 0){
                    System.out.println();
                } else if (arrayAleatorio[i]== numeroMinimo) {
                    System.out.print("***"+arrayAleatorio[i]+"*** ");
                } else if (arrayAleatorio.length% i !=1)
                    System.out.print(arrayAleatorio[i] + ", ");
                else if (i== (arrayAleatorio.length-1)){
                    System.out.print(arrayAleatorio[i]+". ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        rellenarArray();
        mostrarArray2();
        maximoMinimo();
        operacionEleccion();
        destacarEleccion();

        System.out.println("COMPROBADOR:");
        System.out.println("MINIMO: "+numeroMinimo);
        System.out.println("MAXIMO: "+numeroMaximo);

    }

}
