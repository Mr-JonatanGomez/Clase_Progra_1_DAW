import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class TelefonoMovilApartado2 extends ProductoApartado2{
    private String modelo;
    private String marca;

    private int decuentoPercent;

    public TelefonoMovilApartado2(String modelo, String marca, int decuentoPercent) {
        this.modelo = modelo;
        this.marca = marca;
        this.decuentoPercent = decuentoPercent;
    }

    public TelefonoMovilApartado2() {
    }

    @Override
    public String toString() {
        return "TelefonoMovilApartado2{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", decuentoPercent=" + decuentoPercent +
                '}';
    }
}
