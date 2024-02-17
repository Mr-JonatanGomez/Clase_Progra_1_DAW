import model.Equipo;
import model.Jugador;
import model.Liga;
import model.Partido;

public class Entrada {
    public static void main(String[] args) {


        //DECLARACION EQUIPOS
        Equipo barcelona = new Equipo(101,"Barcelona", 90, 87, 84);
        Equipo atleticoDeMadrid = new Equipo(102,"Atlético de Madrid",86,85,95);
        Equipo realMadrid = new Equipo(103,"Real Madrid",96,88,80);
        Equipo valencia = new Equipo(104,"Valencia",75,84,80);



        // DECLARACION JUGADORES

        Jugador oblak = new Jugador(1,"Oblak","portero",92);
        Jugador courtois = new Jugador(2,"curtis","portero",90);
        Jugador  jugador3 = new Jugador(3,"Jugador","portero",2);


        //UNION JUGADORES A EQUIPO ( CON CREACION AL MOMENTO)

        atleticoDeMadrid.ficharJugador(new Jugador(1,"Godin","defensa",87));
        atleticoDeMadrid.ficharJugador(new Jugador(2,"Koke","centrocampista",86));
        atleticoDeMadrid.ficharJugador(new Jugador(3,"Forlan","delantero",88));

        atleticoDeMadrid.mostrarPlantilla();

        realMadrid.ficharJugador(new Jugador(4,"Hierro","defensa",87));
        realMadrid.ficharJugador(new Jugador(5,"Gago","centrocampista",84));
        realMadrid.ficharJugador(new Jugador(6,"Raul","delantero",87));


        realMadrid.mostrarPlantilla();
        barcelona.mostrarPlantilla();



        atleticoDeMadrid.mostrarDatos();
        realMadrid.mostrarDatos();
        barcelona.mostrarDatos();

        //creamos la liga
        Liga primeraDivision = new Liga();

        primeraDivision.inscribirEquipos(realMadrid);
        primeraDivision.inscribirEquipos(atleticoDeMadrid);
        primeraDivision.inscribirEquipos(barcelona);
        primeraDivision.inscribirEquipos(valencia);


        Partido j1a = new Partido(atleticoDeMadrid,realMadrid);
        j1a.iniciarPartido();
        Partido j1b = new Partido(valencia,barcelona);
        j1b.iniciarPartido();

        Partido jornada2 = new Partido(realMadrid,barcelona);
        jornada2.iniciarPartido();
        Partido jornada2b = new Partido(atleticoDeMadrid,valencia);
        jornada2b.iniciarPartido();

        Partido j3 = new Partido(barcelona,atleticoDeMadrid);
        j3.iniciarPartido();
        Partido j3b = new Partido(realMadrid,valencia);
        j3b.iniciarPartido();

        System.out.println("Clasificacion Primera Vuelta");
        primeraDivision.hacerClasificacion();


        Partido j4a = new Partido(realMadrid,atleticoDeMadrid);
        j4a.iniciarPartido();
        Partido j4b = new Partido(barcelona,valencia);
        j4b.iniciarPartido();

        Partido jornada5 = new Partido(barcelona,realMadrid);
        jornada5.iniciarPartido();
        Partido jornada5b = new Partido(valencia,atleticoDeMadrid);
        jornada5b.iniciarPartido();

        Partido j6 = new Partido(atleticoDeMadrid,barcelona);
        j6.iniciarPartido();
        Partido j6b = new Partido(valencia,realMadrid);
        j6b.iniciarPartido();

        System.out.println("Clasificacion FINAL");
        primeraDivision.hacerClasificacion();



    }
}
