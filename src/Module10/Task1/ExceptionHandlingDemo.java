package Module10.Task1;

/**
 * Created by user on 31.03.2017.
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            throw new Exception("Testing exception handling");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inside \"finally\"");
        }
    }
}
