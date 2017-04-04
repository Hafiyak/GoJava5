package Module07;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Comparator;

/**
 * Created by user on 23.03.2017.
 */
public class ComperItemShopIdCity implements Comparator<Order> {


    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getUser().getCity().compareTo(o2.getUser().getCity()) == 0) {
            return o1.getItemName().compareTo(o2.getItemName());
        }
        if (o1.getUser().getCity().compareTo(o2.getUser().getCity()) == 0) {
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
        return o1.getItemName().compareTo(o2.getItemName()) ;
        }


}