package OnlineAuction;

import OnlineAuction.Enums.Status;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Lot implements Serializable {
    private final long TIME_AUCTION_HOUR = 5;
    private final String id = UUID.randomUUID().toString();
    private final Product product;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private long currentPrice;
    private final User owner;
    private User currentWinner;
    private final List<Bid> bids = new ArrayList<>();
    private Status status;

    public Lot(Product product, long startingPrice, User owner) {
        this.product = product;
        this.startTime = LocalDateTime.now();
        this.endTime = startTime.plusSeconds(TIME_AUCTION_HOUR);
        this.currentPrice = startingPrice;
        this.owner = owner;
        this.currentWinner = null;
        this.status = Status.RUNNING;
    }

    public Lot(Product product, long startingPrice, User owner, LocalDateTime startTime) {
        if (startTime.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Illegal time");
        }
        this.product = product;
        this.startTime = startTime;
        this.endTime = startTime.plusHours(TIME_AUCTION_HOUR);
        this.currentPrice = startingPrice;
        this.owner = owner;
        this.currentWinner = null;
        this.status = Status.EXPECTED;
    }

    public boolean addBid(Bid bid) {
        if (checkBid(bid)) return false;
        if (currentWinner != null) {
            currentWinner.getAccount().debit(currentPrice);
        }
        currentPrice = bid.getMoney();
        currentWinner = bid.getUser();
        bids.add(bid);
        return true;
    }

    public User computeWinner() {
        if (LocalDateTime.now().isAfter(endTime)) {
            if (currentWinner == null) {
                System.out.println("Winner undefined");
            } else {
                status = Status.FINISHED;
                currentWinner.getPurchase().add(this);
                owner.getSales().add(this);
            }
        }
        return currentWinner;
    }

    public Product getProduct() {
        return product;
    }

    private boolean checkBid(Bid bid) throws RuntimeException {
        if (LocalDateTime.now().isAfter(startTime) && status == Status.EXPECTED){
            status = Status.RUNNING;
        }
        if (bid.getUser() == owner || bid.getMoney() <= currentPrice || currentWinner == bid.getUser()) {
            throw new IllegalArgumentException("Illegal bid");
        }
        if (status == Status.FINISHED  || status == Status.EXPECTED){
            throw new IllegalStateException("Auction is finished or expected");
        }
        boolean success = bid.getUser().getAccount().withdraw(bid.getMoney());
        if (!success) {
            return true;
        }
        return false;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public User getOwner() {
        return owner;
    }

    public User getWinner() {
        return currentWinner;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Status getStatus() {
        return status;
    }

    public List<Bid> getBids() {
        List<Bid> temp = new ArrayList<>(bids);
        return temp;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Lot{" +
                "product=" + product +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", currentPrice=" + currentPrice +
                ", owner=" + owner +
                ", status=" + status +
                '}';
    }
}
