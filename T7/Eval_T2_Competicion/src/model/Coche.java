package model;

public class Coche {
    private String marca, modelo, matricula;
    private int cv, velocidad, kmRecorridos;

    public Coche(){}
    public Coche(String marca,String modelo, String matricula, int cv){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.cv=cv;
        this.velocidad= 0;
        this.kmRecorridos=0;
    }

    public int acelerar (int aceleracion ){

        int kmHechosConAcelerar;
        aceleracion= (int) (Math.random() * 50) + 10;


        if (cv < 100) {
            velocidad += (int) (Math.random() * aceleracion);
            kmHechosConAcelerar = velocidad / 2;

        } else if (cv>=100 && cv <=200) {
            velocidad += (int) (Math.random() * aceleracion)+10;
            kmHechosConAcelerar = velocidad / 2;
        } else {
            velocidad += (int) (Math.random() * aceleracion)+20;
            kmHechosConAcelerar = velocidad / 2;
        }

        kmRecorridos += kmHechosConAcelerar;
        return kmRecorridos;
    }

    public void mostrarDatos() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + this.marca);// o nombre sin this, cuando acostumbremos
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + cv + " cv");
    }



}
