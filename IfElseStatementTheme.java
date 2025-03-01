public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. ПОДСЧЕТ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ");
        int checkedNumber1 = -10;
        int checkedNumber2 = 21;
        int numberEntries = checkedNumber1;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (numberEntries % 2 == 0) {
                evenSum += numberEntries;
            } else {
                oddSum += numberEntries;
            }
            numberEntries++;
        } while (numberEntries <= checkedNumber2);
        System.out.println("В отрезке [" + checkedNumber1 + "," + checkedNumber2 +
                "] сумма четных чисел = " + evenSum + ",  а нечетных = " +
                oddSum);

        System.out.println("\n2. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX В ПОРЯДКЕ УБЫВАНИЯ");
        checkedNumber1 = 10;
        checkedNumber2 = 5;
        int checkedNumber3 = -1;
        int minNumber = 0;
        int maxNumber = 0;
        if (checkedNumber1 > checkedNumber2 && checkedNumber2 > checkedNumber3) {
            maxNumber = checkedNumber1;
            minNumber = checkedNumber3;
        } else if (checkedNumber3 > checkedNumber2 && checkedNumber2 > checkedNumber1) {
            maxNumber = checkedNumber3;
            minNumber = checkedNumber1;
        } else if (checkedNumber2 > checkedNumber3 && checkedNumber3 > checkedNumber1) {
            maxNumber = checkedNumber2;
            minNumber = checkedNumber1;
        } else if (checkedNumber1 > checkedNumber3 && checkedNumber3 > checkedNumber2) {
            maxNumber = checkedNumber1;
            minNumber = checkedNumber2;
        } else if (checkedNumber3 > checkedNumber1 && checkedNumber1 > checkedNumber2) {
            maxNumber = checkedNumber3;
            minNumber = checkedNumber2;
        } else if (checkedNumber2 > checkedNumber1 && checkedNumber1 > checkedNumber3) {
            maxNumber = checkedNumber2;
            minNumber = checkedNumber3;
        }
        for (maxNumber -= 1; maxNumber > minNumber; maxNumber--) {
            System.out.print(maxNumber + " ");
        }

        System.out.println("\n\n3. ВЫВОД РЕВЕРСИВНОГО ЧИСЛА И СУММЫ ЕГО ЦИФР");
        checkedNumber1 = 1234;
        checkedNumber2 = checkedNumber1;
        int reverse = 0;
        int sum = 0;
        while (checkedNumber2 != 0) {
            reverse = reverse * 10;
            reverse = reverse + checkedNumber2 % 10;
            checkedNumber2 = checkedNumber2 / 10;
        }
        int sumCheckedNumber = checkedNumber1;
        while (sumCheckedNumber != 0) {
            sum = sum + sumCheckedNumber % 10;
            sumCheckedNumber = sumCheckedNumber / 10;
        }
        System.out.println("number " + reverse);
        System.out.println("sum " + sum);

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК");
        checkedNumber1 = 22;
        checkedNumber2 = 0;
        int counter = 0;
        int sumCounter = 0;
        for (int i = 1; i <= checkedNumber1; i++) {
            checkedNumber2 = i;
            if (checkedNumber2 % 2 != 0) {
                counter += 1;
                System.out.printf("%4d", i);
            }
            if (checkedNumber2 % 10 == 0) {
                System.out.println();
            }
        }
        char ziro = '0';
        sumCounter = 15 - counter;
        while (sumCounter >= 1) {
            System.out.printf("%4c", ziro);
            sumCounter--;
        }

        System.out.println("\n\n5. ПРОВЕРКА КОЛИЧЕСТВА ДВОЕК ЧИСЛА НА ЧЕТНОСТЬ/НЕЧЕТНОСТЬ");
        checkedNumber1 = 3242592;
        checkedNumber2 = checkedNumber1;
        counter = 0;
        while (checkedNumber2 != 0) {
            if (checkedNumber2 % 10 == 2) {
                counter++;
            }
            checkedNumber2 = checkedNumber2 / 10;
        }
        if (counter % 2 == 0) {
            System.out.println("В " + checkedNumber1 + " четное (" + counter + ") количество двоек");
        } else if (counter % 2 != 0) {
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
        checkedNumber1 = 1234321;
        // последняя цифра в числе
        int digitlast = checkedNumber1 % 10;
        // первая цифра в числе
        int digitFirst = checkedNumber1;
        while (digitFirst >= 10) {
            digitFirst = digitFirst / 10;
        }
        if (digitlast == digitFirst) {
            System.out.println("Число " + checkedNumber1 + " - палиндром");
        } else {
            System.out.println("Число " + checkedNumber1 + " - не палиндром");
        }

        System.out.println("\n9. ПРОВЕРКА, ЯВЛЯЕТСЯ ЛИ ЧИСЛО СЧАСТЛИВЫМ");
        checkedNumber1 = 123321;
        int halfLeftDigits = checkedNumber1;
        int halfRightDigits = checkedNumber1;
        while (halfLeftDigits > 1000) {
            halfLeftDigits /= 1000;
        }
        while (halfRightDigits > 1000) {
            halfRightDigits %= 1000; 
        }
        int sumLeftDigits = 0;
        int buf1 = halfLeftDigits;
        while (buf1 > 0) {
            sumLeftDigits = sumLeftDigits + buf1 % 10;
            buf1 = buf1 / 10;
        }
        int sumRightDigits = 0;
        int buf2 = halfRightDigits;
        while (buf2 > 0) {
            sumRightDigits = sumRightDigits + buf2 % 10;
            buf2 = buf2 / 10;
        }
        if (sumLeftDigits == sumRightDigits) {
            System.out.println("Число " + checkedNumber1 + " - счастливое");
            System.out.println("Сумма цифр  " + halfLeftDigits + " = " + sumLeftDigits);
            System.out.println("Сумма " + halfRightDigits + " = " + sumRightDigits);
        } else {
            System.out.println("Число " + checkedNumber1 + " - не является счастливым");
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
