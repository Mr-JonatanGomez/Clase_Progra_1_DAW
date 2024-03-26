package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangulo extends Figura2D implements FiguraGeometrica{
    private int base, altura;

    public Rectangulo() {}

    public Rectangulo(String nombre, double perimetro, int base, int altura) {
        super(nombre, perimetro);
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(int base, int altura) {

        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro((getBase()*2+(getAltura()*2)));
        return getPerimetro();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("base = " + base);
        System.out.println("altura = " + altura);
    }
}
