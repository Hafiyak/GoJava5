package Module03;

/**
 * Created by user on 15.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        System.out.println(arithmetic.add(12, 34));
        System.out.println(adder.check(12, 34));

    }
}

