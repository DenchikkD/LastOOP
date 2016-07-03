package lessons9;

/**
 * Created by Denni on 08.06.2016.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<String, Integer>("Str", 50);

        System.out.println(box.getFoo());
        System.out.println(box.getOof());
    }
}
