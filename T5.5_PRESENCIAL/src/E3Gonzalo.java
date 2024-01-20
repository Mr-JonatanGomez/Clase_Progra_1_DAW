import java.util.Scanner;

public class E3Gonzalo {
    static double examen1Ponderado;
    static double mediaDeseada;
    public static void main(String[] args) {
        System.out.println("Introduce la nota del primer examen");

        Scanner scanner = new Scanner(System.in);
        double examen1 = scanner.nextDouble();
        examen1Ponderado = examen1*0.4;

        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        mediaDeseada = scanner.nextDouble();

        System.out.println("La nota que necesitas sacar es "+examenFinal());

    }

    public static double examenFinal(){
        double examen2Ponderado = mediaDeseada-examen1Ponderado;
        double examen2 = examen2Ponderado/0.6;

        return examen2;
    }
}