package model;

public class MotoCarretera extends Vehiculo{
    private String tipoNeumatico;

    public MotoCarretera(){}

    public MotoCarretera(int bastidor, String marca, String modelo, int cc, int cv, String tipoNeumatico) {
        super(bastidor, marca, modelo, cc, cv);
        this.tipoNeumatico = tipoNeumatico;
    }


    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+30);
        // establecerVelocidad (coger velocidad()+ velocidadParametro+ aleatorio0-30+30)
    }

    public void realizarCaballito (){
        System.out.println("Estás realizando caballito");
    }



    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("tipoNeumatico"+ tipoNeumatico+"\n");
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }
}
