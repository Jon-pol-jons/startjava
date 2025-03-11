import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число А");
        int checkedNumber1 = scanner.nextInt();
        System.out.println("ВВедите число В");
        int checkedNumber2 = scanner.nextInt();
        System.out.println("Введите операцию над числами");
        char sumbol = scanner.next().charAt(0);
        int result = 1;
        if (sumbol == '+') {
            result = checkedNumber1 + checkedNumber2;
        } else if (sumbol == '-') {
            result = checkedNumber1 - checkedNumber2;
        } else if (sumbol == '*') {
            result = checkedNumber1 * checkedNumber2;
        } else if (sumbol == '/') {
            result = checkedNumber1 / checkedNumber2;
        } else if (sumbol == '^') {
            for (int i = 1; i <= checkedNumber2; i++) {
                result *= checkedNumber1;
            }
        } else if (sumbol == '%') {
            result = checkedNumber1 % checkedNumber2;
        }
        System.out.println(checkedNumber1 + " " + (char) sumbol + " " + checkedNumber2 + " = " + result);
    }
}
