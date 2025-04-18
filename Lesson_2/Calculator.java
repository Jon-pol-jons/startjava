import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;
    private char mathematicalSign;
    private double resultNegativeDegree;

    private int result = 0;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMathematicalSign(char mathematicalSign) {
        this.mathematicalSign = mathematicalSign;
    }

    Scanner scanner = new Scanner(System.in);


    public int calculate() {
        switch (mathematicalSign) {
            case '+':
                return result = number1 + number2;
            case '-':
                return result = number1 - number2;
            case '*':
                return result = number1 * number2;
            case '/':
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено ");
                    break;
                } else {
                    return result = number1 / number2;
                }
            case '^':
                result = 1;
                for (int i = 1; i <= number2; i++) {
                    return result *= number1;
                }
            case '%':
                return result = number1 % number2;
            default:
                System.out.println("Ошибка: операция '" + mathematicalSign + "' не поддерживается");
        }
        return result;
    }

    public double negativeDegree() {
        if (number2 < 0) {
            resultNegativeDegree = Math.pow(number1, number2);
        }
        return resultNegativeDegree;
    }
}

