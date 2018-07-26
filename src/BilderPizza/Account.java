package BilderPizza;

import java.io.Serializable;

public class Account {

    private  float money;

    public Account(float money) {
        if(money<0) throw new IllegalArgumentException("money<0" + money);
        this.money = money;

    }

    public float getMoney() {
        return money;
    }

    public boolean withdraw(float withdrawMoney){
        if(money<withdrawMoney){
            throw new IllegalArgumentException("not enough money: " + money);
        }
        money=money-withdrawMoney;
        return true;
    }

    public boolean addMoney(float addMoney){
        if(addMoney>1000) throw new IllegalArgumentException(" you can not add more than $ 1000 " + addMoney);
        if (addMoney<0) throw new IllegalArgumentException("You can not add a negative amount of money " + addMoney);
        money=money+addMoney;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
