package model;

public class Coche {
    //las opciones que tiene el coche
    private String marca, modelo, matricula;
    private int cv, velocidadMaxima, kmRecorridos;

    public Coche() {
    }// Coche default

    public Coche(String marca, String modelo, String matricula,int cv, int velocidadMaxima, int kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula=matricula;
        this.cv=cv;
        this.velocidadMaxima=velocidadMaxima;
        this.kmRecorridos=kmRecorridos;

    }


}


