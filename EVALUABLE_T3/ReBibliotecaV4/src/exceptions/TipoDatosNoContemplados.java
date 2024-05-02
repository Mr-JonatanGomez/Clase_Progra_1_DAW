package exceptions;

import java.util.InputMismatchException;

public class TipoDatosNoContemplados extends InputMismatchException {
    public TipoDatosNoContemplados(String message) {
        super(message);
    }

}
