package Module06;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 21.03.2017.
 */
public final class ArraysUtils {

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static  void fillArrays(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public static void doubleFirst_Last() {
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5, 111.5};
        double first = array[0];
        double last = array[array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last));
        System.out.println();
    }

    public static  void fillArrayinRandom(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101 - 50);
        }
    }


    public static void ADoubleMaxPositive() {
        double[] array = {1.5, 2.5, 3.5, 4.5, 2.5, 4, 5, 1, 6, 7.5};
        double max = 0;
        for (double number : array)
            if (number > 0 && max < number)
                max = number;
        System.out.println(max);
    }

    public static void AdoubleSum() {
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5};
        double sum = 0;
        for (double number : array)
            sum += number;
        System.out.println(sum);
    }

    public static void AIntFirstAndLastElemen() {
        int[] array = {1, 5, 2, 56, 44, 5622, 85, 96, 751, 4523, 587, 156};
        int first = array[0];
        int last = array[array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last));
    }

    public static void AIntMaxPositive() {
        int[] array = {1, -2, 5, 110, 13, 2, 5, 6, 7, 8};
        int max = 0;
        for (int number : array)
            if (number > 0 && max < number)
                max = number;
        System.out.println(max);
    }

    public static void AIntMinMax() {
        Integer[] array = {1, 22, 2, 5, 7, 100};

        int min = Collections.min(Arrays.asList(array));
        int max = Collections.max(Arrays.asList(array));


        System.out.println("MINIMUM Element in Integer Array:" + min);
        System.out.println("MAXIMUM Element in Integer Array:" + max);
    }

    public static void AIntSum() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int number : array)
            sum += number;
        System.out.println(sum);
    }


    public static void DoubleMultiplication() {

        Double[] array = {1.5, 2.5, 3.5, 4.5, 2.5, 4.5, 1.5, 7.5};
        double product = 1;
        for (double number : array)
            product *= number;
        System.out.println("Multiplication: " + product);
    }

    public static void DoubleSecondLar() {
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5};
        double largest = array[0];
        double secondLargest = array[0];
        for (double number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        System.out.println("Second largest: " + secondLargest);

    }

    public static void FundAccount() {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Oww";
        double withdrawal = 100;
        for (int i = 0; i < ownerNames.length - 1; i++) {
            if (ownerNames[i].equals(ownerName)) {
                System.out.print(ownerName + " ");
                balances[i] += withdrawal;
                System.out.println(balances[i]);

            }
        }
    }


    public static void IntMultiplication() {

        int[] array = {1, 2, 3, 11, 2, 2, 2, 2, 2, 2, 2, 2};
        int product = 1;
        for (int number : array)
            product *= number;
        System.out.println("Multiplication: " + product);
    }

    public static void IntSecondLar() {
        int[] array = {1, 5, 15, 61, 62, 110, 253, 456, 265, 1111, 256, 1522};
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

    public static void WithdrawalParticularAccount() {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Ann";
        double withdrawal = 100;
//        String ownerName = "Oww";
//        double withdrawal = 490;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                System.out.print(ownerName + " ");
                withdrawal(withdrawal, balances[i]);

            }
        }
    }

    public static void withdrawal(double withdrawal, int balance) {
        double commission = 0.05;
        double withdrawCommission = withdrawal * commission ;
        double withdraw = withdrawal + withdrawCommission;
        if (withdraw > balance) {
            System.out.println("NO");
        } else {
            balance -= withdraw;
            System.out.println(withdrawal + " " + balance);
        }
    }

    public static double[] reverse(double[] arrayDouble) {
        double[] newArray = new double[arrayDouble.length];
        for (int i = 0; i < arrayDouble.length; i++)
            newArray[i] = arrayDouble[arrayDouble.length - 1 - i];
        return newArray;
    }

    public static int[] findEvenElements(int[] arrayInt) {
        int[] arrayEven = new int[0];
        for (int iter : arrayInt) {
            if (iter % 2 == 0) {
                int[] arrayTemp = new int[arrayEven.length + 1];
                for (int i = 0; i < arrayEven.length; i++) {
                    arrayTemp[i] = arrayEven[i];
                }
                arrayTemp[arrayTemp.length - 1] = iter;
                arrayEven = arrayTemp;
            }
        }
        return arrayEven;

    }
}




