package Module10.Task3;

/**
 * Created by user on 31.03.2017.
 */
public class TestClassDemo {
    public static void main(String[] args) {
        TestClass testClass = null;

        try {
            testClass.testMethod();
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
