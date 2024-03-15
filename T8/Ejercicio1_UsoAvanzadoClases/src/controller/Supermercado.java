package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Alimento;
import model.Inventariable;
import model.Mueble;
import model.Producto;

import java.util.ArrayList;

@Setter
@Getter
public class Supermercado {
    private ArrayList<Producto>listaProducto;

    public Supermercado() {
        this.listaProducto = new ArrayList<>();
    }

    public void registrarProducto(Producto producto){
        listaProducto.add(producto);
    }



}
