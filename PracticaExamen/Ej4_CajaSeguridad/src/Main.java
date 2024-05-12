import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //12 MAYO -  12:33 --> 12:52
        Scanner sc = new Scanner (System.in);
        int aleatorioCombinacion=-1;
        int numeroUser=-1;
        int numIntentosR=5;
        boolean cajaAbierta= false;

        aleatorioCombinacion = (int)(Math.random()*4001)+1000;
        System.out.println(aleatorioCombinacion);

        do {

            System.out.println("Para intentar abrir la caja mete un numero entre 1000y 5000");
            //System.out.println("Numeros de intentos restantes =: "+numIntentosR);
            numeroUser=sc.nextInt();

            if (numeroUser==aleatorioCombinacion){
                System.out.println("Enhorabuena, has abierto la caja");
                cajaAbierta = true;
            } else{
                numIntentosR--;
                System.out.println("Error, te quedan "+numIntentosR+" intentos");
            }
        }while(!cajaAbierta && numIntentosR>0);

        if(!cajaAbierta && numIntentosR <= 0){
            System.out.println("La caja ha sido bloqueada");
        }
    }
}
