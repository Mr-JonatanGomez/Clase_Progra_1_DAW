package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Alimento;
import model.Inventariable;
import model.Mueble;
import model.Producto;

import java.util.ArrayList;
@NoArgsConstructor
@Setter
@Getter
public class Supermercado {
    private ArrayList<Producto>listaProducto;

    public Supermercado(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public void registrarProducto(Producto producto){
        listaProducto.add(producto);
    }



}
