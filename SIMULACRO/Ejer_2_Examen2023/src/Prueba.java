import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        //COMENZAMOS 9:15 -- 9:39
        TelefonoMovilApartado2 tq =new TelefonoMovilApartado2(100,"s5","aple",0);
        TelefonoMovilApartado2 tq1 =new TelefonoMovilApartado2(100,"s4","aple",10);
        TelefonoMovilApartado2 tq2 =new TelefonoMovilApartado2(100,"s3","aple",15);
        TelefonoMovilApartado2 tq3 =new TelefonoMovilApartado2(100,"s2","aple",20);

        ArrayList<Producto>listadoMoviles=new ArrayList<>();
        listadoMoviles.add(tq);
        listadoMoviles.add(tq1);
        listadoMoviles.add(tq2);
        listadoMoviles.add(tq3);

        for (Producto item:listadoMoviles) {
            System.out.println(item.toString());
        }
    }
}
