package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Setter
@Getter
public class Lacteo extends Alimento{
    private int volumen;

    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    @Override
    public String mostrarDatos() {
        super.mostrarDatos();
        return "volumen: "+volumen;
    }
}
