import java.util.Calendar;
import java.util.Scanner;

public class HoraSistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();

        Calendar calendario = Calendar.getInstance();// metodo estatico, no necesita
        calendario.get(Calendar.HOUR_OF_DAY);


    }
}
