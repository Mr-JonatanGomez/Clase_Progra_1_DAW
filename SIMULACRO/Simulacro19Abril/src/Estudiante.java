import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.Objects;

@Getter
@Setter
public class Estudiante {

    private String nombre;
    private int edad;
    private double nota1, nota2, nota3;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public static void fichero(){
        File file = new File("src");

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return edad == that.edad && nota1 == that.nota1 && nota2 == that.nota2 && nota3 == that.nota3 && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nota1, nota2, nota3);
    }
}
