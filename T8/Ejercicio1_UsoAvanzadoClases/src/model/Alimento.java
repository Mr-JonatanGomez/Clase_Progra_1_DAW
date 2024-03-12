package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Alimento extends Producto implements Inventariable{
    private String calidad, origen;

    public Alimento(double precio, String calidad, String origen) {
        super(precio);
        this.calidad = calidad;
        this.origen = origen;
    }

    public String mostrarDatos(){
        super.mostrarDatos();
        //es como sout
        return "calidad: "+getCalidad()+", origen: "+getOrigen();
    }

    @Override
    public double calcularPrecio() {

        double aplicarIVA=ivaAlimentos/100;
        double precioFinal=getPrecio()*aplicarIVA;
        System.out.print("el precio tras aplicar IVA: ");
        return precioFinal;
    }
}
