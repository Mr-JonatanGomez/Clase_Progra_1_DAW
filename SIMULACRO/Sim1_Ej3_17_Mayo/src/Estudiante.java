import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
public class Estudiante {
    private String nombre;
    private int edad;
    private double nota1, nota2, nota3;
    private double notaMedia=0;

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularNotaMedia(){
        notaMedia= (nota1+nota2+nota3)/3;
        System.out.println(getNombre()+" nota media: " +notaMedia);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", notaMedia=" + notaMedia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return edad == that.edad && Double.compare(nota1, that.nota1) == 0 && Double.compare(nota2, that.nota2) == 0 && Double.compare(nota3, that.nota3) == 0 && Double.compare(notaMedia, that.notaMedia) == 0 && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nota1, nota2, nota3, notaMedia);
    }
}
