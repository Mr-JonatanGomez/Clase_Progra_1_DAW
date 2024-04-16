import controller.Biblioteca;
import model.elemento.CD;
import model.elemento.Elemento;
import model.persona.Persona;

public class Entrada {
    public static void main(String[] args) {
        CD cd = new CD();
        Biblioteca bc=new Biblioteca();
        bc.registrarElemento(cd);
        bc.registrarPersona(new Persona() {
            @Override
            public void setNombre(String nombre) {
                super.setNombre(nombre);
            }

            @Override
            public void setApellido(String apellido) {
                super.setApellido(apellido);
            }

            @Override
            public void setDni(String dni) {
                super.setDni(dni);
            }
        });

    }

}
