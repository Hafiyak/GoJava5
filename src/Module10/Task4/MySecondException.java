package Module10.Task4;

/**
 * Created by user on 31.03.2017.
 */
public class MySecondException extends  Exception{

    public MySecondException(String message) {
        super(message);
    }

    public MySecondException() {
        super();
    }

    public MySecondException(String message, Throwable cause) {
        super(message, cause);
    }
}
