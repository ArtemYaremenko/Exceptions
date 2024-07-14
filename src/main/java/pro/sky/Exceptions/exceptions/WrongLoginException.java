package pro.sky.Exceptions.exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        super("Wrong login!!!");
    }
}
