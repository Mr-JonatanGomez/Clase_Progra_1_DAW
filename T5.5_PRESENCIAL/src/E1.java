import java.util.Scanner;

public class E1 {
    static  double cono;


    public static double calculoVolumen (double medidaRadio, double medidaAltura){
        double volumen = (Math.PI*(Math.pow(medidaRadio,2))*medidaAltura)/3;
        return volumen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la medida del radio");
        double n = scanner.nextDouble();
        System.out.println("Introduce la medida de la altura");
        double a = scanner.nextDouble();

        System.out.println(calculoVolumen(n,a));
    }
}