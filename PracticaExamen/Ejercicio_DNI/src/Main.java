import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
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
        System.out.println("introduce tu dni sin letra");
        int dni = sc.nextInt();

        generarLetra(dni);

        System.out.println("PARTE 2 introduce tu dni sin letra");
        int dni2 = sc.nextInt();
        System.out.println("introduce la letra que crees que tiene el dni y verifica");
        String letra = sc.next();
        introduceDNIyLetraVerSiEsCorrecto(dni2, letra);

       */
        ordenando();
    }

    public static String generarLetra(int dni) {
        Scanner sc = new Scanner(System.in);
        int resto = -1;
        String letraTuya = null;


        String[] letrasDNI = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = dni % 23;

        //System.out.println(resto);
        letraTuya = (letrasDNI[resto]);
        System.out.println(letraTuya);
        return letraTuya;
    }

    public static void introduceDNIyLetraVerSiEsCorrecto(int dni, String letra) {
        int resto = -1;
        String letraTuya = null;


        String[] letrasDNI = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = dni % 23;


        //System.out.println(resto);
        letraTuya = (letrasDNI[resto]);

        if (letraTuya.equalsIgnoreCase(letra)) {
            System.out.println("Has letra del DNI es correcto");
        } else {
            System.out.println("La letra es incorrecta, para este dni " + dni + " es la letra: " + letraTuya);
            System.out.println("La letra que buscabas es" + letraTuya);
        }

    }

    public static void ordenando(){
        int [] posicion = new int[]{0,1,2,3,4,5,6,7,8,9};
        ArrayList <Integer> posiciones = new ArrayList<>();
        posiciones.add(4);
        posiciones.add(7);
        posiciones.add(6);
        posiciones.add(10);
        posiciones.add(5);
        posiciones.add(8);
        posiciones.add(2);
        posiciones.add(1);
        posiciones.add(3);
        posiciones.add(9);
        posiciones.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                } else if (o1 < o2){
                    return -1;
                } else{
                    return 0;
                }
            }
        });

        System.out.print(posiciones);

        System.out.println("ARRAY SACANDO POSICION desde que i=3 hasta final");
        for (int i = 3; i < posicion.length; i++) {
            System.out.println(i);
        }
    }
}

