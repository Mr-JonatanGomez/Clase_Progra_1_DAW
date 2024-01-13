import java.util.Scanner;

public class Ejercicio4_Horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = 1;
        int minutos = 60;
        int horas = 3600;
        int resto;
        int resto2;


        System.out.println("Introduce los segundos que quieras convertir en horas, minutos y segundos");
        int segundosTotales = scanner.nextInt();

        // meter 5000 segundos, debe dar 1 hora 23 minutos y 20 segundos
        horas = segundosTotales/3600; // 1.38888888 hora (rest 1400)
        resto = segundosTotales%3600; // 1400 segundos
        minutos = resto/60; // 1400/60= 23.333 minutos (rest 0.333=20)
        resto2 = resto-minutos*60;
        segundos = resto2;


        System.out.println(resto);
        System.out.println(resto2);
        System.out.println(scanner+"son:");
        System.out.println(horas+" horas, "+minutos+" mintuos, "+segundos+" segundos");


    }
}
