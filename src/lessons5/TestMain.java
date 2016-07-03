package lessons5;

/**
 * Created by Denni on 25.05.2016.
 */
public class TestMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printInteger();

        Outer.NestedClass nestedClass = new Outer.NestedClass();
        nestedClass.nestedClass();
        Outer.InnerClass innerClass = outer.new InnerClass();
        innerClass.innerTest();

    }
}
