package Lesson1;
/*
без цикла из числа 123 выделите сотни, десятки и единицы
для их получения используйте только операции / и %
найдите произведение и сумму выделенных цифр
выведите в консоль результат в формате (со всеми отступами):

 */
import java.util.Scanner;

public class Lesson1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число ");
        int a = scanner.nextInt();
        if (a>=100 && a<=999) {
            int i1 = a / 100; // сотни
            int i2 = a % 100 / 10;// десятки
            int i3 = a % 10; // еденицы
            System.out.println("Число " + a + " содержит:");
            System.out.println("сотен - " + i1);
            System.out.println("десятков - " + i2);
            System.out.println("едениц - " + i3);
            int c = 0;
            c = i1 + i2 + i3;
            System.out.println("Сума разрядов = " + c);
            int c1 = 0;
            c1 = i1 * i2 * i3;
            System.out.println("Произведение разрядов = " + c1);
        }
        else
            System.out.println("Вы ввели не верное число");
    }
}
