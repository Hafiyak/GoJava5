package Module07;

import java.util.Comparator;

/**
 * Created by user on 23.03.2017.
 */
public class ComperatorPriceMaxToMin implements Comparator<Order> {


    @Override
    public int compare(Order o1, Order o2) {

        return o2.getPrice() - o1.getPrice();
    }
}
