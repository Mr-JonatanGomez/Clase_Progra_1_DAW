package exceptions;

import java.util.InputMismatchException;

public class ElLibroNoEsDelTipoCorrecto extends ClassCastException {
    public ElLibroNoEsDelTipoCorrecto(String message) {
        super(message);
    }

}
