import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        int checkedNumber1 = scanner.nextInt();
        System.out.println("Введите число В");
        int checkedNumber2 = scanner.nextInt();
        System.out.println("Введите операцию над числами");
        char symbol = scanner.next().charAt(0);
        int result = 1;
        if (symbol == '+') {
            result = checkedNumber1 + checkedNumber2;
        } else if (symbol == '-') {
            result = checkedNumber1 - checkedNumber2;
        } else if (symbol == '*') {
            result = checkedNumber1 * checkedNumber2;
        } else if (symbol == '/') {
            result = checkedNumber1 / checkedNumber2;
        } else if (symbol == '^') {
            for (int i = 1; i <= checkedNumber2; i++) {
                result *= checkedNumber1;
            }
        } else if (symbol == '%') {
            result = checkedNumber1 % checkedNumber2;
        }
        System.out.println(checkedNumber1 + " " + symbol + " " + checkedNumber2 + " = " + result);
    }
}
