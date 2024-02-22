package model;

public class Electrico extends Vehiculo{
    private int autonomia;


    public Electrico() {}

    public Electrico(int bastidor, String marca, String modelo, int cc, int cv, int autonomia){
        super(bastidor, marca, modelo, cc, cv);
        this.autonomia = autonomia;
    }

    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+10);
    }

    public void activarEcoMode (){
        System.out.println("Estás en modo Eco");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Autonomia"+autonomia+"\n");
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
