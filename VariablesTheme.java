import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1 Вывод характеристик компьютера ");
        float processorFrequency = 2.9f;
        double coreTechnology = 0.065d;
        byte cores = 2;
        short memorySsd = 248;
        short nambeVideoCards = 920;
        char seriaVideoCards = 'm';
        long memoryVideoCards = 4098;
        int ram = 8000;
        boolean is = (memorySsd >= 18);
        if (is) {
            System.out.println("Ноутбук марки Asus f6e.На борту процессор Intel core 2 Duo с ");
            System.out.println("тактовой чистотой " + processorFrequency + " Гц и ");
            System.out.println("тех процессом " + coreTechnology + " нано метров");
            System.out.println("количество ядер " + cores);
            System.out.println("Твердотельный накопитель марка и модель Apacher AST 280");
            System.out.println("Объем памяти " + memorySsd + " гигабайт");
            System.out.println("Видео карта Nvidia" + nambeVideoCards + " " + seriaVideoCards);
            System.out.println("с видео памятью " + memoryVideoCards + " гигабайт");
            System.out.println("Оперативная память марки Apacher");
            System.out.println("Количество оперативной памяти " + ram + " мегабайт");
        }

        System.out.print("\n2. Расчет стоимости товара со скидкой");
        float pricePen = 105.5F;
        float priceBook = 235.83F;
        System.out.println("стоимость ручки без скидки " + pricePen);
        System.out.println("стоимость книги без скидки " + priceBook);
        float discount = 0.0F;
        float discountPen = pricePen / 100.0F * 11.0F;
        System.out.println("сумма скидки на ручку составляет " + discountPen);
        float discountBook = priceBook / 100.0F * 11.0F;
        System.out.println("Сумма скидки на книгу " + discountBook);
        System.out.println(" стоимость ручки со скидкой составит " + (pricePen - discountPen));
        System.out.println("Стоимость книги со скидкой составит " + (priceBook - discountBook));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  V     V  a     ");
        System.out.println("    J   a a  V   V  a a    ");
        System.out.println(" J  J  aaaaa  V V  aaaaa   ");
        System.out.println("  JJ  a     a  V  a     a  ");

        System.out.println("\n4. Вывод min и max значений целых числовых типов ");
        short extremesShortValue = 32767;
        System.out.println("short начальное значение " + extremesShortValue);
        extremesShortValue++;
        extremesShortValue--;
        System.out.println("инкремент " + extremesShortValue + " декремент " + extremesShortValue);
        byte extremesByteValue = 127;
        System.out.println("byte начальное значение " + extremesByteValue);
        extremesByteValue++;
        extremesByteValue--;
        System.out.println("Инкремент " + extremesByteValue + " декремент " + extremesByteValue);
        int extremesIntValue = 2147483647;
        System.out.println("int начальное значение " + extremesIntValue);
        extremesIntValue++;
        extremesIntValue--;
        System.out.println("Инкремент " + extremesIntValue + " декремент " + extremesIntValue);
        long extremesLongValue = 9223372036854775807L;
        System.out.println("long начальное значение " + extremesLongValue);
        extremesLongValue++;
        extremesLongValue--;
        System.out.println("Инкремент " + extremesLongValue + " декремент " + extremesLongValue);
        char extremesCharValue = 65535;
        System.out.println("char начальное значение " + (int) extremesCharValue);
        extremesCharValue++;
        extremesCharValue--;
        System.out.println("инкремент " + (int) extremesCharValue + " декремент " + (int) extremesCharValue);

        System.out.println("\n5. Перестановка значений переменных ");
        int numberA = 2;
        int numberB = 5;
        System.out.println("Замена с помощью 3й переменной ");
        System.out.println("Начальное значение переменных:  а = " + numberA + " б = " + numberB);
        int buf = numberA;
        numberA = numberB;
        numberB = buf;
        System.out.println("Значения после замены: а = " + numberA + " б = " + numberB);
        System.out.println("Замена с помощью арифметических операций  ");
        numberA += numberB;
        numberB = numberA - numberB;
        numberA -= numberB;
        System.out.println("Значения после замены: а = " + numberA + " б = " + numberB);
        numberA ^= numberB;
        numberB = numberA ^ numberB;
        numberA ^= numberB;
        System.out.println("Значения после замены: а = " + numberA + " б = " + numberB);

        System.out.println("\n6. Вывод символов и их кодов ");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char circumflex = '^';
        char tilda = '~';
        System.out.println("Код символа: " + (int) dollar + " символ " + dollar);
        System.out.println("Код символа: " + (int) asterisk + " символ " + asterisk);
        System.out.println("Код символа: " + (int) atSign + " символ " + atSign);
        System.out.println("Код символа: " + (int) circumflex + " символ " + circumflex);
        System.out.println("Код символа: " + (int) tilda + " символ " + tilda);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка ");
        char slash = '/';
        char lowerSlash = '_';
        char bracketLeft = '(';
        char bracketRight = ')';
        char backslash = '\\';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + lowerSlash + bracketLeft + " " + bracketRight + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.print("" + slash + lowerSlash + lowerSlash + lowerSlash + lowerSlash + slash +
                backslash + lowerSlash + lowerSlash + backslash);

        System.out.println("\n\n8. Манипуляции с сотнями, десятками и единицами числа");
        int initialNumber = 123;
        int hundredCount = initialNumber / 100;
        int tenCount = initialNumber % 100 / 10;
        int onesCount = initialNumber % 10;
        System.out.println("Число " + initialNumber + " содержит:");
        System.out.println("сотен - " + hundredCount);
        System.out.println("десятков - " + tenCount);
        System.out.println("единиц - " + onesCount);
        int sum = hundredCount + tenCount + onesCount;
        System.out.println("Сума разрядов = " + sum);
        int multiplication = hundredCount * tenCount * onesCount;
        System.out.println("Произведение разрядов = " + multiplication);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int numberSeconds = 86399;
        int hours = numberSeconds / 3600;
        int minutes = numberSeconds % 3600 / 60;
        int seconds = numberSeconds % 60;
        System.out.println(hours + " : " + minutes + " : " + seconds);

        System.out.println("\n10. *Расчет стоимости товара со скидкой");
        var penBd = new BigDecimal("105.5");
        var bookBd = new BigDecimal("235.83");
        var discountUpgrade = new BigDecimal("0.11");
        var discountPenUpgrade = penBd.multiply(discountUpgrade);
        var discountBookUpgrade = bookBd.multiply(discountUpgrade);
        var pricePenUpgrade = penBd.subtract(discountPenUpgrade).setScale(2, RoundingMode.HALF_UP);
        var priceBookUpgrade = bookBd.subtract(discountBookUpgrade).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость ручки без скидки составляет: " + penBd);
        System.out.println("Стоимость книги без скидки составляет: " + bookBd);
        System.out.println("Сумма скидки на ручку составит: " + discountPenUpgrade);
        System.out.println("Сумма скидки на книгу составит: " + discountBookUpgrade);
        System.out.println("Стоимость ручки со скидкой составит: " + pricePenUpgrade);
        System.out.println("Стоимость книги со скидкой составит: " + priceBookUpgrade);
    }
}

