import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        int[] numerosUsuario = new int[5];
        int[] numeroAleatorios = new int[5];
        boolean repetido;
        int aciertos = 0;
        int aleatorio;

        //5 numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 5 numeros diferentes entre 1 y 10");
        for (int i = 0; i < numerosUsuario.length; i++) {
            numerosUsuario[i] = sc.nextInt();
        }

        System.out.println(" PASANDO A MAQUINA");
        // numero aleatorio

        for (int i = 0; i < numeroAleatorios.length; i++) {

            repetido=false;
            aleatorio = (int) (Math.random() * 10) + 1;

            numeroAleatorios[i] = aleatorio;//quitar para repe


            //CUENTA ACIERTOS
            for (int numero : numerosUsuario) {
                if (numero == aleatorio) {
                    aciertos++;
                }
            }
        }

        //mostrar los del usuario, los de maquina, y los aciertos
        System.out.println("NUMEROS USUARIOS");
        for (Integer item : numerosUsuario) {
            System.out.print(item + "\t");
        }
        System.out.println();
        System.out.println("NUMEROS DE MAQUINA:");
        for (Integer item : numeroAleatorios) {
            System.out.print(item + "\t");
        }
        System.out.println("\nNUMERO DE ACIERTOS: " + aciertos);

    }


}

