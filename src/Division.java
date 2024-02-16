public class Division {
    public int performDivision(int a, int b) {
        int result = 0;
        if (b == 0) {
            System.out.println("На ноль делить нельзя, результат будет 0");
        } else {
            result = a / b;
        }
        return result;
    }
}
