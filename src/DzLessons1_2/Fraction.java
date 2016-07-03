package DzLessons1_2;

import java.util.HashMap;

/**
 * Created by Denni on 16.05.2016.
 */
public class Fraction {
    private float number;

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public Fraction(float number) {
        this.number = number;
    }

    public Fraction() {
    }

    public Fraction add(Fraction frac) {
        this.number += frac.getNumber();

        return this;
    }

    public Fraction sub(Fraction frac) {
        this.number -= frac.getNumber();

        return this;
    }

    public Fraction mul(Fraction frac) {
        this.number *= frac.getNumber();

        return this;
    }

    public Fraction div(Fraction frac) {
        this.number /= frac.getNumber();

        return this;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        HashMap<String, Integer > integerHashMap=new HashMap<>();
        String key1 = "/";
        String key2 = "+";

        integerHashMap.put(key1, 105);
        integerHashMap.put(key2, 10005);


        System.out.println(integerHashMap.get(key1));
        System.out.println(integerHashMap.get(key2));
        System.out.println(integerHashMap.get("/"));




        return String.valueOf(number);
    }

    public void print() {
        System.out.println(number);
    }


}
