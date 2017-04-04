package Practis.Module02;

/**
 * Created by user on 12.03.2017.
 */

/*
public class WithdrawalParticularAccount {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Ann";
        double withdrawal = 100;
//        String ownerName = "Oww";
//        double withdrawal = 490;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                System.out.print(ownerName + " ");
                withdrawal(withdrawal, balances[i]);

            }
        }
    }

    private static void withdrawal(double withdrawal, int balance) {
        double commission = 5;
        double withdrawCommission = withdrawal * commission / 100;
        double withdraw = withdrawal + withdrawCommission;
        if (withdraw > balance) {
            System.out.println("NO");
        } else {
            balance -= withdraw;
            System.out.println(withdrawal + " " + balance);
        }
    }
}*/
public class fff {

    public static void main(String[] args) {



        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


        String ownerName = "Oww";
        double withdrawal = 490;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                withdrawal(withdrawal, balances[i]);
            }
        }
    }

    private static void withdrawal(double withdrawal, int balance) {
        double commission = 5;
        double withdrawCommission = withdrawal * commission / 100;
        double withdraw = withdrawal + withdrawCommission;
        if (withdraw > balance) {
            System.out.println("NO");
        } else {
            balance -= withdraw;
            System.out.println(withdrawal + " " + balance);
        }
    }
}
