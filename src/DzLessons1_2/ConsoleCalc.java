package DzLessons1_2;

import java.util.Scanner;

/**
 * Created by Denni on 17.05.2016.
 */
public class ConsoleCalc {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int valueOne = scn.nextInt();
        System.out.println("Яку операцію потрібно виконати");
        String operation = scn.next();
        System.out.println("Введіть друге число число");
        int valueTwo = scn.nextInt();
        switch (operation) {
            case "+":
                OperationPlus operationPlus = new OperationPlus();
                System.out.println("Результат : " + operationPlus.doOperation(valueOne, valueTwo));
                break;
            case "-":
                OperationSubtract operationSubtract = new OperationSubtract();
                System.out.println("Результат : " + operationSubtract.doOperation(valueOne, valueTwo));
                break;
            case "/":
                OperationDivide operationDivide = new OperationDivide();
                System.out.println("Результат : " + operationDivide.doOperation(valueOne, valueTwo));
                break;
            case "*":
                OperationMultiply operationMultiply = new OperationMultiply();
                System.out.println("Результат : " + operationMultiply.doOperation(valueOne, valueTwo));
                break;
        }

    }
}


