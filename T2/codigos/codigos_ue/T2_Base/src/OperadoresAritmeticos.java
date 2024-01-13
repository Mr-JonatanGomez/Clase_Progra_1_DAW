public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int operando1 = 10;
        int operando2 = 7;

        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multiplicacion = operando1 * operando2;
        int division = operando1 / operando2;
        int resto = operando1 % operando2;
        double division2 = (double) operando1 / operando2;

        /* al ser operando numero int
        se le fuerza con el parentesis
        a ser double*/

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division int es: "+division);
        System.out.println("El resultado del resto de la division es: "+resto);
        System.out.println("El resultado de la division2es: "+division2);

        int numero = 9;
        numero++; // el resultado seria sumar 1 al 9 que tenemos
        numero--; // el resultado seria restar 1 al 10 de la linea anterior...
        numero--;
        numero--;
        numero--;
        numero++; // el resultado aqui seria 7
        System.out.println("el resultado encadenado es: "+numero);
    }
}

