package model;

public class Coche {
  /*


- Un método acumularAveria que incrementará el importe gastado en averías.*/
    private Motor motor;
    private String marca, modelo;
    double precioAcumuladoAverias;

    public Coche (){}
    public Coche (String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    public void acumularAveria(){
        precioAcumuladoAverias+=getPrecioAcumuladoAverias();
    }


    //GETER&SETTER

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioAcumuladoAverias() {
        return precioAcumuladoAverias;
    }

    public void setPrecioAcumuladoAverias(double precioAcumuladoAverias) {
        this.precioAcumuladoAverias = precioAcumuladoAverias;
    }
}
