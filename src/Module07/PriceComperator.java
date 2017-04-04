package Module07;

import java.util.Comparator;

/**
 * Created by user on 22.03.2017.
 */
public class PriceComperator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
