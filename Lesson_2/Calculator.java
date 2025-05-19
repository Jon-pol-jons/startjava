package Lesson2;

public class Calculator {
    private int number1;
    private int number2;
    private char matSign;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMatSign(char matSign) {
        this.matSign = matSign;
    }

    public double calculate() {
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
                if (number1 == 1 || number1 == 0) {
                    return number1;
                } else if (number2 > 1) {
                    int result = 1;
                    for (int i = 1; i <= number2; i++) {
                        result = result * number1;
                    }
                    return result;
                } else if (number2 < 1) {
                    double p = number2 < 0 ? 1.0 / number1 : number1;
                    int m = number2 < 0 ? -number2 : number2;
                    double res = 1.0;
                    while (m-- > 0) {
                        res *= p;
                    }
                    return res;
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
        return number1;
    }
}
