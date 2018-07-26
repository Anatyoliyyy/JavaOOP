package OnlineAuction.SortAndFilter;

import OnlineAuction.Enums.Category;
import OnlineAuction.Lot;

import java.util.function.Predicate;

public class AuctionPredicates {
    public static Predicate<Lot> nameContains(String substring){
        Predicate<Lot> predicate = lot -> lot.getProduct().getName().startsWith(substring);
        return predicate;
    }
    public static Predicate<Lot> hasCategory (Category category){
        Predicate<Lot> predicate = lot -> lot.getProduct().getCategory().equals(category);
        return predicate;
    }
    public static Predicate<Lot> hasPrice(long from, long to){
        Predicate<Lot> predicate = lot -> lot.getCurrentPrice()>=from && lot.getCurrentPrice()<=to;
        return predicate;
    }
}

