public class ArraysCreacionAcceso {
    public static void main(String[] args) {
        //Arrays -> conjunto 1,3,4,9,333,452

        // ARRAY de POSICIONES CONCRETAS [5 en este caso]
        int [] numeros = new int[5];// 0 0 0 0 0

        // ARRAY de Número de elementos
        int[] numerosElementos= new int[]{1,7,9,15,22,25};// pos0 1, pos1 7...pos6 4

        //SI queremos acceder a los numerosElem...se llama
        // desde sout y entre corchetes colocamos la posicion
        System.out.println("el número en la posicion 3 es:" +numerosElementos[3]);

        //PARA saber el tamaño del array sin contar uno a uno se usa -> length
        // así sabemos el numero de elementos totales
        System.out.println("El tamaño del array es: "+numerosElementos.length);

        //SI queremos sacar el numero contenido en la ultima posicion
        // sin saber exactamente cual es el que la ocupa, en los corchetes
        // en lugar de colocar la posicion exacta, colocamos el nombre de
        //variable.length-1
        System.out.println("La última posicion del array es: "+numerosElementos[numerosElementos.length-1]);

        //PARA RECORRER ARRAY ENTERO se usa un for (int i =0; i< numerosElementos.length;i++)
        for (int i =0; i< numerosElementos.length;i++){
        System.out.println("el número en la posicion i es:" +numerosElementos[i]);
        }

        // TAMBIEN CON LA ESTRUCTURA foreach podriamos hacerlo mas facil,
        // si no se necesita saber posicion, impar o par, etc...

        //aqui no se indica cual es el principio ni final
        //simplementelo que te vas a encontrar en cada vuelta y el conjunto que quieres mostrar
        for (int bola: numerosElementos) {
            System.out.println("con foreach " +bola);
        }
    }
}
