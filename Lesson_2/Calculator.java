package Lesson2;

public class Calculator {
    private int number1;
    private int number2;
    private char mathSign;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public double calculate() {
        switch (mathSign) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено ");
                    break;
                }
                return number1 / number2;

            case '^':
                double result = 1;
                for (int i = 0; i < Math.abs(number2); i++) {
                    result *= number1;
                }
                return number2 >= 0 ? result : 1 / result;
            case '%':
                if (number2 == 0) {
                    System.out.println("Деление по модулю на 0 запрещено");
                    break;
                }
                return number1 % number2;
            default:
                System.out.println("Ошибка: операция '" + mathSign + "' не поддерживается");
        }
        return 0;
    }
}
