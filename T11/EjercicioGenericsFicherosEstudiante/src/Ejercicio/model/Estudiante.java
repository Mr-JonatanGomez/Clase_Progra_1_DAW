package Ejercicio.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter@Getter
@NoArgsConstructor
public class Estudiante {
    private String nombre;
    private int nota1, nota2, nota3, edad;


    public Estudiante(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public void calcularMedia(){
        double media= (nota1+nota2+nota3)/3;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return nota1 == that.nota1 && nota2 == that.nota2 && nota3 == that.nota3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota1, nota2, nota3);
    }
}
