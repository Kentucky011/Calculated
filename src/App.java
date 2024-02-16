
public class App {
    public static void main(String[] args){
    ConsoleReader number = new ConsoleReader();
    Division perform = new Division();
    int result = perform.performDivision(number.getNumber(), number.getNumber());
        System.out.println("Ответ: " + result);
    }
}
