package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class IntMultiplication {
    public static void main(String[] args) {
        int  [] array = {1,2,3,11,2,2,2,2,2,2,2,2};
        int product = 1;
        for(int number : array)
            product *= number;
        System.out.println("Multiplication: " + product);
    }
}
