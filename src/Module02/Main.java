package Module02;

/**
 * Created by user on 21.03.2017.
 */
import Module06.ArraysUtils;

public class Main {
    public static void main(String[] args) {
        //int[] arrayInt = new int[10];


        int[] arrayIntt= {2, 3, -5, 5, 9, 9, -10, -4, 1, -7};
        int[] ForfillArrayinRandom = new int[10];
        System.out.println("=============Array  int values:============== ");
        ArraysUtils.fillArrays(arrayIntt);
        System.out.println("=============Array with random even int values:==============");
        ArraysUtils.fillArrayinRandom(ForfillArrayinRandom);
        ArraysUtils.printArray(ForfillArrayinRandom);
        System.out.println("=============Array with doubleFirst_Last values:==============");
        ArraysUtils.doubleFirst_Last();
        System.out.println("=============Array with ADoubleMaxPositive values:==============");
        ArraysUtils.ADoubleMaxPositive();
        System.out.println("=============Array with AdoubleSum values:==============");
        ArraysUtils.AdoubleSum();
        System.out.println("=============Array with AIntFirstAndLastElemen values:==============");
        ArraysUtils.AIntFirstAndLastElemen();
        System.out.println("=============Array with AIntMaxPositive values:==============");
        ArraysUtils.AIntMaxPositive();
        System.out.println("=============Array with AIntMinMax values:==============");
        ArraysUtils.AIntMinMax();
        System.out.println("=============Array with AIntSum values:==============");
        ArraysUtils.AIntSum();
        System.out.println("=============Array with DoubleMultiplication values:==============");
        ArraysUtils.DoubleMultiplication();
        System.out.println("=============Array with DoubleSecondLar values:==============");
        ArraysUtils.DoubleSecondLar();
        System.out.println("=============Array with FundAccount values:==============");
        ArraysUtils.FundAccount();
        System.out.println("=============Array with IntMultiplication values:==============");
        ArraysUtils.IntMultiplication();
        System.out.println("=============Array with IntSecondLar values:==============");
        ArraysUtils.IntSecondLar();
        System.out.println("=============Array with WithdrawalParticularAccount values:==============");
        ArraysUtils.WithdrawalParticularAccount();
        System.out.println("=============Array with withdrawal values:==============");
        ArraysUtils.withdrawal(150,500);
        System.out.println("=============Array with withdrawal values:==============");

        double[] doublesArr = new double[10];
        double[] Arr = {1.0,2.0,3.0,4.0,5.0};
        ArraysUtils.reverse(Arr);

        System.out.println("=============Array with withdrawal values:==============");
        ArraysUtils.findEvenElements(ForfillArrayinRandom);


    }

}
