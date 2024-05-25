import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ProductoApartado2 extends Producto{
    private double precio;

    public ProductoApartado2(double precio) {
        this.precio = precio;
    }


}
