package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Pelicula {// EMPEZADO 23.40 00:15
    private String titulo;
    private String director;
    private double nota1,nota2,nota3;
    private double notaMedia;

    public Pelicula(String titulo, String director, double nota1, double nota2, double nota3) {
        this.titulo = titulo;
        this.director = director;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularNotaMedia(){
        this.notaMedia=((nota1+nota2+nota3)/3);
    }

    @Override
    public String toString() {
        return "model.Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", notaMedia=" + notaMedia +
                '}';
    }

    public void mostrarSoloDatosPedidos(){
        System.out.println("titulo = " + titulo);
        System.out.println("director = " + director);
        System.out.println("notaMedia = " +notaMedia );
    }
}
