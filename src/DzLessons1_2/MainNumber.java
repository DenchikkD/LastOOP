package DzLessons1_2;

/**
 * Created by Denni on 15.05.2016.
 */
public class MainNumber {
    public static void main(String[] args) {

        Number num = new Number(5);
        Number num2 = new Number(2);

        System.out.println(num.get());
        System.out.println(num2.get());
        num.add(num2);
        System.out.println(num.get());
        num.pow(num2);
        System.out.println(num.get());
        num.setNumber(5);
        System.out.println(num.fact().get());
        num.setNumber(5);
        num.mod(num2);
        System.out.println(num.get());



    }
}
