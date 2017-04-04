package Module10.Task4;

/**
 * Created by user on 31.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ExceptionTestingUtils.methodF();
        } catch (MySecondException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("caused by: " + e.getCause().getMessage());
        }
    }
}
