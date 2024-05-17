import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Figura2D implements FiguraGeometrica{
    private String nombre;
    private double perimetro;

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }
}
