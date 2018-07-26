package KP2;

public class User {

    private final String name;
    private final Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "User{" +

                ", name='" + name + '\'' +
                '}';
    }
}
