package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Mesa extends Mueble{
    private int capacidad;

    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    @Override
    public String mostrarDatos() {
        super.mostrarDatos();
        return "capacidad: "+capacidad;
    }
}
