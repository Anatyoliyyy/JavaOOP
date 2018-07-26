package OnlineAuction;

import OnlineAuction.SortAndFilter.Filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AuctionsList implements Serializable {
    private final List<Lot> lotList;

    public AuctionsList() {
        this.lotList = new ArrayList<>();
    }

    public AuctionsList(List<Lot> lotList) {
        this.lotList = lotList;
    }

    public void addLot (Lot lot){
        lotList.add(lot);
    }
    public void sort(Comparator<Lot> comparator){
        lotList.sort(comparator);
    }
    public AuctionsList filter (Predicate<Lot> predicate){
        AuctionsList filtered = new AuctionsList(Filter.filter(lotList,predicate));
        return filtered;
    }

    @Override
    public String toString() {
        return "AuctionsList{" +
                "lotList=" + lotList +
                '}';
    }
}
