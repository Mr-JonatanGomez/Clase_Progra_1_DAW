package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Circulo extends Figura2D implements FiguraGeometrica{
    private double radio;

    public Circulo() {}

    public Circulo(double radio) {

        this.radio = radio;
    }
    public Circulo(String nombre, double perimetro, double radio) {
        super(nombre, perimetro);
        this.radio = radio;
    }


    @Override
    public double calcularPerimetro() {
        setPerimetro(2*(getRadio())*Math.PI);
        return getPerimetro();

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("radio = " + radio);
    }
}
