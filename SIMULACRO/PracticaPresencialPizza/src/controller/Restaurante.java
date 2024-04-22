package controller;

import lombok.Getter;
import lombok.Setter;
import model.Pizza;

import java.util.ArrayList;
@Setter
@Getter
public class Restaurante {
    private ArrayList<Pizza>listadoPizzas;
    private Pizza pizza;



    public Restaurante() {}

    public Restaurante(ArrayList<Pizza> listadoPizzas) {
        this.listadoPizzas = listadoPizzas;
    }

    public void crearPizza(){
        pizza= new Pizza();

    }
}
