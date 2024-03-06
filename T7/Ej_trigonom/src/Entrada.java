import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

// pasar parametros por scanner para menu

        Triangulo triangulo = new Triangulo(0,0);
        Circulo circulo = new Circulo (0);
        Cuadrado cuadrado= new Cuadrado(0);

        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Introduce con que quieres trabajar:\n" +
                    "1-TRIANGULOS\n2-CIRCULOS\n3-CUADRADOS\n4-SALIR");
            switch (opcion=sc.nextInt()){
                case 1:
                    triangulo.trabajarTriangulos();
                    break;
                case 2:
                    circulo.trabajarCirculos();
                    break;
                case 3:
                    cuadrado.trabajarCuadrados();
                    break;
                case 4:
                    System.out.println("APAGA Y VAMONOS");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;


            }
        }while(opcion!=4);



    }
}
