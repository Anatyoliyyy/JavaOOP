package OnlineAuction;

import java.io.Serializable;

public class Account implements Serializable {
    private long money;

    public Account(long money) {
        if (money<=0){
            throw new IllegalArgumentException("negative money quantity: " + money);
        }
        this.money = money;
    }

    public long getMoney() {
        return money;
    }
    public boolean withdraw (long count){
        if (count>money){
            return false;
        }
        money-=count;
        return true;
    }
    public void debit(long count){
        money+=count;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
