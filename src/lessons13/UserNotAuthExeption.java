package lessons13;

/**
 * Created by Denni on 22.06.2016.
 */
public class UserNotAuthExeption extends Exception {
    public UserNotAuthExeption(String message) {
        super(message);
    }
}
