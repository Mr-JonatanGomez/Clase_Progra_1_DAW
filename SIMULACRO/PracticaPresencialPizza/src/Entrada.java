import controller.Restaurante;
import model.Ingrediente;
import model.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ingrediente tomate = new Ingrediente("tomate", 1);
        Ingrediente jamon = new Ingrediente("jamon", 1);
        Ingrediente queso = new Ingrediente("queso", 1);
        Ingrediente bacon = new Ingrediente("bacon", 1);
        Ingrediente barbacoa = new Ingrediente("barbacoa", 1);
        Ingrediente cebolla = new Ingrediente("cebolla", 1);
        Ingrediente pinneapple = new Ingrediente("pinneapple", 0.25);
        Ingrediente rata = new Ingrediente("rata", 3.67);

        Pizza pizza = new Pizza();
        Restaurante restaurante = new Restaurante();
        ArrayList<Ingrediente> listaIngrediente = new ArrayList<>();
        listaIngrediente.add(tomate);
        listaIngrediente.add(jamon);
        listaIngrediente.add(queso);
        listaIngrediente.add(bacon);
        listaIngrediente.add(barbacoa);
        listaIngrediente.add(cebolla);
        listaIngrediente.add(pinneapple);
        listaIngrediente.add(rata);

        //ArrayList<Ingrediente> listaIngredientePizza = new ArrayList<>();

        pizza.getListaIngredientesPizzaP();
        System.out.println("Introduzca nombre de su pizza");
        pizza.setNombre(sc.next());
        String noMas = null;
        do {
            System.out.println("Introduzca ingrediente de uno en uno");
            String ingrediente = sc.next();
            if (ingrediente.equalsIgnoreCase("tomate")) {
                pizza.getListaIngredientesPizzaP().add(tomate);
            } else if (ingrediente.equalsIgnoreCase("jamon")) {
                pizza.getListaIngredientesPizzaP().add(jamon);
            } else if (ingrediente.equalsIgnoreCase("queso")) {
                pizza.getListaIngredientesPizzaP().add(queso);
            } else if (ingrediente.equalsIgnoreCase("bacon")) {
                pizza.getListaIngredientesPizzaP().add(bacon);
            } else if (ingrediente.equalsIgnoreCase("barbacoa")) {
                pizza.getListaIngredientesPizzaP().add(barbacoa);
            } else if (ingrediente.equalsIgnoreCase("cebolla")) {
                pizza.getListaIngredientesPizzaP().add(cebolla);
            } else if (ingrediente.equalsIgnoreCase("pinneaple")) {
                pizza.getListaIngredientesPizzaP().add(pinneapple);
            } else if (ingrediente.equalsIgnoreCase("rata")) {
                pizza.getListaIngredientesPizzaP().add(rata);
            } else {
                System.out.println("Ingrediente no identificado");
            }
            System.out.println("Quieres más ingredientes?");
            noMas = sc.next();
        } while (noMas.equalsIgnoreCase("si"));

        for (Ingrediente item : pizza.getListaIngredientesPizzaP()) {
            pizza.setPrecio(pizza.getPrecio() + item.getPrecio());

        }
        pizza.mostrarDatos();

    }
}
