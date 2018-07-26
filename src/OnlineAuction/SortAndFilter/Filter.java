package OnlineAuction.SortAndFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();
        for (T elem : list) {
            if (predicate.test(elem)){
                filtered.add(elem);
            }
        }
        return filtered;
    }
}
