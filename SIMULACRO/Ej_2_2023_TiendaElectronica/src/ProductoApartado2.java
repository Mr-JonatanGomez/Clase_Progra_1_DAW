import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoApartado2 {
    private double precio;

    public ProductoApartado2() {
    }

    public ProductoApartado2(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoApartado2{" +
                "precio=" + precio +
                '}';
    }
}
