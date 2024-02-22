package model;

public class Todoterreno extends Vehiculo{
    private int traccion;

    public Todoterreno (){}



    public Todoterreno(int bastidor, String marca, String modelo, int cc, int cv, int traccion) {
        super(bastidor, marca, modelo, cc, cv);
        this.traccion = traccion;
    }

    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad);
    }
    public void subirMontaña (){
        System.out.println("Estás subiendo montaña");
    }


    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("traccion"+ traccion+"\n");
    }

    public int getTraccion() {
        return traccion;
    }

    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }
}
