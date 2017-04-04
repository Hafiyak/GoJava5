package Practis.Module02;

/**
 * Created by user on 13.03.2017.
 */
public class Module02_2 {
    public static void main(String[] args) {

        String[] Owners = {"Dasha", "Vasia", "Oleg"};
        int[] Balances = {1000, 10000, 20000};

        String PersonWhid = "Dasha";
        double Whind = 250;

        for (int i = 0; i < Owners.length; i++) {
            if (Owners[i] == PersonWhid) {
                Whind(Whind, Balances[i]);
            }
        }
    }


    // kick statrup

    //
   /* private static void withdrawal(double withdrawal, int balance) {
        double commission = 5;
        double withdrawCommission = withdrawal * commission / 100;
        double withdraw = withdrawal + withdrawCommission;
        if (withdraw > balance) {
            System.out.println("NO");
        } else {
            balance -= withdraw;
            System.out.println(withdrawal + " " + balance);
        }
    }*/


    public static void Whind( double Whind ,int Balance) {
        double commission = 5;
        double withdrawCommission = Whind * commission / 100;
        double withdraw = Whind + withdrawCommission ;
        if (withdraw > Balance) {
            System.out.println("NO");
        } else {
            Balance -= withdraw;
            System.out.println(Balance + " " +  Whind );

        }
    }
}
