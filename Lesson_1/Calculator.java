import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        int number1 = scanner.nextInt();
        System.out.println("Введите число В");
        int number2 = scanner.nextInt();
        System.out.println("Введите математическую операцию");
        char symbol = scanner.next().charAt(0);
        int result = 1;
        if (symbol == '+') {
            result = number1 + number2;
        } else if (symbol == '-') {
            result = number1 - number2;
        } else if (symbol == '*') {
            result = number1 * number2;
        } else if (symbol == '/') {
            result = number1 / number2;
        } else if (symbol == '^') {
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
        } else if (symbol == '%') {
            result = number1 % number2;
        }
        System.out.println(number1 + " " + symbol + " " + number2 + " = " + result);
    }
}
