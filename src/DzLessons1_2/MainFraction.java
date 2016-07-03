package DzLessons1_2;

/**
 * Created by Denni on 16.05.2016.
 */
public class MainFraction {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        Fraction frac = new Fraction(2.33F);
        fraction.setNumber(10.35F);
        fraction.add(frac);
        System.out.println(fraction.getNumber());


        System.out.println(frac.toString());
        System.out.println(fraction.toString());
        frac.print();

    }
}
