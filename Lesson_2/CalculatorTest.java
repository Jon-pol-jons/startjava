import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            userAnswer = "yes";
            try {
                calculator.ScannerNumber1();
                calculator.ScannerNumber2();
                if (calculator.ScannerSymbol() == '^' && calculator.ScannerNumber2() < 0) {
                    System.out.println(calculator.negativeDegree());
                } else {
                    System.out.println(calculator.mathematicalCalculations());
                }
                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    userAnswer = scanner.next();
                } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException | StringIndexOutOfBoundsException e) {
                System.err.println("Неправильный формат");
            }
        }
    }
}

