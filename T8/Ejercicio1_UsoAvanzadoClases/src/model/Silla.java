package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Silla extends Mueble{
    private int patas;

    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    @Override
    public String mostrarDatos() {
        super.mostrarDatos();
        return "numero de patas: "+patas;
    }
}
