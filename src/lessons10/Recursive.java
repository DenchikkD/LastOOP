package lessons10;

/**
 * Created by Denni on 10.06.2016.
 */
public final class Recursive {

    private Recursive() {
    }

    public static String printNumbers(Integer num) {
        if (num == 0) {
            return Integer.toString(num);
        } else {
//            return num + " " + printNumbers(--num);
            return printNumbers(--num) + " " + num;
        }

    }

    public static Integer fact(Integer number) {
        if (number == 1) {
            return 1;
        } else {
            return number * fact(--number);
        }
    }


    public static Integer pow(Integer number, Integer step) {
        if (step == 1) {
            return number;
        } else if (step == 0) {
            return 1;
        } else {
            return number * pow(number, --step);
        }
    }

    public static String fib(Integer number) {
        if (number == 1) {
            return "1";
        } else if (number != 1) {

        }
        return Integer.toString(number--) + " " + number;

    }

    public static String foo(int n) {
        if (n == 0) {
            return "0";
        } else {
            return foo(n - 1) + " " + n;
        }
    }

    public static String diap(int n, int m) {
        if (n == m) {
            return Integer.toString(m);
        }
        return n + " " + diap(n + 1, m);
    }

    public static int step(float n) {


        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        } else {
            return step(n / 2);
        }
    }

    public static int triangle(int n) {
        System.out.println("n=" + n);
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        }
        int temp = n + triangle(n - 1);
        System.out.println("Returning" + temp);
        return temp;
    }
}


