package Module07;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.UnaryOperator;

import Module07.Order;
import Module07.User;


import Module04.Currency;
import sun.reflect.generics.tree.Tree;

/**
 * Created by user on 26.03.2017.
 */
public class Task7_3 {
    public static void main(String[] args) {

        TreeSet<User> users = new TreeSet<>();
        users.addAll(users);

        Module07.User user = new Module07.User(1001, "Vasia", "Popov", "Akeivka", 10000);
        Module07.User user1 = new Module07.User(1002, "Olia", "Pupkin", "Bukobel", 10001);
        Module07.User user2 = new Module07.User(1003, "Petia", "Piskin", "Cipr", 10002);
        Module07.User user3 = new Module07.User(1004, "Oksana", "Popov", "Uzghorod", 10003);
        Module07.User user4 = new Module07.User(1005, "Vika", "Piskin", "Kiev", 10004);
        Module07.User user5 = new Module07.User(1006, "Dima", "Popov", "Ivano-Frankovsk", 10005);
        Module07.User user6 = new Module07.User(1007, "Sasha", "Piskin", "Zzz", 10006);
        Module07.User user7 = new Module07.User(1008, "Ivan", "Popov", "AAA", 10007);
        Module07.User user8 = new Module07.User(1009, "Orest", "Piskin", "ZZz", 10008);
        Module07.User user9 = new Module07.User(1010, "Zenia", "Popov", "BBb", 10009);

        System.out.println(users);

        Set<Order> ordersSet = new TreeSet<>(new ComperatorPriceMaxToMin());
        ordersSet.add(new Order(1, 1000, Currency.UAH, "Pen", "Office Supplies", user));
        ordersSet.add(new Order(2, 1500, Currency.USD, "Ruler", "Office Supplies", user1));
        ordersSet.add(new Order(3, 900, Currency.UAH, "Pencil", "Office Supplies", user3));
        ordersSet.add(new Order(4, 500, Currency.USD, "Notebook", "Office Supplies", user4));
        ordersSet.add(new Order(5, 1600, Currency.UAH, "Ball", "Sport Store", user5));
        ordersSet.add(new Order(6, 1800, Currency.USD, "Snowboard", "Sport Store", user6));
        ordersSet.add(new Order(7, 1200, Currency.UAH, "Skis", "Sport Store", user7));
        ordersSet.add(new Order(8, 1700, Currency.UAH, "Pen", "Office Supplies", user8));
        ordersSet.add(new Order(8, 1700, Currency.USD, "Pen", "Office Supplies", user9));
        ordersSet.add(new Order(8, 1700, Currency.UAH, "Pen", "Office Supplies", user2));
        System.out.println(ordersSet);

        System.out.println("Chek Last Name : Petrov in DB ");
        boolean foundOrderbyName = ordersSet.stream()
                .anyMatch(order -> order.getUser().getLastName().equals("Petrov"));
        System.out.println("Set contains \"LastName\": " + foundOrderbyName + "\n");




        /*for (Order order : ordersSet) {
            if (order.getPrice() > 1000) {
                System.out.println(order.getPrice());
            }*/

        System.out.println("=============");
            Iterator iter = ordersSet.iterator();
            while (iter.hasNext()) {
                Order elem = (Order) iter.next();
                if (elem.getCurrency() == Currency.USD ) {
                    iter.remove();
                }
            }

            System.out.println(ordersSet);
        }
    }





