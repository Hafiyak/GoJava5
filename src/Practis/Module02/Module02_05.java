package Practis.Module02;

/**
 * Created by user on 13.03.2017.
 */
public class Module02_05 {
    public static void main(String[] args) {


        int Balance = 100;
        int Summ = 50;

        double comishion = 0.05 ;
        double a = Summ * comishion ;
         double b = Summ + a ;
        double c = Balance - b ;

        if (b > Balance) {
            System.out.println("No");
        } else {
            System.out.println(c);

        }
    }
}
