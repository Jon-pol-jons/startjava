package Lessonn1.Lesson1.lesson3;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int startInclusive = -10;
        int endInclusive = 21;
        int counter = startInclusive;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter <= endInclusive);
        System.out.println("В отрезке [" + startInclusive + "," + endInclusive +
                "] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        int checkedNumber1 = 10;
        int checkedNumber2 = 5;
        int checkedNumber3 = -1;
        int min = checkedNumber1;
        int max = checkedNumber2;
        if (checkedNumber1 > checkedNumber2) {
            min = checkedNumber2;
            max = checkedNumber1;
        }
        if (checkedNumber3 > max) {
            max = checkedNumber3;
        }
        if (checkedNumber3 < min) {
            min = checkedNumber3;
        }
        for (--max; max > min; max--) {
            System.out.print(max + " ");
        }

        System.out.println("\n\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        checkedNumber1 = 1234;
        int currentNumber = checkedNumber1;
        int digit = 0;
        while (currentNumber > 0) {
            digit += currentNumber % 10;
            currentNumber /= 10;
            checkedNumber1 /= 10;
        }
        System.out.println("сумма выделенных цифр " + digit);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        endInclusive = 23;
        counter = 0;
        int maxNumberCounter = 0;
        for (int i = 1; i <= endInclusive; i++) {
            if (i % 2 != 0) {
                counter++;
                System.out.printf("%4d", i);
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        maxNumberCounter = counter;
        while (maxNumberCounter % 5 != 0) {
            maxNumberCounter++;
        }
        maxNumberCounter -= counter;
        while (maxNumberCounter >= 1) {
            System.out.printf("%4s", 0);
            maxNumberCounter--;
        }

        System.out.println("\n\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        checkedNumber1 = 3242592;
        currentNumber = checkedNumber1;
        counter = 0;
        while (currentNumber > 0) {
            if (currentNumber % 10 == 2) {
                counter++;
            }
            currentNumber /= 10;
        }
        if (counter % 2 == 0) {
            System.out.println("В " + checkedNumber1 + " четное (" + counter + ") количество двоек");
        } else {
            System.out.println("В " + checkedNumber1 + " не четное (" + counter + ") количество двоек");
        }

        System.out.println("\n6. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР");
        int width = 10;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        width = 5;
        while (width >= 1) {
            int j = 1;
            while (j <= width) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            width--;
        }
        System.out.println();

        width = 3;
        int numberLines = 2 * width - 1;
        counter = 1;
        int increment = 1;
        int lineWidth = 1;
        do {
            int j = 0;
            do {
                System.out.print("$");
            } while (++j < lineWidth);
            System.out.println();
            if (counter == width) increment = -1;
            lineWidth += increment;
        } while (++counter <= numberLines);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        System.out.format("%5s%11s%14s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                String name = Character.getName(i);
                System.out.printf("%n  %-12d%-13c%s", i, i, name);
            }
        }
        for (int i = 97; i < 122; i++) {
            if (i % 2 == 0) {
                String name = Character.getName(i);
                System.out.printf("%n  %-12d%-13c%s", i, i, name);
            }
        }

        System.out.println("\n\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        int initialNumber = 1234321;
        int currNumber = initialNumber;
        int reverse = 0;
        while (currNumber > 0) {
            int remainder = currNumber % 10;
            reverse = reverse * 10 + remainder;
            currNumber /= 10;
        }
        if (initialNumber == reverse) {
            System.out.println("Число " + initialNumber + " - палиндром");
        } else {
            System.out.println("Число " + initialNumber + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        initialNumber = 123321;
        int halfLeftDigits = initialNumber / 1000;
        int halfRightDigits = initialNumber % 1000;
        int sumLeftDigits = 0;
        int sumRightDigits = 0;
        int buf1 = halfLeftDigits;
        int buf2 = halfRightDigits;
        while (buf2 > 0) {
            sumLeftDigits += buf1 % 10;
            buf1 /= 10;
            sumRightDigits += buf2 % 10;
            buf2 /= 10;
        }
        if (sumLeftDigits == sumRightDigits) {
            System.out.println("Число " + initialNumber + " - счастливое");
        } else {
            System.out.println("Число " + initialNumber + " - не является счастливым");
        }
        System.out.println("Сумма цифр " + halfLeftDigits + " = " + sumLeftDigits);
        System.out.println("Сумма " + halfRightDigits + " = " + sumRightDigits);

        System.out.println("\n10. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ ПИФАГОРА");
        System.out.printf("   |  2  3  4  5  6  7  8  9%n");
        System.out.printf(" --+------------------------%n");
        for (int i = 2; i <= 9; i++) {
            System.out.printf(" %2s|", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}

