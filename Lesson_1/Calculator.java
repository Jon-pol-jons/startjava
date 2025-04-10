import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        int Number1 = scanner.nextInt();
        System.out.println("Введите число В");
        int Number2 = scanner.nextInt();
        System.out.println("Введите математическую операцию");
        char symbol = scanner.next().charAt(0);
        int result = 1;
        if (symbol == '+') {
            result = Number1 + Number2;
        } else if (symbol == '-') {
            result = Number1 - Number2;
        } else if (symbol == '*') {
            result = Number1 * Number2;
        } else if (symbol == '/') {
            result = Number1 / Number2;
        } else if (symbol == '^') {
            for (int i = 1; i <= Number2; i++) {
                result *= Number1;
            }
        } else if (symbol == '%') {
            result = Number1 % Number2;
        }
        System.out.println(Number1 + " " + symbol + " " + Number2 + " = " + result);
    }
}
