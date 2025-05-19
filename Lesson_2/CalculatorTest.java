package Lesson2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            calculator.setNumber1(number1);
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            calculator.setNumber2(number2);
            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char mathSign = scanner.next().charAt(0);
            calculator.setMatSign(mathSign);
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        }
    }
}

