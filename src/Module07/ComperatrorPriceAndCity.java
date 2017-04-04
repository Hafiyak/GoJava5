package Module07;

import javax.jws.soap.SOAPBinding;
import java.util.Comparator;

/**
 * Created by user on 23.03.2017.
 */
public class ComperatrorPriceAndCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        /*int priceCompare = o1.getPrice() - o2.getPrice();
        if (priceCompare != 0) {
            return priceCompare;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }*/
        if (o1.getUser().getCity().compareTo(o2.getUser().getCity()) == 0) {
            return o1.getPrice() - o2.getPrice();
        }
           return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
