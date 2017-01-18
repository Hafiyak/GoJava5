package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class AIntSum {
    public static void main(String[] args) {
        int  [] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int number : array)
            sum += number;
        System.out.println(sum);
    }
}
