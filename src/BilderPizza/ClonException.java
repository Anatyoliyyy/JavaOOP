package BilderPizza;

public class ClonException extends RuntimeException  {

    public ClonException(String message) {
        super(message);
    }

    public ClonException(String message, Throwable cause) {
        super(message, cause);
    }
}
