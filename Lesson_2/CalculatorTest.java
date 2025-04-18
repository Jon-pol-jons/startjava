import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            userAnswer = "yes";
            try {
                System.out.print("Введите первое число: ");
                int number1 = scanner.nextInt();
                calculator.setNumber1(number1);
                System.out.print("Введите второе число: ");
                int number2 = scanner.nextInt();
                calculator.setNumber2(number2);
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char mathematicalSign = scanner.next().charAt(0);
                calculator.setMathematicalSign(mathematicalSign);
                if (mathematicalSign == '^' && number2 < 0) {
                    System.out.println(calculator.negativeDegree());
                } else {
                    System.out.println(calculator.calculate());
                }
                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    userAnswer = scanner.next();
                } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException |
                StringIndexOutOfBoundsException e) {
                System.err.println("Неправильный формат");
            }
        }
    }
}

