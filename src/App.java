import ex.DivideByZero;
import ex.NumberFormatException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DivideByZero, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;


        while (true) {
            System.out.println("Введите первое число");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
            } else {
                throw new NumberFormatException("Введите целочисленное значение.");
            }


            System.out.println("Введите второе число");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            } else {
                System.out.println("Введите целочисленное значение.");
            }


            if (b == 0) {
                throw new DivideByZero("На ноль делить НЕЛЬЗЯ!!!");
            } else {
                int result = a / b;
                System.out.println("Результат: " + result);
            }
        }
    }
}
