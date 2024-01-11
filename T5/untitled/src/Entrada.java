public class Entrada {
    public static void main(String[] args) {
/*
    Operaciones operaciones = new Operaciones();//lamado desde el otro lugar

        sumar(5,9);

        System.out.println(sumar(8,6));*/

    }
    // public o protected o private- lo que quiero devolver Void (nada) int ( numero)


    public static int sumar(int a, int b){// en el parentesis metemos lo que queremos que sume

        int suma = a + b;
        return suma;

        // en main poner  sumar (a:7,b:3);
    }
    public static int mayor(int a, int b, int c){// en el parentesis metemos lo que queremos que sume

        int numeroMayor;
        if (a>b && a>c){
            numeroMayor=a;
        } else if (b>a && b>c) {
            numeroMayor=b;
        }else {
            numeroMayor=c;
        }
        return numeroMayor;

        // en main poner  sumar (a:7,b:3);
    }

}
