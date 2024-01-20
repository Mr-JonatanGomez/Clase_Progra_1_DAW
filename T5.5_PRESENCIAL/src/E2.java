import java.util.Calendar;
import java.util.Scanner;

public class E2 {
    static int hora;
    public static void saludo (){
        if (hora >=6 && hora<= 12){
            System.out.println("Buenos días");
        } else if (hora >=13 && hora<= 20) {
            System.out.println("Buenas tardes");
        } else if (hora >=21 && hora<= 24) {
            System.out.println("Buenas noches");
        } else if (hora >=0 && hora <=5) {
            System.out.println("Buenas noches");

        }else {
            System.out.println("Hora no valida");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Dime una hora");


        Calendar calendario = Calendar.getInstance();// metodo estatico, no necesita
        calendario.get(Calendar.HOUR_OF_DAY);
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        saludo();
       // System.out.println("imprime lo que haces: "+ hora);
    }
}
