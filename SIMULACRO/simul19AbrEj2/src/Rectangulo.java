import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Rectangulo extends Figura2D{

    private double base, altura;


    public Rectangulo() {}

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        return Double.compare(base, that.base) == 0 && Double.compare(altura, that.altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    @Override
    public double calcularPerimetro(){
        double perimetro;
        perimetro = (base*2)+(altura*2);
        System.out.println("perimetro "+perimetro+"\n");
        return perimetro;
    }
}
