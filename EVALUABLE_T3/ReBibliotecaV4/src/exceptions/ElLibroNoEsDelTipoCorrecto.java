package exceptions;

public class ElLibroNoEsDelTipoCorrecto extends ClassCastException {
    public ElLibroNoEsDelTipoCorrecto(String message) {
        super(message);
    }

}
