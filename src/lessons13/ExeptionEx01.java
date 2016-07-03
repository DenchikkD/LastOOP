package lessons13;

/**
 * Created by Denni on 22.06.2016.
 */
public class ExeptionEx01 {

    public static void runtime() {
        throw new StackOverflowError();

    }

    public static void exeption() {
        throw new ArithmeticException();

    }

    public static void custom() throws MyExeption {
        throw new MyExeption("Не получилось");

    }

    public static void main(String[] args) {
        System.out.println("TRY");
        try {
            runtime();
            exeption();
            custom();
        } catch (MyExeption myExeption) {
            System.out.println("MyExeption");
//            myExeption.printStackTrace();
        } catch (StackOverflowError err) {
            System.out.println("runtime");
//            err.printStackTrace();
            throw new IndexOutOfBoundsException();
        } catch (ArithmeticException ext) {
            System.out.println("exeption");
//            ext.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
