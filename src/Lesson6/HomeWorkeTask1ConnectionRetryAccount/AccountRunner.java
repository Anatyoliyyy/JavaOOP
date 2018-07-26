package Lesson6.HomeWorkeTask1ConnectionRetryAccount;

public class AccountRunner {
    public static void main(String[] args) {

        Account account = new RandomAccount(0.2, 0.3, 0.4);

        Account connecionRetry = new ConnectionRetryAccount(account, 5);


        try {
            connecionRetry.withdraw(10);
        } catch (AccountException e) {
            System.out.println("\t" + e.getMessage());
        } catch (javax.security.auth.login.AccountException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n---------------------------");

        try {
            connecionRetry.withdraw(10);
        } catch (AccountException e) {
            System.out.println("\t" + e.getMessage());
        } catch (javax.security.auth.login.AccountException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n---------------------------");

        try {
            connecionRetry.withdraw(10);
        } catch (AccountException e) {
            System.out.println("\t" + e.getMessage());
        } catch (javax.security.auth.login.AccountException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n---------------------------");

        try {
            connecionRetry.withdraw(10);
        } catch (AccountException e) {
            System.out.println( "\t" + e.getMessage());
        } catch (javax.security.auth.login.AccountException e) {
            e.printStackTrace();
        }
    }
}


//will retry to connect
//Successful  call of Withdraw
//
//
//---------------------------
//will retry to connect
//will retry to connect
//will throw not enough founds exception
//	Not enough founds
//
//
//---------------------------
//Successful  call of Withdraw
//
//
//---------------------------
//will throw not enough founds exception
//	Not enough founds
//
//Process finished with exit code 0
