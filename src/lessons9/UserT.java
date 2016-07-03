package lessons9;

/**
 * Created by Denni on 08.06.2016.
 */
public class UserT extends User {

    private Integer age;

    public UserT(String login, String password) {
        super(login, password);
    }

    public UserT(String login, String password, Integer age) {
        super(login, password);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
