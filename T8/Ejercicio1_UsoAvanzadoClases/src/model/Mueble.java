package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Mueble extends Producto implements Inventariable{
    private String material;
    private int peso;


    public Mueble(double precio, String material, int peso) {
        super(precio);
        this.material = material;
        this.peso = peso;
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
