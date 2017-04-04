package Practis.Module02;

import java.security.acl.Owner;

/**
 * Created by user on 13.03.2017.
 */
public class Module02_04 {
    public static void main(String[] args) {

        String[] Owners = { "Sasha", "Dima", "Vasia"};
        int[] Balance = { 10000, 20000, 30000,};

        String nameOfPerson = "Vasia";
        int moneyToWhindraw = 200;

        for (int i = 0; i < Owners.length; i++) {
            if (Owners[i].equals(nameOfPerson)) ;
            sameMethod(moneyToWhindraw, Balance[i]);
        }
    }

    public static void sameMethod(int moneyToWhindraw, int balances) {

        double com = 0.05;
        double a = moneyToWhindraw * com ;
        double c = moneyToWhindraw + a;
        double b = balances - c;

        if (a > balances ) {
            System.out.println("No");
        } else {

            System.out.println(b + " " );
        }


    }
}

