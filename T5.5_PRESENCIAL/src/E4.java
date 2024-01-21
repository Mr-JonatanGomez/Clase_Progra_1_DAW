import java.util.Scanner;

public class E4 {
    /*
    Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2. Si
    alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
    */
    static Scanner sc = new Scanner(System.in);
    static int contadorJ1=0;
    static int contadorJ2=0;
    static int jugada1;
    static int jugada2;
    static int piedra = 1;
    static int papel = 2;
    static int tijera = 3;
    static int rejugar;

    public static void jugada() {
        System.out.println("Turno Jugador 1");
        jugada1 = sc.nextInt();
        System.out.println("Turno Jugador 2");
        jugada2 = sc.nextInt();

        resultado();

    }

    public static void resultado(){
        if (jugada1==jugada2){
            System.out.println("Esta ronda es Empate");
        } else if (jugada1==1 && jugada2==2 || jugada1==2 && jugada2==3 || jugada1==3 && jugada2==1) {
            System.out.println("gana jugador 2");
            contadorJ2++;
        } else if (jugada1==1 && jugada2==3 || jugada1==2 && jugada2==1 || jugada1==3 && jugada2==2) {
            System.out.println("gana jugador 1");
            contadorJ1++;
        }
    }

    public static void mostrarMarcador(){
        System.out.println("MARCADOR:");
        System.out.println("JUGADOR1: "+contadorJ1+ "\tvs\t JUGADOR2: "+contadorJ2);
    }

    public static void main(String[] args) {
        System.out.println("\n\n\t\tEL JUEGO DEL PIEDRA PAPEL Y TIJERA");
        System.out.println("\n\n***Instrucciones***");
        System.out.println("Cada jugador introducirá un número para su opción: \n" +
                "\n1- PIEDRA\n2- PAPEL\n3- TIJERA");



        do {
            jugada();
            System.out.println("¿Quieres jugar otra vez?\n PULSA 0, para jugar otra vez, o pulsa otra tecla para salir");
            rejugar = sc.nextInt();
        }while (rejugar==0);

        mostrarMarcador();
    }
}
