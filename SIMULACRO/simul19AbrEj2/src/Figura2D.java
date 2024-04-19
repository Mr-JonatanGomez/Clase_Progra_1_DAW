import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Figura2D implements FiguraGeometrica{
    private String nombre;


    public Figura2D() {}

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

}
