package Lesson6.HomeWorkeTask1ConnectionRetryAccount;

import javax.security.auth.login.AccountException;

public interface Account {
    void withdraw(long money) throws AccountException, Lesson6.HomeWorkeTask1ConnectionRetryAccount.AccountException;
}

