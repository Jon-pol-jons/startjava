import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1 Вывод характеристик компьютера ");
        float cpuFrequency = 2.9f;
        double coreTechnology = 0.065d;
        byte cores = 2;
        short ssdMemory = 248;
        short numberVideoCards = 920;
        char seriesVideoCards = 'm';
        long vram = 4098;
        int ramMemory = 8000;
        boolean isMemorySsdMoreStated = (ssdMemory >= 18);
        if (isMemorySsdMoreStated) {
            System.out.println("Ноутбук марки Asus f6e.На борту процессор Intel core 2 Duo с \n" +
                    "тактовой чистотой " + cpuFrequency + " Гц и \n" +
                    "тех процессом " + coreTechnology + " нм" + "количество ядер " + cores + "\n" +
                    "Твердотельный накопитель марка и модель Apacher AST 280\n" +
                    "Объем памяти " + ssdMemory + " ГБ\n" +
                    "Видео карта Nvidia" + numberVideoCards + " " + seriesVideoCards + "\n" +
                    "с видео памятью " + vram + " ГБ\n" +
                    "Оперативная память марки Apacher\n" +
                    "Количество оперативной памяти " + ramMemory + " Мбайт");
        }

        System.out.print("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5F;
        float bookPrice = 235.83F;
        System.out.println("Цена ручки " + penPrice);
        System.out.println("Цена книги " + bookPrice);
        float discount = 11.0F;
        float discountPen = penPrice / 100.0F * discount;
        System.out.println("Cумма скидки на ручку составит " + discountPen);
        float discountBook = bookPrice / 100.0F * discount;
        System.out.println("Сумма скидки на книгу составит" + discountBook);
        System.out.println("Цена ручки со скидкой составит " + (penPrice - discountPen));
        System.out.println("Цена книги со скидкой составит " + (bookPrice - discountBook));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  V     V  a     ");
        System.out.println("    J   a a  V   V  a a    ");
        System.out.println(" J  J  aaaaa  V V  aaaaa   ");
        System.out.println("  JJ  a     a  V  a     a  ");

        System.out.println("\n4. Вывод min и max значений целых числовых типов ");
        short extremesShortValue = 32767;
        System.out.println("short начальное значение " + extremesShortValue);
        extremesShortValue++;
        System.out.println("инкремент " + extremesShortValue);
        extremesShortValue--;
        System.out.println("декремент " + extremesShortValue);
        byte extremesByteValue = 127;
        System.out.println("byte начальное значение " + extremesByteValue);
        extremesByteValue++;
        System.out.println("инкремент " + extremesByteValue);
        extremesByteValue--;
        System.out.println("декремент " + extremesByteValue);
        int extremesIntValue = 2147483647;
        System.out.println("int начальное значение " + extremesIntValue);
        extremesIntValue++;
        System.out.println("инкремент " + extremesIntValue);
        extremesIntValue--;
        System.out.println("декремент " + extremesIntValue);
        long extremesLongValue = 9223372036854775807L;
        System.out.println("long начальное значение " + extremesLongValue);
        extremesLongValue++;
        System.out.println("инкремент " + extremesLongValue);
        extremesLongValue--;
        System.out.println("декремент " + extremesLongValue);
        char extremesCharValue = 65535;
        System.out.println("char начальное значение " + (int) extremesCharValue);
        extremesCharValue++;
        System.out.println("инкремент " + (int) extremesCharValue);
        extremesCharValue--;
        System.out.println("декремент " + (int) extremesCharValue);

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
        numberB ^= numberA;
        numberA ^= numberB;
        System.out.println("Значения после замены: а = " + numberA + " б = " + numberB);

        System.out.println("\n6. Вывод символов и их кодов ");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char circumflex = '^';
        char tilde = '~';
        System.out.println("Код символа " + (int) dollar + " символ " + dollar);
        System.out.println("Код символа " + (int) asterisk + " символ " + asterisk);
        System.out.println("Код символа " + (int) atSign + " символ " + atSign);
        System.out.println("Код символа " + (int) circumflex + " символ " + circumflex);
        System.out.println("Код символа " + (int) tilde + " символ " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка ");
        char slash = '/';
        char underscore = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        char backslash = '\\';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftBracket + " " + rightBracket + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.print("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

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
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = totalSeconds % 3600 / 60;
        int ss = totalSeconds % 60;
        System.out.println(hh + " : " + mm + " : " + ss);

        System.out.println("\n10. *Расчет стоимости товара со скидкой");
        var pricePenBd = new BigDecimal("105.5");
        var priceBookBd = new BigDecimal("235.83");
        var discountBd = new BigDecimal("0.11");
        var discountPenBd = pricePenBd.multiply(discountBd);
        var discountBookBd = priceBookBd.multiply(discountBd);
        var priceDiscountedPenBd = pricePenBd.subtract(discountPenBd).setScale(2, RoundingMode.HALF_UP);
        var priceDiscountedBookBd = priceBookBd.subtract(discountBookBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость ручки " + pricePenBd);
        System.out.println("Стоимость книги " + priceBookBd);
        System.out.println("Сумма скидки на ручку составит: " + discountPenBd);
        System.out.println("Сумма скидки на книгу составит: " + discountBookBd);
        System.out.println("Стоимость ручки со скидкой составит: " + priceDiscountedPenBd);
        System.out.println("Стоимость книги со скидкой составит: " + priceDiscountedBookBd);
    }
}
