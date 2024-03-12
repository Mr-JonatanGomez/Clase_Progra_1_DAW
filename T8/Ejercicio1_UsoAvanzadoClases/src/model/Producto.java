package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Producto {
    //ArrayList<Producto> listaProductos;
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public String mostrarDatos(){
        return "precio: "+getPrecio()+"€";
    }


}
