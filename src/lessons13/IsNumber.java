package lessons13;

import java.util.Scanner;

/**
 * Created by Denni on 22.06.2016.
 */
public class IsNumber {

    public static void myNumber(String number) throws MyNotANumberException {
        try {
            Integer num = Integer.valueOf(number);
        } catch (NumberFormatException e) {
            throw new MyNotANumberException("Неверный формат числа", e);
        }
    }

    public static void main(String[] args) throws MyNotANumberException {
        System.out.println("Введите что-то");
        Scanner scn = new Scanner(System.in);
        String num = scn.nextLine();

        myNumber(num);


    }

}
