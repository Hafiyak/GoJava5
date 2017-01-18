package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class DoubleMultiplication {
    public static void main(String[] args) {
        double  [] array = {1.5,2.5,3.5,4.5,2.5,4,5,1,6,7.5};
        double product = 1;
        for(double number : array)
            product *= number;
        System.out.println("Multiplication: " + product);
    }
}
