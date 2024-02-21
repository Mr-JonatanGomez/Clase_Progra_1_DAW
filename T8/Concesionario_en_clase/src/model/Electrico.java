package model;

public class Electrico extends Vehiculo{
    private int autonomia;


    public Electrico() {}

    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+10);
    }

    public Electrico(int bastidor, String marca, String modelo, int cc, int cv, int autonomia){
        super(bastidor, marca, modelo, cc, cv);
        this.autonomia = autonomia;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Autonomia"+autonomia);
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
