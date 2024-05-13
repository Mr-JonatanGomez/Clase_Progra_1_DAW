import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        13 MAYO- INICIO 16.38 ---> 17:05
        (se me encendio la bombilla de sacar por pantalla la posicion del array)


        CALCULAR LETRA DEL DNI

        FORMULA: dividir el numero de DNI entre 23
        y en funcion del resto obtenido (que estará entre 0 y 22)
        se asigna la letra del DNI
        T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E
        */
        Scanner sc = new Scanner(System.in);
        /*
        int dni = -1;
        int resto = -1;
        char letra;

        String[] letrasDNI = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.println("introduce un numero de DNI para calcular la letra");
        dni = sc.nextInt();
        resto = dni % 23;

        System.out.println(resto);
        System.out.println(letrasDNI[resto]);
*/
        System.out.println("introduce tu dni sin letra");
        int dni=sc.nextInt();

        generarLetra(dni);

        System.out.println("PARTE 2 introduce tu dni sin letra");
        int dni2=sc.nextInt();
        System.out.println("introduce la letra que crees que tiene el dni y verifica");
        String letra=sc.next();
        introduceDNIyLetraVerSiEsCorrecto(dni2,letra);
    }

    public static String generarLetra(int dni){
        Scanner sc = new Scanner(System.in);
        int resto = -1;
        String letraTuya=null;


        String[] letrasDNI = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = dni % 23;

        //System.out.println(resto);
        letraTuya=(letrasDNI[resto]);
        System.out.println(letraTuya);
        return letraTuya;
    }
    public static void introduceDNIyLetraVerSiEsCorrecto(int dni, String letra){
        int resto = -1;
        String letraTuya=null;


        String[] letrasDNI = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = dni % 23;


        //System.out.println(resto);
        letraTuya=(letrasDNI[resto]);

        if (letraTuya.equalsIgnoreCase(letra)){
            System.out.println("Has letra del DNI es correcto");
        } else{
            System.out.println("La letra es incorrecta, para este dni "+dni+" es la letra: "+letraTuya);
            System.out.println("La letra que buscabas es"+letraTuya);
        }

    }


}

