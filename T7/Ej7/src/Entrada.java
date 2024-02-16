import model.Equipo;
import model.Jugador;
import model.Partido;

public class Entrada {
    public static void main(String[] args) {

        Equipo barcelona = new Equipo("Barcelona", 90, 85, 80);
        Equipo atleticoDeMadrid = new Equipo("Atlético de Madrid");
        Equipo realMadrid = new Equipo("Real Madrid");


        System.out.println("ATAQUE atleti "+atleticoDeMadrid.getNivelAtaque()+" , "+atleticoDeMadrid.getNivelMedia()+" , "+atleticoDeMadrid.getNivelDefensa());



        System.out.println("\n\tResultado final fue de:"+atleticoDeMadrid.getNombre()+" "+atleticoDeMadrid.getGoles()+" - "+barcelona.getNombre()+" "+barcelona.getGoles());
        System.out.println("\n\n\n👏 cambio de tercio");
        // CON LA ACTU

        Jugador oblak = new Jugador("Oblak","portero",92);
        Jugador courtois = new Jugador("curtis","portero",90);
        Jugador  jugador3 = new Jugador("1","2",2);


        atleticoDeMadrid.ficharJugador(new Jugador("Godin","defensa",87));
        atleticoDeMadrid.ficharJugador(new Jugador("Koke","medio",86));
        atleticoDeMadrid.ficharJugador(new Jugador("Forlan","delantero",88));


        atleticoDeMadrid.mostrarPlantilla();

        realMadrid.ficharJugador(new Jugador("Hierro","defensa",87));
        realMadrid.ficharJugador(new Jugador("Gago","medio",84));
        realMadrid.ficharJugador(new Jugador("Raul","delantero",87));


        realMadrid.mostrarPlantilla();

        Partido jornada1 = new Partido(atleticoDeMadrid,realMadrid);
        jornada1.iniciarPartido();
        jornada1.mostrarResultado();

    }
}
