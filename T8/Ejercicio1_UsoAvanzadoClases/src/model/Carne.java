package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Carne extends Alimento{
    private int proteinas;

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    @Override
    public String mostrarDatos() {
        super.mostrarDatos();
        return "proteinas: "+proteinas;
    }
}
