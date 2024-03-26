package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Triangulo extends Figura2D implements FiguraGeometrica{
    private int lado1,lado2,lado3;

    public Triangulo() {}
    public Triangulo(int lado1, int lado2, int lado3) {

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Triangulo(String nombre, double perimetro, int lado1, int lado2, int lado3) {
        super(nombre, perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(getLado1()+getLado2()+getLado3());
        return getPerimetro();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("lado1 = " + lado1);
        System.out.println("lado1 = " + lado2);
        System.out.println("lado1 = " + lado3);
    }
}
