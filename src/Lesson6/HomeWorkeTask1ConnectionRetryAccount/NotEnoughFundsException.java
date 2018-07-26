package Lesson6.HomeWorkeTask1ConnectionRetryAccount;

public class NotEnoughFundsException extends AccountException {
    public NotEnoughFundsException(String message) {
        super(message);
    }

    public NotEnoughFundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
