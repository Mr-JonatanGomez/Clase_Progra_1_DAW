package model;

public class CatalogoNoExisteException extends NullPointerException{
    public CatalogoNoExisteException(String message) {
        super(message);
    }
}
