import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class TelefonoMovilApartado1 {
    private String modelo;
    private String marca;
    private double precio;
    private int descuento;

    public TelefonoMovilApartado1(String modelo, String marca, double precio, int descuento) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "TelefonoMovilApartado1{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TelefonoMovilApartado1 that)) return false;
        return Double.compare(precio, that.precio) == 0 && descuento == that.descuento && Objects.equals(modelo, that.modelo) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, precio, descuento);
    }
}
