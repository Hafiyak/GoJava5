package Module07;

/**
 * Created by user on 05.02.2017.
 */
import Module04.Currency;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.nio.channels.AlreadyBoundException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Alex", "Petrov", "Kiev", 1000);
        User user2 = new User(2, "Oleg", "Petrov", "Kiev", 1000);
        User user3 = new User(3, "Petro", "Petrov", "Kiev", 1000);
        User user4 = new User(4, "Max", "Ivanov", "Lviv", 1100);
        User user5 = new User(5, "Vika", "Ivanova", "Lviv", 1100);
        User user6 = new User(6, "Vita", "Ivanova", "Lviv", 1100);
        User user7 = new User(7, "Pasa", "Ivanov", "Lviv", 1100);
        User user8 = new User(8, "Vasia", "Korol", "Uzghorod", 1200);
        User user9 = new User(9, "Alexandr", "Korol", "Uzghorod", 1200);
        User user10 = new User(10, "Olia", "Korol", "Uzghorod", 1200);






        Order order1 = new Order(1, 100, Currency.USD, "Item1", "Item1", user1);
        Order order2 = new Order(2, 100, Currency.EUR, "Item2", "Item2", user2);
        Order order3 = new Order(3, 100, Currency.USD, "Item3", "Item3", user3);
        Order order4 = new Order(4, 100, Currency.USD, "Item4", "Item4", user4);
        Order order5 = new Order(5, 100, Currency.USD, "Item5", "Item5", user5);
        Order order6 = new Order(6, 100, Currency.USD, "Item6", "Item6", user6);
        Order order7 = new Order(7, 100, Currency.USD, "Item7", "Item7", user7);
        Order order8 = new Order(8, 100, Currency.USD, "Item8", "Item8", user8);
        Order order9 = new Order(9, 100, Currency.USD, "Item9", "Item9", user9);
        Order order10 = new Order(10, 100, Currency.USD, "Item10", "Item10", user10);

        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders,order1,order2,order3,order4,order5,order6,order7,order8,order9,order10);

        Set<Order> set = new TreeSet<>();
        Collections.addAll(set, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 );

        Task2.solution(orders);






    }
}

