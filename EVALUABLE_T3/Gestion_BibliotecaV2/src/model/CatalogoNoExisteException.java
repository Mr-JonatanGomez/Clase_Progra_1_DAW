package model;

public class CatalogoNoExisteException extends Exception{
    public CatalogoNoExisteException(String message) {
        super(message);
    }
}
