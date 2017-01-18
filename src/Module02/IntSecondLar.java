package Module02;

/**
 * Created by user on 15.01.2017.
 */
public class IntSecondLar {
    public static void main(String[] args) {
        int  [] array = {1,5,15,61,62,110,253,456,265,1111,256,1522};
        int largest = array[0];
        int secondLargest = array[0];
        for (int number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        System.out.println("Second largest: " + secondLargest);
    }
}
