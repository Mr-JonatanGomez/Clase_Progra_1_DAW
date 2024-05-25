import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TelefonoMovilApartado5 extends ProductoApartado4{
    private String modelo;
    private String marca;

    private int descuento;
    public TelefonoMovilApartado5(double precio, String modelo, String marca, int descuento) {
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

    @Override
    public double calcularPrecioFinal() {
        double precioFinal= getPrecio()-((getPrecio()*descuento)/100);

        System.out.println(precioFinal);
        return precioFinal;
    }
}
