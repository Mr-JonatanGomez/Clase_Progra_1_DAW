package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor

public class Mueble extends Producto implements Inventariable{
    private String material;
    private int peso;
    private ArrayList<Mueble>listaMuebles;

    public Mueble() {
        this.listaMuebles=new ArrayList<>();

    }
    public Mueble(double precio, String material, int peso) {
        super(precio);
        this.material = material;
        this.peso = peso;
        this.listaMuebles=new ArrayList<>();
    }

    public String mostrarDatos(){
        super.mostrarDatos();
        //es como sout
        return "calidad: "+getMaterial()+", peso: "+getPeso();
    }

    @Override
    public double calcularPrecio() {

        double aplicarIVA=ivaMuebles/100;
        double precioFinal=getPrecio()*aplicarIVA;
        System.out.print("el precio tras aplicar IVA: ");
        return precioFinal;
    }
}
