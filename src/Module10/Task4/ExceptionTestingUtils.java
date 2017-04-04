package Module10.Task4;

/**
 * Created by user on 31.03.2017.
 */
import Module10.Task2.MyException;
public class ExceptionTestingUtils {
    public static void methodF() throws MySecondException {
        try {
            methodG();
        } catch (MyException e) {
            throw new MySecondException("My Second Exception", e);
        }
    }

    public static void methodG() throws MyException {
        throw new MyException("My Exception");
    }
}
