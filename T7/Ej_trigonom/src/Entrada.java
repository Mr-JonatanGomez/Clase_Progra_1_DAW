import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

// pasar parametros por scanner para menu

        Triangulo triangulo = new Triangulo(7,3);
        Circulo circulo = new Circulo (10.5);
        Cuadrado cuadrado= new Cuadrado(5);

/*
        triangulo.calculaAreayMostrar();

        circulo.calcularDiametroyMostrar();
        circulo.calcularArea();

        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        System.out.println("DATOS CUADRA");
        cuadrado.mostrarDatos();
*/
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
                    // trabajr con...
                case 3:
                    // trabajar con
                case 4:
                    System.out.println("APAGA Y VAMONOS");

            }
        }while(opcion!=4);



    }
}
