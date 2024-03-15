package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter


public class Alimento extends Producto implements Inventariable{
    private String calidad, origen;
    private ArrayList<Alimento>listaAlimentos;

    public Alimento(){
        this.listaAlimentos=new ArrayList<>();
    }
    public Alimento(double precio, String calidad, String origen) {
        super(precio);
        this.calidad = calidad;
        this.origen = origen;
        this.listaAlimentos= new ArrayList<>();
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
