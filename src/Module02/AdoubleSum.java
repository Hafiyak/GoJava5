package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class AdoubleSum {
    public static void main(String[] args) {

        double  [] array = {1.5,2.5,3.5,4.5,5.5,6.5,7.5,8.5,9.5,10.5};
        double sum = 0;
        for(double number : array)
            sum += number;
        System.out.println(sum);
    }
}
