package Module06;

import java.util.Arrays;

/**
 * Created by user on 21.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        User user = new User(111,"Andriy","Hafiyak",1500,1001);
        User user1 = new User(222,"Andriy","Hafiyak",2000,999);
        User user2 = new User(222,"Oleh","Popov",1990,19900);
        User user3 = new User(222,"Alex","Popov",1990,19900);
        User user4 = new User(555,"Vasia","Popov",1990,19900);
        User user5 = new User(555,"Oksana","Popov",1990,19900);

        System.out.println("========All Users=========== ;)");
        User[] users = {user,user1,user2};
        UserUtils.printUsers(users);


        System.out.println("====Users unique  of athers =====");
        User[] unique = UserUtils.uniqueUsers(users);
        UserUtils.printUsers(unique);

        System.out.println("====Users paySaylery....MMM...Good Best Day in monht.) =====");
        User[] paySaylery = UserUtils.paySalaryToUsers(users);
        UserUtils.printUsers(paySaylery);

        System.out.println("====Users WithContitionalBalance   =====");
        User[] balance = UserUtils.usersWithContitionalBalance(users,21890);
        UserUtils.printUsers(balance);

        System.out.println("====Users WithContitionalBalance   =====");
        long[] usersId = UserUtils.getUsersId(users);
        System.out.println(Arrays.toString(usersId));



        System.out.println("Deleting 3 and 6 users from source array...");
        //users[222] = null;
        //users[555] = null;
        //System.out.println("Success! Result:");
        UserUtils.printUsers(users);
        System.out.println("Deleting null elements from source array...");
        users = UserUtils.deleteEmpty(users);
        UserUtils.printUsers(users);
        System.out.println("Success!");


    }
}
