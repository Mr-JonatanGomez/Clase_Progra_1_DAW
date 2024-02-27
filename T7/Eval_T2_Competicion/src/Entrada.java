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
/* PUESTO COMMENT PARA PROBAR
        CampeonatoMundial mundial = new CampeonatoMundial();

        mundial.agregarCarrera(new CarreraCircuito("RallyRACC Catalonia",457,7));
        mundial.agregarCarrera(new CarreraCircuito("Wales Rally GB",471,10));
        mundial.agregarCarrera(new CarreraCircuito("Rally Italy Sardegna",552,8));
        mundial.agregarCarrera(new CarreraCircuito("Rally New Zealand",720,4));
        mundial.agregarCarrera(new CarreraCircuito("Rally Monte Carlo",312,3));
        mundial.agregarCarrera(new CarreraCircuito("Safari Rally Kenya",1157,10));
        mundial.agregarCarrera(new CarreraCircuito("Rally Argentina",883,9));
        mundial.agregarCarrera(new CarreraCircuito("Rally Japan",661,7));
*/
/* PUESTO COMMENT PARA PROBAR
        mundial.inscribirCoche(new Coche("Citroen","Xsara","\uD83D\uDE99 C.McRae_1",80));
        mundial.inscribirCoche(new Coche("Hyundai","i30","\uD83D\uDE97 B.Codd_2",110));
        mundial.inscribirCoche(new Coche("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_3",30));
        mundial.inscribirCoche(new Coche("Citroen","2CV_Trucado","\uD83C\uDFCE\uFE0F B.Martin_4",201));
        mundial.inscribirCoche(new Coche("Toyota","Corolla","\uD83D\uDE97 C.Sainz_5",150));
        mundial.inscribirCoche(new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F J.Gomez_6",221));
        mundial.inscribirCoche(new Coche("Opel","Corsa","\uD83D\uDE97 V.Bullido_7",162));
        mundial.inscribirCoche(new Coche("Renault","5 CopaTurbo","\uD83D\uDE99 J.Ventura_8",70));
        mundial.inscribirCoche(new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F S.Nieves_9",275));
*/

        CampeonatoMundial mundial = new CampeonatoMundial();

        Coche coche1 = new Coche("ka","ko","Pedro",205);
        Coche coche2 = new Coche("ki","ka","Sebas",150);
        Coche coche3 = new Coche("ku","ke","Josh",99);

        CarreraCircuito carrera1 = new CarreraCircuito("CARRERON",550,12);
        CarreraCircuito carrera2 = new CarreraCircuito("CARRERON",550,12);

        carrera1.inscribirCoche(coche1);
        carrera1.inscribirCoche(coche2);
        carrera1.inscribirCoche(coche3);

        mundial.agregarCarrera(carrera1);

        carrera1.iniciarCarrera(carrera1);
        carrera1.clasificacionCarrera(carrera1);

        carrera2.inscribirCoche(coche1);
        carrera2.inscribirCoche(coche2);
        carrera2.inscribirCoche(coche3);

        carrera2.iniciarCarrera(carrera2);
        carrera2.clasificacionCarrera(carrera2);









    }

}
