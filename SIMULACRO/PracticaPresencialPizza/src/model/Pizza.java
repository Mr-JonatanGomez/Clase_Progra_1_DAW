package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Setter
@Getter
public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> listaIngredientesPizzaP;


    public Pizza() {
        this.precio = 10.75;
        this.listaIngredientesPizzaP = new ArrayList<>();
    }

    public Pizza(String nombre, double precio, ArrayList<Ingrediente> listaIngredientes) {
        this.nombre = nombre;
        this.precio = 10.75;
        this.listaIngredientesPizzaP = new ArrayList<>();

    }

    public void mostrarDatos() {
        System.out.println("Nombre "+nombre);
        System.out.println("Precio "+precio);
        for (Ingrediente item:listaIngredientesPizzaP) {
            System.out.println(item.getNombre()+",");
        }
    }

    public void calcularPrecio() {
        for (Ingrediente item: listaIngredientesPizzaP) {

            precio+=item.getPrecio();
        }
    }
}
