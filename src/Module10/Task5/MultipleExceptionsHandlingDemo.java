package Module10.Task5;

/**
 * Created by user on 31.03.2017.
 */
import Module10.Task2.MyException;
import Module10.Task4.MySecondException;
public class MultipleExceptionsHandlingDemo {


    public static void throwExceptionByNumber(int number) throws MyException, MySecondException, MyThirdException {
        switch (number) {
            case 1:
                throw new MyException();
            case 2:
                throw new MySecondException();
            default:
                throw new MyThirdException();
        }
    }

    public static void main(String[] args) {
        try {
            throwExceptionByNumber(1);  //whrite number fro 1 to 3 to chainge exepshion !
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            System.out.println("Caught exception: " + e);
            System.out.println("Caught exception: " + e);
        }
    }

}
