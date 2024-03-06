package model;

import java.util.Scanner;

public class Triangulo {
    private int base, altura;
    private double area;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    public double calculaArea() {
        area = ((double) getBase() * (double) getAltura()) / 2;
        //System.out.println("Un triangulo con base: "+base+", y una altura de "+altura+", tiene un area de "+area);
        return area;
    }

    public void mostrarDatos() {
        System.out.println("Un triangulo con base: " + getBase() + ", y una altura de " + getAltura() + ", tiene un area de " + getArea());

    }

    public void trabajarTriangulos() {
        System.out.println("\tTRABAJANDO CON TRIANGULOS");

        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\t QUE OPERACION QUIERES HACER:\n" +
                    "1-METER DATOS\n" +
                    "2-CALCULAR AREA\n" +
                    "3-MOSTRAR DATOS\n" +
                    "4-SALIR");

            switch (opcion=sc.nextInt()) {
                case 1:
                    System.out.println("introduce base");
                    setBase(sc.nextInt());
                    System.out.println("introduce altura");
                    setAltura(sc.nextInt());
                    break;
                case 2:
                    calculaArea();
                    System.out.println("area calculada");
                    break;
                case 3:
                    mostrarDatos();
                    break;
                case 4:
                    System.out.println("Volviendo al menú PRINCIPAL");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion!=4);


    }


    // GETTERS&SETTERS


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
