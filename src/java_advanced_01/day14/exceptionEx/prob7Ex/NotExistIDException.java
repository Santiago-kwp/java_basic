package java_advanced_01.day14.exceptionEx.prob7Ex;

public class NotExistIDException extends Exception{
    public NotExistIDException() {}
    public NotExistIDException(String message) {
        super(message);
    }
}
