package Lesson2;

public class Calculator {
    private int number1;
    private int number2;
    private char matSign;
    private char zero;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMatSign(char matSign) {
        this.matSign = matSign;
    }

    public double calculate(double number1, int number2) {
        switch (matSign) {
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
                } else {
                    return number1 / number2;
                }
            case '^':
                if (number1 == 0 && number2 <= 0) {
                    System.out.println("Невозможно возвести 0 в степень меньше 1");
                }
                if (number1 == 1 || number1 == 0) {
                    return number1;
                }
                if (number2 > 1) {
                    return number1 * calculate(number1, --number2);
                }
                if (number2 < 1) {
                    return 1 / number1 * calculate(number1, ++number2);
                }
                break;
            case '%':
                if (number2 == 0) {
                    System.out.println("Деление по модулю на 0 запрещено");
                } else {
                    return number1 % number2;
                }
                break;

            default:
                System.out.println("Ошибка: операция '" + matSign + "' не поддерживается");
        }
        return zero;
    }
}
