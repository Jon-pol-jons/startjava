package Lesson2;

import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;
    private char symbol;

    private int result = 0;
    Scanner scanner = new Scanner(System.in);

    public int scannerNumber1() {
        System.out.print("Введите первое число: ");
        number1 = scanner.nextInt();
        return number1;
    }

    public int scannerNumber2() {
        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();
        return number2;
    }

    public char scannerSymbol() {
        System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
        symbol = scanner.next().charAt(0);
        return symbol;
    }

    public int mathematicalCalculations() {
        switch (symbol) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено ");
                } else {
                    result = number1 / number2;
                }
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= number2; i++) {
                    result *= number1;
                }
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                System.out.println("Ошибка: операция '" + symbol + "' не поддерживается");
        }
        return result;
    }

    private double resultNegativeDegree;

    public double negativeDegree() {
        if (number2 < 0) {
            resultNegativeDegree = Math.pow(number1, number2);
        }
        return resultNegativeDegree;
    }
}

