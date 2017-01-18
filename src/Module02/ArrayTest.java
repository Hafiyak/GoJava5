package Module02;

/**
 * Created by user on 18.01.2017.
 */

import Module06.ArraysUtils;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[4] = -2;

        System.out.println(ArraysUtils.sum(array));
        System.out.println(ArraysUtils.min(array));
        System.out.println(ArraysUtils.max(array));
        System.out.println(ArraysUtils.maxPositive(array));
        System.out.println(ArraysUtils.multiplication(array));
        System.out.println(ArraysUtils.modulus(array));
        System.out.println(ArraysUtils.secondLargest(array));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array)));
    }
}
