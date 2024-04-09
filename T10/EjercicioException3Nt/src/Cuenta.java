import java.util.Scanner;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta() {}

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void sacarDinero ()throws SaldoInsuficienteException, IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto dineros quieres sacar?");
        double sacar= sc.nextDouble();
        if (sacar < 0){
            throw new IllegalArgumentException("La cantidad a sacar debe ser positiva");
        }else if (sacar > saldo){
            throw new SaldoInsuficienteException("no tienes suficiente saldo");
        }else{
            saldo-=sacar;
            System.out.println("Tu saldo tras la operacion es:" +saldo);
        }

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
