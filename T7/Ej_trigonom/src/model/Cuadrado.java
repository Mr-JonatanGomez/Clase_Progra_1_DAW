package model;

import java.util.Scanner;

public class Cuadrado {
    private int baseYaltura;
    private double area, perimetro;

    public Cuadrado() {
    }

    public Cuadrado(int baseYaltura) {
        this.baseYaltura = baseYaltura;

    }

    public double calcularArea() {
        area = baseYaltura * baseYaltura;
        //System.out.println("Un cuadrado con base de " + baseYaltura + ", tiene POR COJONES altura de " + baseYaltura + ", tiene un area de " + area);
        return area;
    }

    public double calcularPerimetro() {
        perimetro = (2 * (double) baseYaltura) + (2 * (double) baseYaltura);

        return perimetro;
    }

    public void mostrarDatos(){
        System.out.println("Un cuadrado con base y altura de " + baseYaltura);
        if (perimetro<1){
            System.out.println("tiene un area de " + getArea());
        } else if (area<1) {
            System.out.println("tiene un perimetro de " + getPerimetro());
        } else {
            System.out.println("tiene un area de "+getArea()+", tiene un perimetro de " + getPerimetro());
        }

    }

    public void trabajarCuadrados() {
        System.out.println("\tTRABAJANDO CON CUADRADOS");

        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\t QUE OPERACION QUIERES HACER:\n" +
                    "1-METER DATOS\n" +
                    "2-CALCULAR AREA\n" +
                    "3-CALCULAR PERIMETRO\n" +
                    "4-CALCULAR AREA Y PERIMETRO\n" +
                    "5-MOSTRAR DATOS\n" +
                    "6-SALIR");

            switch (opcion=sc.nextInt()) {
                case 1:
                    System.out.println("introduce medida del lado");
                    setBaseYaltura(sc.nextInt());
                    break;
                case 2:
                    calcularArea();
                    System.out.println("area calculada");
                    break;
                case 3:
                    calcularPerimetro();
                    System.out.println("perimetro calculado");
                    break;

                case 4:
                    calcularArea();
                    calcularPerimetro();
                    System.out.println("area y perimetro calculados");
                    break;
                case 5:
                    mostrarDatos();

                    break;
                case 6:
                    System.out.println("Volviendo al menú PRINCIPAL");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion!=6);


    }

    //GETTERS&SETTERS


    public int getBaseYaltura() {
        return baseYaltura;
    }

    public void setBaseYaltura(int baseYaltura) {
        this.baseYaltura = baseYaltura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}