import model.CampeonatoMundial;
import model.CarreraCircuito;
import model.Coche;

public class Entrada {
    public static void main(String[] args) {

        //DECLARAR COCHES
        Coche coche1 = new Coche ("Citroen","Xsara","\uD83D\uDE97 C.McRae_1",80);
        Coche coche2 = new Coche ("Hyundai","i30","\uD83C\uDFCE\uFE0F B.Codd_2",110);
        Coche coche3 = new Coche ("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_3",30);
        Coche coche4 = new Coche ("Citroen","2CV_Trucado","\uD83D\uDE99 B.Martin_4",201);
        Coche coche5 = new Coche ("Toyota","Corolla","\uD83D\uDE99 C.Sainz_5",150);
        Coche coche6 = new Coche ("Subaru","Impreza","\uD83D\uDE99 J.Gomez_6",221);

        //DECLARAR CARRERAS

        CarreraCircuito carrera1 =new CarreraCircuito("RallyRACC Catalonia",457,7);
        CarreraCircuito carrera2 =new CarreraCircuito("Wales Rally GB",471,10);
        CarreraCircuito carrera3 =new CarreraCircuito("Rally Italy Sardegna",552,8);
        CarreraCircuito carrera4 =new CarreraCircuito("Rally New Zealand",720,4);
        CarreraCircuito carrera5 =new CarreraCircuito("Rally Monte Carlo",312,3);
        CarreraCircuito carrera6 =new CarreraCircuito("Safari Rally Kenya",1157,10);
        CarreraCircuito carrera7 =new CarreraCircuito("Rally Argentina",883,9);
        CarreraCircuito carrera8 =new CarreraCircuito("Rally Japan",661,7);

        //DECLARAR CAMPEONATO

        CampeonatoMundial mundial = new CampeonatoMundial();
        mundial.agregarCarrera(carrera1);


    }

}
