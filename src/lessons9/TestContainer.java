package lessons9;

/**
 * Created by Denni on 08.06.2016.
 */
public class TestContainer {


    public static void main(String[] args) {
        Container<Integer> number = new Container<Integer>();
        number.setElement(50);
        Container<String> string = new Container(); // варіант описання
        string.setElement(new String("Hello"));// new String  відбувається по дефолту, тому можемо не вказувати

        Boxer boxer = new Boxer();
        Container object = boxer.boxing('c');
        boxer.printContanerTipe(object);
        boxer.printContanerTipe(number);
        boxer.printContanerTipe(string);
        Container container = new Container();// по замовчува зберыгаэться object, якщо не вказати бажаний тип данних
        container.setElement(new Object());


        Container user = boxer.boxing(new User("login", "pass"));
        boxer.printContanerTipe(user);
        Boxer<User> userBoxer = new Boxer<User>();
        boxer.boxingSuperT(user, new UserT("login","password",15));
        boxer.printContanerTipe(user);
        Container<UserT> userT =boxer.boxing( new UserT("login","password",18));
        userBoxer.unboxingElementUser(userT);
        userBoxer.unboxingElementUser(user);

    }
}
