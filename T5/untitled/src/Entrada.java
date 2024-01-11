public class Entrada {
    public static void main(String[] args) {

    Operaciones operaciones = new Operaciones();//lamado desde el otro lugar

        sumar(5,9);

        System.out.println(sumar(5,6));

    }
    // public o protected o private- lo que quiero devolver Void (nada) int ( numero)
    public static int sumar(int a, int b){// en el parentesis metemos lo que queremos que sume

        int suma = a + b;
        return suma;

        // en main poner  sumar (a:7,b:3);
    }
}
