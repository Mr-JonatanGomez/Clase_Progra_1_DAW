import java.util.Random;
import java.util.Scanner;

public class Ejercicio7Ahorcado {

    /* (AhorcadoArray) Crear un array de String donde se guarden 20 palabras. El sistema deberá de seleccionar una de las palabras pertenecientes al array. Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada. Para ello las normas son las siguientes:
    1- Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
    2- Se pedirá por pantalla la letra con la que se quiere probar
    3- En el caso de acertar se mostrará la letra en la posición correspondiente
    4- En el caso de falla se restará una vida
    5- El programa continuará hasta que:
    6- Acierte la palabra
    7- Me quede sin vidas*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[] {
                "juguete","soldado","trabajo","colegio","zapato",
                "taxi","pizarra","agua","tierra","lluvia",
                "invierno","piscina","terraza","cerveza","futbol",
                "baloncesto","semana","estudiar","elefante","verde",
        };

        int ndeVidas = 3;
        Random palabraRandom= new Random();
        int indiceRandom= palabraRandom.nextInt(palabras.length);
        //24 accede a palabra aleatoria entre 0 y 19
        String palabraSeleccionada = palabras[indiceRandom];
        System.out.println(palabraSeleccionada); //no necesitamos saber la plabra

// 1 al arrancar mostrar _ como letras de la palabra

        for (int i = 0; i < palabraSeleccionada.length(); i++) {
            System.out.print("_ ");
        }

// 2 pedir letra por pantalla
        System.out.println("Introduzca una letra");
        String letra = scanner.next();
      //  for (int i = 0; i < palabraSeleccionada; i++) {






    }
}
