package model;

import java.util.Scanner;

public class Circulo {
    private double radio, diametro, area;

    public Circulo() {}
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea (){
        area=Math.PI*(Math.pow(radio,2));
        System.out.println("Un circulo con radio de "+radio+", tiene un area de "+area);
        return area; //Por si lo meto con pedida de parametros
    }

    public double calcularDiametro(){
        diametro=radio*2;
        System.out.println("Un circulo con radio de "+radio+", tiene un diametro de "+diametro);
        return diametro;
    }

    public void mostrarDatos(){
        if (getArea()<0.001){
            System.out.println("El area no ha sido calculada");
        }else if (getDiametro()<0.002){
            System.out.println("El diametro no ha sido calculado");
        }else {
            System.out.println("El circilo tiene un area de " + getArea()+ ", y un diametro"+getDiametro());
        }
    }

    public void trabajarCirculos() {
        System.out.println("\tTRABAJANDO CON CIRCULOS");

        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\t QUE OPERACION QUIERES HACER:\n" +
                    "1-METER DATOS\n" +
                    "2-CALCULAR AREA\n" +
                    "3-CALCULAR DIAMETRO\n" +
                    "4-CALCULAR AREA Y DIAMETRO\n" +
                    "5-MOSTRAR DATOS\n" +
                    "6-SALIR");

            switch (opcion=sc.nextInt()) {
                case 1:
                    System.out.println("introduce radio");
                    setRadio(sc.nextInt());
                    break;
                case 2:
                    calcularArea();
                    System.out.println("area calculada");
                    break;
                case 3:
                    calcularDiametro();
                    System.out.println("diametro calculada");
                    break;

                case 4:
                    calcularArea();
                    calcularDiametro();
                    System.out.println("area y diametro calculados");
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


    //GETTERES&SETTERS

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
