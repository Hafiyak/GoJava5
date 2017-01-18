package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class AIntMaxPositive {
    public static void main(String[] args) {
        int  [] array = {1,-2,5,110,13,2,5,6,7,8};
        int max = 0;
        for(int number : array)
            if(number>0 && max<number)
                max = number;
        System.out.println(max);
    }
}
