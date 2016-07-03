package lessons13;

/**
 * Created by Denni on 22.06.2016.
 */
public class ExceptionEx04 {
    public static void main(String[] args) throws MyExeption {
        string("0");

    }

    public static void string(String str) throws MyExeption {
        number(str);

    }

    public static void number(String str) throws MyExeption {
        div(Integer.parseInt(str));
    }

    public static void div(Integer num) throws MyExeption {
        if (num == 0) {
            throw new MyExeption("00000000000");
        }
        System.out.println(50 / num);
    }

}
