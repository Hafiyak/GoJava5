package Module10.Task2;

import Module10.Task2.MyException;

/**
 * Created by user on 31.03.2017.
 */
public class MyExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("Testing MyException");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
