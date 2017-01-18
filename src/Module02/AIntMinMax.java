package Module02;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 15.01.2017.
 */
public class AIntMinMax {
    public static void main(String[] args) {
        Integer [] array = { 1 , 22 , 2 , 5 , 7 , 100 };

        int min = Collections.min(Arrays.asList(array));
        int max = Collections.max(Arrays.asList(array));

        System.out.println("MINIMUM Element in Integer Array:" +min);
        System.out.println("MAXIMUM Element in Integer Array:" +max);
    }
}
