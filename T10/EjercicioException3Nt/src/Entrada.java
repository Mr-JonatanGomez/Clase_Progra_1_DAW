import java.util.InputMismatchException;

public class Entrada {
    public static void main(String[] args) {
        Cuenta cuentaPepe = new Cuenta("Es2301", 127.33);
        try {
            cuentaPepe.sacarDinero();

        }catch (InputMismatchException e){
            System.out.println("Error de tipo de datos, solo digitos aceptados");
        }catch (SaldoInsuficienteException e){
            e.getMessage();
        }catch (IllegalArgumentException e){
            e.getMessage();
        }
    }
}
