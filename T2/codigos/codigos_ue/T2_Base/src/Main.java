public class Main
{
    public static void main(String[] args) {
        float ejemplo = 7.5f;
        int redondeoR = (int) Math.round(ejemplo);
        int redondeoC = (int) Math.ceil(ejemplo);
        int redondeoF = (int) Math.floor(ejemplo);

        System.out.println("numero original: " + ejemplo);
        System.out.println("numero redondeado con ROUND: " + redondeoR);
        System.out.println("numero redondeado con CEIL: " + redondeoC);
        System.out.println("numero redondeado con FLOOR: " + redondeoF);
    }
}