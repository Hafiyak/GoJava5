package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class AIntFirstAndLastElemen {
    public static void main(String[] args) {
        int  [] array = {1,5,2,56,44,5622,85,96,751,4523,587,156};
        int first = array[0];
        int last = array[array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last));
    }
}
