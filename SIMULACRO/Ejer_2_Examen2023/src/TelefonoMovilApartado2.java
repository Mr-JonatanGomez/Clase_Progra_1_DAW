import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class TelefonoMovilApartado2 extends ProductoApartado2{
    private String modelo;
    private String marca;

    private int descuento;
    public TelefonoMovilApartado2(double precio, String modelo, String marca, int descuento) {
        super(precio);
        this.modelo = modelo;
        this.marca = marca;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "TelefonoMovilApartado2{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", descuento=" + descuento +
                "} " + super.toString();
    }
}
