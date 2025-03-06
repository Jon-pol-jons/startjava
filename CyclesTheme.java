
public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int initialNumber1 = -10;
        int initialNumber2 = 21;
        int counter = initialNumber1;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter++;
        } while (counter <= initialNumber2);
        System.out.println("В отрезке [" + initialNumber1 + "," + initialNumber2 +
                "] сумма четных чисел = " + evenSum + ",  а нечетных = " + oddSum);

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
        int reverse = 0;
        int sum = 0;
        while (currentNumber > 0) {
            reverse *= 10;
            reverse += currentNumber % 10;
            currentNumber /= 10;
            sum += sumCheckedNumber % 10;
            sumCheckedNumber /= 10;
        }
        System.out.println("исходное число в обратном порядке " + reverse);
        System.out.println("сумма выделенных цифр " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        int initialNumber = 23;
        counter = 0;
        int maxNumberCounter = 0;
        for (int i = 1; i <= initialNumber; i++) {
            if (i % 2 != 0) {
                counter++;
                System.out.printf("%4d", i);
            }
            if (i % 10 == 0) {
                System.out.println();
            }
            maxNumberCounter = counter;
            while (maxNumberCounter % 5 != 0) {
                maxNumberCounter++;
            }
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
        int size1 = 10;
        int size2 = 5;
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1; j++) {
                if (i == j || i == size1 - j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        size1 = 5;
        int size3 = size1;
        while (size3 >= 1) {
            int j = size3;
            while (j >= 1) {
                if (size3 == 1 || size3 == size1 || j == 1 || j == size3) {
                    System.out.print("#");
                } else {
                    System.out.print("#");
                }
                j--;
            }
            System.out.println();
            size3--;
        }
        System.out.println();

        size3 = 1;
        do {
            int j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= size3);
            System.out.println();
            size3++;
        } while (size3 <= 3);
        size3 = 1;
        do {
            int j = 2;
            do {
                System.out.print("$");
                j--;
            } while (j >= size3);
            System.out.println();
            size3++;
        } while (size3 <= 2);

        System.out.println("\n7. ВЫВОД ASCII-СИМВОЛОВ");
        int notEvenNumber = 0;
        System.out.format("%5s%11s%20s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 45; i++) {
            notEvenNumber = i;
            if (notEvenNumber % 2 != 0) {
                String name = Character.getName(notEvenNumber);
                System.out.printf("%n %-12d%-13c%s", i, i, name);
            }
        }

        System.out.println("\n\n8. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО ПАЛИНДРОМОМ");
        initialNumber = 1234321;
        int digitLast = initialNumber % 10;
        int digitFirst = initialNumber;
        while (digitFirst >= 10) {
            digitFirst /= 10;
        }
        if (digitLast == digitFirst) {
            System.out.println("Число " + initialNumber + " - палиндром");
        } else {
            System.out.println("Число " + initialNumber + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        initialNumber = 123321;
        int halfLeftDigits = initialNumber;
        int halfRightDigits = initialNumber;
        while (halfLeftDigits > 1000) {
            halfLeftDigits /= 1000;
        }
        while (halfRightDigits > 1000) {
            halfRightDigits %= 1000;
        }
        int sumLeftDigits = 0;
        int buf1 = halfLeftDigits;
        while (buf1 > 0) {
            sumLeftDigits += buf1 % 10;
            buf1 /= 10;
        }
        int sumRightDigits = 0;
        int buf2 = halfRightDigits;
        while (buf2 > 0) {
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
            String leftAlignment = " %s |";
            System.out.format(leftAlignment, i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
