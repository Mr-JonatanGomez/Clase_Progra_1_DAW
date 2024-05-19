import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private double calificacion;
    private String DNI;
    private int numeroMatricula;

    public Alumno(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;

    }

    public void mostrarDatos(){
        System.out.println("\nnombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("calificacion = " + calificacion);
        System.out.println("DNI = " + DNI);
        System.out.println("numeroMatricula = " + numeroMatricula);
    }
}
