package KP2;

import java.time.LocalDateTime;

public class Rate {

    private long currentPrice;
    private final User user;
    private LocalDateTime currentTimeRate;
    private final Lot lot;


    public User getUser() {
        return user;
    }

    public LocalDateTime getCurrentTimeRate() {
        return currentTimeRate;
    }

    public Rate(long currentPrice, User user, Lot lot, LocalDateTime currentTimeRate) {
        this.currentPrice = currentPrice;
        this.user = user;
        this.lot = lot;
        this.currentTimeRate = currentTimeRate;

    }

    public Lot getLot() {
        return lot;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public long changeCurrentPrice(long newRate) {
        if (checkBuyerNotSeller(user)) {
            throw new IllegalArgumentException("buyer not seller");
        }
        ;
        if (newRate <= currentPrice || newRate <= lot.getStartingPrice()) {
            throw new IllegalArgumentException("Rate is smaller then needed: " + newRate);
        }


        currentPrice = newRate;


        return newRate;
    }

    public boolean checkBuyerNotSeller(User user) {
        return user.getAccount().getId().equals(lot.getUser().getAccount().getId());
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currentPrice=" + currentPrice +
                ", user=" + user +
                '}';
    }

}
