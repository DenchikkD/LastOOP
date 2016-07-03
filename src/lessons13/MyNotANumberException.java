package lessons13;

/**
 * Created by Denni on 22.06.2016.
 */
public class MyNotANumberException extends Exception {
    public MyNotANumberException(String message, Throwable throwable) {
        super(message);
        initCause(throwable);
    }
}
