package lessons5;

/**
 * Created by Denni on 25.05.2016.
 */
public class TestOuterSafe {

    public static void main(String[] args) {
        OuterSafe outerSafe = new OuterSafe();
        outerSafe.addString("Hello");
        outerSafe.addString("form");
        outerSafe.addString("safe");
        outerSafe.getData();
    }
}
