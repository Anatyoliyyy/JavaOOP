package Lesson6.HomeWorkeTask1ConnectionRetryAccount;

public class AccountConnectionException extends AccountException {
    public AccountConnectionException(String message) {
        super(message);
    }

    public AccountConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

