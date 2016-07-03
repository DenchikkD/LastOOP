package lessons5;

/**
 * Created by Denni on 25.05.2016.
 */
public class Outer {

    private Integer integer = 100;

    public static  final Integer INT_COST=50;

    static class NestedClass { /// будуть доступны лише статичні змінні і методи
        public void nestedClass() {
            System.out.println(INT_COST);
            System.out.println();// integer тут не доступна так як він не стаичний

        }
    }

    class InnerClass {

        public String string = "Test";

        public void innerTest() {
            System.out.println("Outer integer: " + integer);
        }
    }

    public void printInteger() {
        InnerClass innerClass = new InnerClass();
        innerClass.innerTest();
    }


}
