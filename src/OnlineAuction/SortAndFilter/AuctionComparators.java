package OnlineAuction.SortAndFilter;

import OnlineAuction.Lot;

import java.util.Comparator;

public class AuctionComparators {
    public static Comparator<Lot> byName(){
        Comparator<Lot> comparator = (o1, o2) -> o1.getProduct().getName().compareTo(o2.getProduct().getName());
        return comparator;
    }
    public static Comparator<Lot> byStartTime(){
        Comparator<Lot> comparator = (o1, o2) -> o1.getStartTime().compareTo(o2.getStartTime());
        return comparator;
    }
    public static Comparator<Lot> byNumberBids(){
        Comparator<Lot> comparator = (o1, o2) -> Integer.valueOf(o1.getBids().size()).compareTo(Integer.valueOf(o2.getBids().size()));
        return comparator;
    }
    public static Comparator<Lot> byPrice(){
        Comparator<Lot> comparator = (o1, o2) -> Long.valueOf(o1.getCurrentPrice()).compareTo(Long.valueOf(o2.getCurrentPrice()));
        return comparator;
    }

}
