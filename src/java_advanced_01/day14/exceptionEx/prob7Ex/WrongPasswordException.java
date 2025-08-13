package java_advanced_01.day14.exceptionEx.prob7Ex;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
