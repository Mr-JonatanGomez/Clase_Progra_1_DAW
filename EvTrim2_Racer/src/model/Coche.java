package model;

import java.util.Scanner;

public class Coche {
    //las opciones que tiene el coche
    private String marca, modelo, matricula;
    private int cv, velocidadMaxima, kmRecorridos;

    public Coche() {
    }// Coche default

    public Coche(String marca, String modelo, String matricula,int cv, int velocidadMaxima, int kmRecorridos){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula=matricula;
        this.cv=cv;
        this.velocidadMaxima=velocidadMaxima;
        this.kmRecorridos=kmRecorridos;
    }

    public int aceleron (int kmRecorridos){
        Scanner sc= new Scanner(System.in);
        int aceleracion=0;
        int velocidadConseguida;

        System.out.println("Indica cuanto quieres acelerar (minimo 10km/h, máximo 100km/h");
        do {
            aceleracion= sc.nextInt();
        }while (aceleracion <10 || aceleracion>100);

        if (cv <100){
            velocidadConseguida= (int) Math.random()*aceleracion;
            kmRecorridos+= velocidadConseguida*0.5;
        }
        if (cv >=100){
            velocidadConseguida= (int) (Math.random()*aceleracion)+10;
            kmRecorridos+= velocidadConseguida*0.5;
        }


        System.out.println("Los kilometros recorridos hasta ahora: "+kmRecorridos);
    return kmRecorridos;
    }
    public void mostrarDatos(){
        System.out.println("Marca: "+this.marca);// o nombre sin this, cuando acostumbremos
        System.out.println("Modelo: "+modelo);
        System.out.println("Potencia: "+cv+" cv");
        System.out.println("Velocidad Máxima: "+velocidadMaxima+" km/h");
        System.out.println("Matricula: "+matricula);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}


