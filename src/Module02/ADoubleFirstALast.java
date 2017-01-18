package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class ADoubleFirstALast {

    public static void main(String[] args) {
        double [] array = {1.5,2.5,3.5,4.5,5.5,6.5,7.5,8.5,9.5,10.5,111.5};
        double first = array[0];
        double last = array[array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last));
    }

}
