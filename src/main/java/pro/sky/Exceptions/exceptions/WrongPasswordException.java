package pro.sky.Exceptions.exceptions;

public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException() {
        super("Wrong password");
    }
}
