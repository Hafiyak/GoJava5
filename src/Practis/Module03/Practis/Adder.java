package Practis.Module03.Practis;

/**
 * Created by user on 14.03.2017.
 */
public class Adder extends Arithmetic {

    boolean cheack(int a,int b){

            return a * b > b  ;


        }

    public static void main(String[] args) {

        Adder adder = new Adder();
        System.out.println(adder.cheack(10,9));
    }


    }

