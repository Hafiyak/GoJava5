package Practis.Module02;

/**
 * Created by user on 13.03.2017.
 */
public class Module02_03 {
    public static void main(String[] args) {

        String[] Owners = {"Sasha", "Ivan", "Oleh"};
        int[] Money = {1000, 2000, 25000};

        String nameOfLucky = "Sasha";
        int WhindrawMoney = 499;

        for (int i = 0; i < Owners.length; i++) {
            if (Owners[i] == nameOfLucky) {
                fufu(WhindrawMoney,Money[i]);
            }
        }
    }


    public static void fufu(int WhindrawMoney,int money){
        int a = WhindrawMoney;
        int b = money;
        int limit = 500;
        int c = a + b ;
        if (a > limit)
            System.out.println("No");
        else {
            System.out.println(c);
        }





    }

}
