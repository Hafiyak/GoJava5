package Module10.Task5;

/**
 * Created by user on 31.03.2017.
 */
public class MyThirdException extends  Exception {


    public MyThirdException(String message) {
        super(message);
    }

    public MyThirdException() {
        super();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
