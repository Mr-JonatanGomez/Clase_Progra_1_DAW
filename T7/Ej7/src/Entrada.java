import model.*;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


        //DECLARACION EQUIPOS CON CALIDAD *OBSOLETO*
        /*
        Equipo barcelona = new Equipo(101,"Barcelona", 90, 87, 84);
        Equipo realMadrid = new Equipo(103,"Real Madrid",96,88,80);
        Equipo valencia = new Equipo(104,"Valencia",75,84,80);
        */

        //DECLARACION EQUIPOS * CALIDAD COGIDA DE MEDIA DE SUS JUGADORES
        Equipo atleticoDeMadrid = new Equipo("ATLETICO de MADRID");
        Equipo realMadrid = new Equipo("REAL MADRID");
        Equipo barcelona = new Equipo("BARCELONA");
        Equipo valencia = new Equipo("VALENCIA");
        Equipo bilbao = new Equipo ("ATH. BILBAO");
        Equipo sevilla = new Equipo("SEVILLA");
        Equipo betis = new Equipo("BETIS");
        Equipo osasuna = new Equipo ("OSASUNA");

        // DECLARACION JUGADORES * OBSOLETO*
            /*
        Jugador oblak = new Jugador(1,"Oblak","portero",92);
        Jugador courtois = new Jugador(2,"curtis","portero",90);
        Jugador  jugador3 = new Jugador(3,"Jugador","portero",2);
*/

        //UNION JUGADORES A EQUIPO ( CON CREACION AL MOMENTO)

        atleticoDeMadrid.ficharJugador(new Jugador(1,"Gímenez","defensa",84));
        atleticoDeMadrid.ficharJugador(new Jugador(2,"Griezmann","centrocampista",91));
        atleticoDeMadrid.ficharJugador(new Jugador(3,"Morata","delantero",87));
        atleticoDeMadrid.ficharJugador(new Jugador(4,"Oblak","portero",94));

        realMadrid.ficharJugador(new Jugador(4,"Nacho","defensa",84));
        realMadrid.ficharJugador(new Jugador(5,"Bellingham","centrocampista",94));
        realMadrid.ficharJugador(new Jugador(6,"Vinicius","delantero",90));
        realMadrid.ficharJugador(new Jugador(7,"Lunin","portero",80));

        valencia.ficharJugador(new Jugador(9,"Guillamon","defensa",80));
        valencia.ficharJugador(new Jugador(10,"Pepelu","centrocampista",82));
        valencia.ficharJugador(new Jugador(11,"Hugo Duro","delantero",79));
        valencia.ficharJugador(new Jugador(12,"Mamardasvhili","portero",88));

        barcelona.ficharJugador(new Jugador(13,"Kounde","defensa",82));
        barcelona.ficharJugador(new Jugador(14,"Pedri","centrocampista",86));
        barcelona.ficharJugador(new Jugador(15,"Lewandovski","delantero",90));
        barcelona.ficharJugador(new Jugador(16,"Ter Stegen","portero",92));

        osasuna.ficharJugador(new Jugador(17,"David Garcia","defensa",80));
        osasuna.ficharJugador(new Jugador(18,"Aimar","centrocampista",79));
        osasuna.ficharJugador(new Jugador(19,"Budimir","delantero",81));
        osasuna.ficharJugador(new Jugador(20,"Sergio","portero",78));

        betis.ficharJugador(new Jugador(27,"Luis","defensa",80));
        betis.ficharJugador(new Jugador(28,"Carvalho","centrocampista",80));
        betis.ficharJugador(new Jugador(21,"Borja","delantero",79));
        betis.ficharJugador(new Jugador(22,"Bravo","portero",81));

        sevilla.ficharJugador(new Jugador(23,"Ramos","defensa",82));
        sevilla.ficharJugador(new Jugador(24,"Rakitic","centrocampista",79));
        sevilla.ficharJugador(new Jugador(25,"Isaac Romero","delantero",82));
        sevilla.ficharJugador(new Jugador(26,"Nyjhland","portero",82));

        bilbao.ficharJugador(new Jugador(29,"Yerai","defensa",82));
        bilbao.ficharJugador(new Jugador(30,"Sancet","centrocampista",84));
        bilbao.ficharJugador(new Jugador(31,"Williams","delantero",86));
        bilbao.ficharJugador(new Jugador(32,"Unai Simon","portero",84));



        //creamos la liga
        Liga primeraDivision = new Liga();


        primeraDivision.inscribirEquipos(realMadrid);
        primeraDivision.inscribirEquipos(atleticoDeMadrid);
        primeraDivision.inscribirEquipos(barcelona);
        primeraDivision.inscribirEquipos(valencia);
        primeraDivision.inscribirEquipos(osasuna);
        primeraDivision.inscribirEquipos(sevilla);
        primeraDivision.inscribirEquipos(betis);
        primeraDivision.inscribirEquipos(bilbao);



        // MOSTRAMOS EQUIPOS Y CALIDAD // OBSOLETO??
        /*
        atleticoDeMadrid.calcularNivelHabilidad();
        atleticoDeMadrid.mostrarDatosCalidad();

        realMadrid.calcularNivelHabilidad();
        realMadrid.mostrarDatosCalidad();

        barcelona.calcularNivelHabilidad();
        barcelona.mostrarDatosCalidad();

        valencia.calcularNivelHabilidad();
        valencia.mostrarDatosCalidad();

        sevilla.calcularNivelHabilidad();
        sevilla.mostrarDatosCalidad();

        osasuna.calcularNivelHabilidad();
        osasuna.mostrarDatosCalidad();

        bilbao.calcularNivelHabilidad();
        bilbao.mostrarDatosCalidad();

        betis.calcularNivelHabilidad();
        betis.mostrarDatosCalidad();


         */

        primeraDivision.calcularMostrarCalidadEquipos();

// JORNADA *PRUEBAS PARA OBSOLETAR*
        /*
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


         */
        Jornada jornadas= new Jornada(primeraDivision.getListaEquipos());//DECLARA LA TEMPORADA


        jornadas.realizarPartidos();


        System.out.println("\n\tClasificacion FINAL\n");
        primeraDivision.hacerClasificacion();





    }
}