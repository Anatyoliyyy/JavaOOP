package OnlineAuction;

import java.time.LocalDateTime;

public class Bid {
    private final long money;
    private final LocalDateTime timeBid;
    private final User user;
    private Lot lot;

    public Bid(long money, User user, Lot lot) {
        this.money = money;
        this.timeBid = LocalDateTime.now();
        this.user = user;
        this.lot = lot;
    }

    public long getMoney() {
        return money;
    }

    public LocalDateTime getTimeBid() {
        return timeBid;
    }

    public User getUser() {
        return user;
    }

    public Lot getLot() {
        return lot;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "money=" + money +
                ", timeBid=" + timeBid +
                '}';
    }
}
