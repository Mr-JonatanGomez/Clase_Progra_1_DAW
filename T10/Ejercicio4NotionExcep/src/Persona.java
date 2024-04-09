import lombok.Getter;
import lombok.Setter;

public class Persona {
    @Getter
    @Setter
    private String nombre;
    private int edad;

    public Persona() {}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void validarDatos() throws EdadInvalidaException,NombreInvalidoException{

        if (nombre.isEmpty()){
            throw new NombreInvalidoException("El nombre esta vacio");
        }else if (edad<18){
            throw new EdadInvalidaException("No tienes edad suficiente para navegar en esta web🔞");
        }else{

        }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
