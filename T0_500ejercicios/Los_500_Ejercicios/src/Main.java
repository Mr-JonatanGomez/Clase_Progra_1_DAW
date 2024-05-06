import java.util.Scanner;

public class Main {

    private static int numero;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        //numeroCifras_ej11();
        //mostrarAlReves_ej12();
        //esCapicua_ej13();
        fechaCorrecta_ej16();
    }

    public static void numeroCifras_ej11() {
        System.out.println("Mete numero entre 0 y 99999");
        numero = sc.nextInt();
        if (numero > 0 && numero < 10) {
            System.out.println("el numero metido tiene 1 cifra");
        } else if (numero >= 10 && numero < 100) {
            System.out.println("el numero metido tiene 2 cifras");
        } else if (numero >= 100 && numero < 1000) {
            System.out.println("el numero metido tiene 3 cifras");
        } else if (numero >= 1000 && numero < 10000) {
            System.out.println("el numero metido tiene 4 cifras");
        } else if (numero >= 10000 && numero < 100000) {
            System.out.println("el numero metido tiene 5 cifras");
        } else {
            System.out.println("el numero metido no está entre los valores comprendidos");
        }
    }

    public static void mostrarAlReves_ej12() {
        System.out.println("Mete numero entre 0 y 99999");
        numero = sc.nextInt();
        int dMillar, cMillar, centenas, decenas, unidades;
        unidades = numero % 10;
        numero = numero / 10;
        decenas = numero % 10;
        numero = numero / 10;
        centenas = numero % 10;
        numero = numero / 10;
        cMillar = numero % 10;
        numero = numero / 10;
        dMillar = numero % 10;
        numero = numero / 10;

        System.out.print(unidades + "" + decenas + "" + centenas + "" + cMillar + "" + dMillar);


    }

    public static void esCapicua_ej13() {
        System.out.println("Mete numero entre 0 y 99999");
        numero = sc.nextInt();
        int dMillar, cMillar, centenas, decenas, unidades;
        int auxuliar = numero;
        unidades = auxuliar % 10;
        auxuliar = auxuliar / 10;
        decenas = auxuliar % 10;
        auxuliar = auxuliar / 10;
        centenas = auxuliar % 10;
        auxuliar = auxuliar / 10;
        cMillar = auxuliar % 10;
        auxuliar = auxuliar / 10;
        dMillar = auxuliar % 10;
        auxuliar = auxuliar / 10;

        if (numero < 10) {
            System.out.println("No es capicua");
        } else if (numero > 9 && numero < 100 && decenas == unidades) {
            System.out.println("Es capicua");
        } else if (numero > 99 && numero < 1000 && centenas == unidades) {
            System.out.println("Es capicua");
        } else if (numero > 999 && numero < 10000 && cMillar == unidades && centenas == decenas) {
            System.out.println("Es capicua");
        } else if (numero > 9999 && numero < 100000 && dMillar == unidades && cMillar == decenas) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

    }

    public static void fechaCorrecta_ej16() {
        int dia, mes, year;
        boolean fechaCorrecta;
        int diasDelMes;

        System.out.println("Introduce una fecha");
        System.out.println("dia");
        dia = sc.nextInt();
        System.out.println("mes");
        mes = sc.nextInt();
        System.out.println("año");
        year = sc.nextInt();
        String tuFecha = dia + "/" + mes + "/" + year;

        //dias

        if (year == 0 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            fechaCorrecta = false;
            System.out.println(tuFecha);
            System.out.println("Fecha incorrecta");
            System.out.println(fechaCorrecta);

        } else if (mes == 2) {
            if (year % 4 == 0 && dia <= 29) {
                System.out.println(tuFecha);
                fechaCorrecta = true;
                System.out.println(fechaCorrecta);
            } else if (year % 4 != 0 && dia <= 28) {
                System.out.println(tuFecha);
                fechaCorrecta = true;
                System.out.println(fechaCorrecta);
            } else {
                System.out.println(tuFecha);
                fechaCorrecta = false;
                System.out.println("Numero de dias de Febrero incorrectos");
                System.out.println(fechaCorrecta);
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30) {
            fechaCorrecta = false;
            System.out.println(tuFecha);System.out.println(tuFecha);
            System.out.println("Numero de dias incorrecto para dicho mes");
            System.out.println(fechaCorrecta);
        } else {
            System.out.println(tuFecha);
            fechaCorrecta = true;
            System.out.println(fechaCorrecta);
        }

    }
    //PEDIR DOS FECHAS Y SACAR DIFERENCIA DIAS ENTRE ELLAS pagina33 PDF
}
