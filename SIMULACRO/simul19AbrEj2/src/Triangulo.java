import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Triangulo extends Figura2D{

    private double lado1, lado2, lado3;


    public Triangulo() {}

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
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

    @Override
    public double calcularPerimetro(){
        double perimetro;
        perimetro = lado1+lado2+lado3;
        System.out.println("perimetro "+perimetro+"\n");
        return perimetro;
    }
}
