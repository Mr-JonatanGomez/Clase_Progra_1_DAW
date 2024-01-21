import java.util.Scanner;

public class E3 {
    /*Realiza un programa que calcule la nota que hace falta sacar
    en el segundo examen de la asignatura Programación para obtener
    la media deseada. Hay que tener en cuenta que la nota del primer
    examen cuenta el 40% y la del segundo examen un 60%.

    Nota: la nota final se calcularía como notaFinal = ((nota_examen1 * 40) +
     (nota_examen2 * 60)) / 100*/


    static float notaExamen1;
    static float notaPonderado1;
    static float notaDeseadaGlobal;
    static float notaPonderada2n;
    static float notaExamen2;

    static Scanner sc = new Scanner(System.in);

    public static float calculoNecesitado(float ponderada1, float ponderada2) {
        notaPonderado1 = notaExamen1 * 0.4f;
        notaPonderada2n = notaDeseadaGlobal - notaPonderado1;
        notaExamen2 = notaPonderada2n / 0.6f;

        return notaExamen2;
    }

    public static void main(String[] args) {
        System.out.println("Introduce nota sacada en primer examen");
        notaExamen1 = sc.nextFloat();
        System.out.println("Introduce nota media deseada");
        notaDeseadaGlobal = sc.nextFloat();

        calculoNecesitado(notaPonderado1, notaPonderada2n);// aqui le paso los parametros
        System.out.println(" NECESITAS SACAR UN: " + notaExamen2 + " PARA UNA MEDIA DE: " + notaDeseadaGlobal);
    }
}