package lessons13;

/**
 * Created by Denni on 22.06.2016.
 */
public class MyExeption extends Exception {

    public MyExeption(String message) {
        super(message);
    }

    public MyExeption(String message, Throwable ext) {
        super(message);
        initCause(ext);
    }

    public MyExeption(Throwable ext) {
        super(ext);

    }

}