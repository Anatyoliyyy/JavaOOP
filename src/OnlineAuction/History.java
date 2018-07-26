package OnlineAuction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class History implements Serializable {
    private final List<Lot> history = new ArrayList<>();

    public void add(Lot lot){
        history.add(lot);
    }

    @Override
    public String toString() {
        return "History{" +
                "history=" + history +
                '}';
    }
}
