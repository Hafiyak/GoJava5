package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class ADoubleMaxPositive {
    public static void main(String[] args) {
        double   [] array = {1.5,2.5,3.5,4.5,2.5,4,5,1,6,7.5};
        double   max = 0;
        for(double number : array)
            if(number>0 && max<number)
                max = number;
        System.out.println(max);
    }
}
