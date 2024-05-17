import java.util.InputMismatchException;

public class TipoDatoIncorrecto extends InputMismatchException {
    public TipoDatoIncorrecto(String s) {
        super(s);
    }
}
