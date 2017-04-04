package Module07;

import Module04.Currency;


import javax.jws.soap.SOAPBinding;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by user on 22.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<Module07.User> users = new ArrayList<>();
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

        List<Order> li = new ArrayList<>();

        li.add(new Order(1001, 100, Currency.USD, "AAA", "AA", user));
        li.add(new Order(1001, 100, Currency.USD, "Bad", "Silver", user1));
        li.add(new Order(1001, 120, Currency.USD, "ZZZ", "Zfinish", user2));
        li.add(new Order(1001, 110, Currency.USD, "Good", "Sapfir", user3));
        li.add(new Order(1001, 120, Currency.USD, "Programming", "Silver", user4));
        li.add(new Order(1001, 110, Currency.UAH, "Googlle", "Briliant", user5));
        li.add(new Order(1001, 120, Currency.UAH, "Adidas", "Almaz", user6));
        li.add(new Order(1001, 110, Currency.UAH, "Puma", "Aluminiy", user7));
        li.add(new Order(1002, 120, Currency.UAH, "Rebook", "Tratata", user8));
        li.add(new Order(1003, 120, Currency.UAH, "Other", "Gold", user9));

        System.out.println(li);
        Collections.sort(li, new ComperatorPriceMaxToMin());
        System.out.println("========Sort by Price from Bigest to chipes .... ");
        System.out.println(li);
        System.out.println("=======Sort by Price and City =======");
        Collections.sort(li, new ComperatrorPriceAndCity());
        System.out.println(li);
        System.out.println("==========Sort by ItemName ShopID City ======== ");
        Collections.sort(li, new ComperItemShopIdCity());
        System.out.println(li);
        System.out.println("");
        System.out.println("======Bonus ======");

        System.out.println("");


        HashSet<Order> setFreeFromDuplicates = new HashSet<>(li);

        System.out.println("\u001B[32m");
        System.out.println("Set Free From Duplicates : ");
        for (Order sFFD : setFreeFromDuplicates) {
            System.out.println(sFFD.toString());
        }


        System.out.println("\u001B[050m");
        Map<String, List<Order>> ordersByCities = li.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()));
        System.out.println("Orders split by user cities:\n" + ordersByCities + "\n");


    }
}

