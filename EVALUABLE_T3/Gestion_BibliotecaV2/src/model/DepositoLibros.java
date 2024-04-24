package model;

import enums.TipoHumor;
import enums.Trama;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Setter
@Getter
public class DepositoLibros  {

    public static ArrayList<Libro>crearLibros() {
        ArrayList<Libro>listaGlobalLibros = new ArrayList<>();

        listaGlobalLibros.add(new LibroTerror("Secret of the Seventh Son", "Glenn Cooper", "0001t", 417, 16));
        listaGlobalLibros.add(new LibroTerror("Misery", "Stephen King", "0002t", 405, 16));
        listaGlobalLibros.add(new LibroTerror("Joyland", "Stephen King", "0003t", 370, 14));
        listaGlobalLibros.add(new LibroTerror("Book of Souls", "Glenn Cooper", "0004t", 376, 18));
        listaGlobalLibros.add(new LibroTerror("The Silence of the Lambs", "Thomas Harris", "0005t", 368, 18));
        listaGlobalLibros.add(new LibroPoliciaco("Los hombres que no amaban a las mujeres", "Stieg Larsson", "0006p", 465, Trama.misterio));
        listaGlobalLibros.add(new LibroPoliciaco("La chica que soñaba con una cerilla y un bidón de gasolina", "Stieg Larsson", "0007p", 569, Trama.misterio));
        listaGlobalLibros.add(new LibroPoliciaco("La reina en el palacio de las corrientes de aire", "Stieg Larsson", "0008p", 602, Trama.misterio));
        listaGlobalLibros.add(new LibroPoliciaco("Perdida", "Gillian Flynn", "0009p", 432, Trama.intriga));
        listaGlobalLibros.add(new LibroPoliciaco("El código Da Vinci", "Dan Brown", "0010p", 689, Trama.intriga));
        listaGlobalLibros.add(new LibroPoliciaco("La chica del tren", "Paula Hawkins", "0011p", 336, Trama.intriga));
        listaGlobalLibros.add(new LibroComedia("El club de la lucha", "Chuck Palahniuk", "0012c", 289, TipoHumor.amarillo));
        listaGlobalLibros.add(new LibroComedia("La princesa prometida", "William Goldman", "0013c", 364, TipoHumor.amarillo));
        listaGlobalLibros.add(new LibroComedia("Las ventajas de ser un marginado", "Stephen Chbosky", "0014c", 418, TipoHumor.amarillo));
        listaGlobalLibros.add(new LibroComedia("Un trabajo muy sucio", "Christopher Moore", "0015c", 327, TipoHumor.rosa));
        listaGlobalLibros.add(new LibroComedia("Noche de almas", "Joe R. Lansdale", "0016c", 252, TipoHumor.rosa));
        listaGlobalLibros.add(new LibroComedia("Tres hombres en un bote", "Jerome K. Jerome", "0017c", 319, TipoHumor.rosa));
        listaGlobalLibros.add(new LibroComedia("El gran libro de la tontería", "Terry Jones", "0018c", 281, TipoHumor.negro));
        listaGlobalLibros.add(new LibroComedia("Las crónicas marcianas", "Ray Bradbury", "0019c", 368, TipoHumor.negro));
        listaGlobalLibros.add(new LibroComedia("Diario de Greg", "Jeff Kinney", "0020c", 217, TipoHumor.negro));

        return listaGlobalLibros;
    }
}
