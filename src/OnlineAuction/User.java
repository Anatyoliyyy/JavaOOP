package OnlineAuction;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User implements Serializable {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final Account account;
    private final List<Bid> bids = new ArrayList<>();
    private final List<Lot> createdLots = new ArrayList<>();
    private final History purchase = new History();
    private final History sales = new History();

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public boolean placeBid(long money, Lot lot) {
        Bid bid = new Bid(money, this, lot);
        if (lot.addBid(bid)) {
            bids.add(bid);
            return true;
        }
        return false;
    }
    public Lot createLot (Product product, long startingPrice){
        Lot lot = new Lot(product,startingPrice,this);
        createdLots.add(lot);
        return lot;
    }
    public Lot createLot (Product product, long startingPrice, LocalDateTime startTime){
        Lot lot = new Lot(product,startingPrice,this, startTime);
        createdLots.add(lot);
        return lot;
    }

    public List<Lot> getCreatedLots() {
        List<Lot> temp = new ArrayList<>(createdLots);
        return temp;
    }

    public History getPurchase() {
        return purchase;
    }

    public History getSales() {
        return sales;
    }

    public List<Bid> getBids() {
        List<Bid> temp = new ArrayList<>(bids);
        return temp;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
