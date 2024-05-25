import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class ProductoApartado4 extends Producto implements Descuento{
    private double precio;

    public ProductoApartado4(double precio) {
        this.precio = precio;
    }


}
