package model;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    private ArrayList<Surtidor>listadoSurtidor;
    private int ganancias;


    public Gasolinera() {}
    public Gasolinera (String nombre){
        this.nombre=nombre;
        this.ganancias=0;
        this.listadoSurtidor= new ArrayList<>();
    }

    public int obtenerGanancias(){
        return ganancias;
    }

    public void agregarSurtidor(Surtidor surtidor){
        this.listadoSurtidor.add(surtidor);
    }


    //GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getListadoSurtidor() {
        return listadoSurtidor;
    }

    public void setListadoSurtidor(ArrayList<Surtidor> listadoSurtidor) {
        this.listadoSurtidor = listadoSurtidor;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
