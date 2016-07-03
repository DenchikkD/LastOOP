package DzLessons1_2;

/**
 * Created by Denni on 15.05.2016.
 */
public class Number {
    private int number;

    public int get() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public Number(int number) {
        this.number = number;
    }


    public Number add(Number num) {
        this.number += num.get();
        return this;
    }

    public Number sub(Number num) {
        this.number -= num.get();
        return this;
    }

    public Number mul(Number num) {
        this.number *= num.get();
        return this;
    }

    public Number div(Number num) {
        this.number /= num.get();
        return this;
    }

    public Number pow(Number exponent) {
        this.number = (int) Math.pow(number, exponent.get());
        return this;
    }

    public Number fact() {
        int fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
            System.out.println(fac);
        }
        this.number = fac;
        return this;
    }

    public Number mod(Number num) {
        this.number %= num.get();

        return this;

    }


//    private int number;
//
//    public Number(int number) {
//        this.number = number;
//    }
//
//    public Number() {
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//
//    public int get() {
//        return number;
//
//    }
//
//    public Number add(Number num) {
//        this.number += num.get();
//        return this;
//    }
//
//
//
//    public static void main(String[] args) {
//        Number num = new Number(100);
//        Number num2 = new Number(200);
//
//        System.out.println("num: " + num.get());
//
//        num.add(num2);
//        System.out.println("num: " + num.get());
//
//
//    }

}
