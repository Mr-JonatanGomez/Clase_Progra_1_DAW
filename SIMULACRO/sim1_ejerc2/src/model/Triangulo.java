package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@Setter
@Getter
public class Triangulo extends Figura2D{
    private double lado1, lado2,lado3;

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(lado1+lado2+lado3);
        return getPerimetro();
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "nombre=" + getNombre() +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        return Double.compare(lado1, triangulo.lado1) == 0 && Double.compare(lado2, triangulo.lado2) == 0 && Double.compare(lado3, triangulo.lado3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, lado3);
    }
}
