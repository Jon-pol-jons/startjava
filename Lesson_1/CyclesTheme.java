public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int beginningCountdown = -10;
        int endCountdown = 21;
        int counter = beginningCountdown;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter <= endCountdown);
        System.out.println("В отрезке [" + beginningCountdown + "," + endCountdown +
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
        int sumCheckedNumber = checkedNumber1;
        int reversed = 0;
        int sum = 0;
        while (currentNumber > 0) {
            reversed = currentNumber % 10;
            System.out.print(reversed);
            currentNumber /= 10;
            sum += sumCheckedNumber % 10;
            sumCheckedNumber /= 10;
        }
        System.out.println("\nсумма выделенных цифр " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        endCountdown = 23;
        counter = 0;
        int maxNumberCounter = 0;
        for (int i = 1; i <= endCountdown; i++) {
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
        int rectangleWidth = 10;
        int rectangleHeight = 5;
        for (int i = 0; i < rectangleHeight; i++) {
            for (int j = 0; j < rectangleWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int widthTriangle = 5;
        while (widthTriangle >= 1) {
            int j = 1;
            while (j <= widthTriangle) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            widthTriangle--;
        }
        System.out.println();

        widthTriangle = 3;
        int numberLines = 2 * widthTriangle - 1;
        counter = 1;
        int increment = 1;
        int lineWidth = 1;
        do {
            int j = 0;
            do {
                System.out.print("$");
            } while (++j < lineWidth);
            System.out.println();
            if (counter == widthTriangle) increment = -1;
            lineWidth += increment;
        } while (++counter <= numberLines);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        int oddNumber = 0;
        System.out.format("%5s%11s%14s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            oddNumber = i;
            if (oddNumber % 2 != 0) {
                String name = Character.getName(oddNumber);
                System.out.printf("%n  %-11d%-13c%s", i, i, name);
            }
        }
        for (int i = 97; i < 123; i++) {
            oddNumber = i;
            if (oddNumber % 2 == 0) {
                String name = Character.getName(oddNumber);
                System.out.printf("%n  %-11d%-13c%s", i, i, name);
            }
        }

        System.out.println("\n\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        int initialNumber = 1234321;
        int palindrome = initialNumber;
        reversed = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reversed = reversed * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (initialNumber == reversed) {
            System.out.println("Число " + initialNumber + " - палиндром");
        } else {
            System.out.println("Число " + initialNumber + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        initialNumber = 123321;
        int halfLeftDigits = initialNumber;
        int halfRightDigits = initialNumber;
        int sumLeftDigits = 0;
        int sumRightDigits = 0;
        for (int i = 0; i < initialNumber; i++) {
            if (halfLeftDigits > 1000) {
                halfLeftDigits /= 1000;
            }
            if (halfRightDigits > 1000) {
                halfRightDigits %= 1000;
            }
        }
        int buf1 = halfLeftDigits;
        int buf2 = halfRightDigits;
        while (buf1 > 0 && buf2 > 0) {
            sumLeftDigits += buf1 % 10;
            buf1 /= 10;
            sumRightDigits += buf2 % 10;
            buf2 /= 10;
        }
        if (sumLeftDigits == sumRightDigits) {
            System.out.println("Число " + initialNumber + " - счастливое");
            System.out.println("Сумма цифр  " + halfLeftDigits + " = " + sumLeftDigits);
            System.out.println("Сумма " + halfRightDigits + " = " + sumRightDigits);
        } else {
            System.out.println("Число " + initialNumber + " - не является счастливым");
            System.out.println("Сумма цифр " + halfLeftDigits + " = " + sumLeftDigits);
            System.out.println("Сумма " + halfRightDigits + " = " + sumRightDigits);
        }

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

