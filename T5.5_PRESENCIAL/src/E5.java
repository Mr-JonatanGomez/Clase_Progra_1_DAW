import java.util.Scanner;

public class E5 {
    /*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El
palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce altura para la L");
        int altura= sc.nextInt();
        int base=(altura/2)+1;

        for (int i = 0; i < altura; i++) {
            if (i < altura - 1) {
                System.out.print("*\n");
            }else{
                System.out.print("* ");
            }
        }
        for (int i = 0; i < base-1; i++) {
            System.out.print("* ");
        }

    }
}
