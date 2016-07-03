package lessons13;

import java.util.Scanner;

/**
 * Created by Denni on 22.06.2016.
 */
public class ExeptionTest {

    public static void main(String[] args) {
        int a = 4, b = 2;
        try {
            System.out.println(a / b);
            throw new MyExeption("Ростова умерла");


        } catch (ArithmeticException ext) {
            System.out.println("Попытка деления на ноль " + ext.getMessage());
            ext.printStackTrace();
        } catch (MyExeption myExeption) {
            myExeption.printStackTrace();
        }

    }

}