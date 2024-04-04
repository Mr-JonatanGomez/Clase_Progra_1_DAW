package model;

public class Circulo extends Figura2D{

private int radio;
    public Circulo() {}

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerim() {
        setPerimetro(Math.PI*2*radio);
        return getPerimetro();
    }
}
