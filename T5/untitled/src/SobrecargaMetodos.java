public class SobrecargaMetodos {
    public static float suma(float[] arrayDecimales) {
        float total = 0.0F;
        for (int i = 0; i < arrayDecimales.length; i++) {
            total += arrayDecimales[i];
        }
        return total;
    }
    public static int suma(int[] arrayEnteros) {
        int total = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {
            total += arrayEnteros[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int [] arrayEnteros = {1,2,19,22};
        float []arrayD = {1.17F, 1, 1.94f, 3};
        System.out.println("la suma de enteros es: "+ suma(arrayEnteros));
        System.out.println("la suma de decimales es: "+ suma(arrayD));
    }

}
