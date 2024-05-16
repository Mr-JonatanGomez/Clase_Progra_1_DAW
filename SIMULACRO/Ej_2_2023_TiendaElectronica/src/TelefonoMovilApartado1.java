import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
//15:40
public class TelefonoMovilApartado1 {
    private String modelo;
    private String marca;
    private double precio;
    private int decuentoPercent;

    public TelefonoMovilApartado1(String modelo, String marca, double precio, int decuentoPercent) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.decuentoPercent = decuentoPercent;
    }

    public TelefonoMovilApartado1() {
    }

    @Override
    public String toString() {
        return "TelefonoMovilApartado1{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", decuentoPercent=" + decuentoPercent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TelefonoMovilApartado1 that)) return false;
        return Double.compare(precio, that.precio) == 0 && decuentoPercent == that.decuentoPercent && Objects.equals(modelo, that.modelo) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, precio, decuentoPercent);
    }
}
