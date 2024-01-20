import java.util.Scanner;

public class E3 {
    /*Realiza un programa que calcule la nota que hace falta sacar
    en el segundo examen de la asignatura Programación para obtener
    la media deseada. Hay que tener en cuenta que la nota del primer
    examen cuenta el 40% y la del segundo examen un 60%.

    Nota: la nota final se calcularía como notaFinal = ((nota_examen1 * 40) +
     (nota_examen2 * 60)) / 100*/


    static double notaExamen1;
    static double valorExamen1;
    static double notaDeseada;

    static Scanner sc = new Scanner(System.in);

    public static void sacadoExamen1(){
        System.out.println("Introduce nota sacada en primer examen");
        notaExamen1= sc.nextDouble();
        valorExamen1= notaExamen1 *0.4;
        System.out.println("Valor de tu nota 1(40%) "+valorExamen1);
    }

    public static void notaQuieres(){
        System.out.println("Introduce nota media deseada");
        notaDeseada= sc.nextDouble();
    }

    public static void calculoNecesito(){
        double valor2Necesitado = notaDeseada - valorExamen1;
        System.out.println("necesito sacar ponderado:" +valor2Necesitado);
        double notanecesitadaExamen2 = valor2Necesitado/0.6;

        System.out.println(" NECESITAS SACAR UN:"+notanecesitadaExamen2+" PARA UNA MEDIA DE: ");
    }

    public static void main(String[] args) {
        sacadoExamen1();
        notaQuieres();
        calculoNecesito();
    }

}
