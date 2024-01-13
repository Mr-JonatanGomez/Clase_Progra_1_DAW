import java.util.Scanner;

public class Adivina {
    static int aleatorio;
    static int numeroMin=0;
    static int numeroMax=100;
    static int contador=0;
    public static void main(String[] args) {
        aleatorio = (int) (Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("EL JUEGO DE ADIVINAR UN NUMERO ALEATORIO ENTRE 1 y 100");

        //int numero= sc.nextInt();

        Adivinanza(sc);
    }
    public static int Adivinanza (Scanner sc){ // para introducir por escaner cada vez que ejecutamos
        System.out.println("El rango actual está entre : "+numeroMin +" y "+ numeroMax);
        int nActual = sc.nextInt();
        contador ++;

        if (nActual==aleatorio){
            System.out.println("ENHORABUENA!! Has acertado el numero SECRETO: "+aleatorio+ ", en "+ contador+ " intentos");
            return aleatorio;
        }else{
            if(nActual>aleatorio){
                numeroMax=nActual;
            } else {
                numeroMin=nActual;
            }
        }
        return Adivinanza(sc);
    }
}
