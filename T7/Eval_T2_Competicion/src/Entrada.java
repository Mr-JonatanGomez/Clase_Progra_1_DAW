import model.CampeonatoMundial;
import model.CarreraCircuito;
import model.Coche;

public class Entrada {
    public static void main(String[] args) {

        //DECLARAR COCHES


        //DECLARAR CARRERAS


        // DECLARAR CAMPEONATO
        // AGREGAR CARRERA(MetodoMostrardatos incluido)
        // AGREGAR COCHES (MetodoMostrar datos incluido)

        CampeonatoMundial mundial = new CampeonatoMundial();

        mundial.agregarCarrera(new CarreraCircuito("RallyRACC Catalonia",457,7));
        mundial.agregarCarrera(new CarreraCircuito("Wales Rally GB",471,10));
        mundial.agregarCarrera(new CarreraCircuito("Rally Italy Sardegna",552,8));
        mundial.agregarCarrera(new CarreraCircuito("Rally New Zealand",720,4));
        mundial.agregarCarrera(new CarreraCircuito("Rally Monte Carlo",312,3));
        mundial.agregarCarrera(new CarreraCircuito("Safari Rally Kenya",1157,10));
        mundial.agregarCarrera(new CarreraCircuito("Rally Argentina",883,9));
        mundial.agregarCarrera(new CarreraCircuito("Rally Japan",661,7));


        mundial.inscribirCoche(new Coche("Citroen","Xsara","\uD83D\uDE99 C.McRae_1",80));
        mundial.inscribirCoche(new Coche("Hyundai","i30","\uD83D\uDE97 B.Codd_2",110));
        mundial.inscribirCoche(new Coche("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_3",30));
        mundial.inscribirCoche(new Coche("Citroen","2CV_Trucado","\uD83C\uDFCE\uFE0F B.Martin_4",201));
        mundial.inscribirCoche(new Coche("Toyota","Corolla","\uD83D\uDE97 C.Sainz_5",150));
        mundial.inscribirCoche(new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F J.Gomez_6",221));








    }

}
