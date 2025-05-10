import java.util.*;

public class Exception {
    public static void main(String[] args) {
        int n1 = new Scanner(System.in).nextInt();
        int n2 = new Scanner(System.in).nextInt();
        int d = 0;
        try {
            d = n1 / n2;
        } catch (ArithmeticException exception) {
            System.out.println("Can't divide with zero");
        } finally {
            System.out.println("Execution completed (finally block)");
        }
        System.out.println(d);
    }
}

