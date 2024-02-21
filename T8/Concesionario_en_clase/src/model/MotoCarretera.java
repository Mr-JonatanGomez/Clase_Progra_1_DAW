package model;

public class MotoCarretera extends Vehiculo{
    private String tipoNeumatico;

    public MotoCarretera(){}

    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+30);
    }

    public MotoCarretera(int bastidor, String marca, String modelo, int cc, int cv, String tipoNeumatico) {
        super(bastidor, marca, modelo, cc, cv);
        this.tipoNeumatico = tipoNeumatico;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("tipoNeumatico"+ tipoNeumatico);
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }
}
