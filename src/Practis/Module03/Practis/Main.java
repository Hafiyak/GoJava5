package Practis.Module03.Practis;

/**
 * Created by user on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {


        User user = new User("Fufu", 100, 5, "Fufuf", 0, "USD");

        user.withdraw(50);

        System.out.println(user.getMonthsOfEmployment());

        System.out.println("befor");

        user.monthIncreaser(1);

        System.out.println(user.getMonthsOfEmployment());


    }
}
