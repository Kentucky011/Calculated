import java.util.Scanner;

public class ConsoleReader {
    public int getNumber() throws NumberFormatException {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число.");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            return a;
        } else {
            throw new NumberFormatException("Введите целочисленное значение.");
        }
    }

}
