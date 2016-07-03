package lessons13;

import java.util.Scanner;

/**
 * Created by Denni on 22.06.2016.
 */
public class UsertTestExeption {
    public static void main(String[] args) throws UserNotAuthExeption {
        System.out.println("Введите логине");
        Scanner scn = new Scanner(System.in);
        String log = scn.nextLine();
        System.out.println("Введите пароль");
        String pass = scn.nextLine();
        User user = new User();


        if (user.authCheck(log, pass)) {
            System.out.println("ok");
        }
    }
}
