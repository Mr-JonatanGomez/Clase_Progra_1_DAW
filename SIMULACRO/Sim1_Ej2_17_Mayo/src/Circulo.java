import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@Setter
@Getter
public class Circulo extends Figura2D{
    private double radio;


    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro= 2*Math.PI*radio;
        return perimetro;

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return Double.compare(radio, circulo.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radio);
    }
}
