package model;

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