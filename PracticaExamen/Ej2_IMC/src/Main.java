import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 11 de Mayo     16:46--->17:03
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, sexo;
        double alturacm, peso, IMC;
        int edad;


        System.out.println("Introduce tu nombre");
        nombre = sc.next();
        System.out.println("Introduce tu apellido");
        apellido = sc.next();
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        System.out.println("Introduce tu altura en metros (el decimal con COMA)");
        alturacm = sc.nextDouble();
        System.out.println("Introduce tu peso(el decimal con COMA)");
        peso = sc.nextDouble();
        System.out.println("Introduce tu sexo");
        sexo = sc.next();

        IMC=calculoIMC(peso, alturacm);

        System.out.println("Hola "+nombre+" "+apellido+" teniendo en cuenta tu " +
                "altura de "+alturacm+" centimetros y tu peso de "+peso+" kilos, " +
                "tu IMC es de: "+IMC);

    }
    public static double calculoIMC(double peso, double altura){
        double indice=-1;
        indice= peso/(Math.pow((altura/100),2));
        return indice;
    }
}
