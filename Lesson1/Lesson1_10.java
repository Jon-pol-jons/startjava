package Lesson1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
реализуйте код из задания 2 с помощью BigDecimal
округлите результат вычислений до двух знаков после запятой
 */
public class Lesson1_10 {
    public static void main(String[] args){
        var pen = new BigDecimal("105.5");
        System.out.println("Стоимость ручки без скидки составляет: " + pen);
        var book = new BigDecimal("235.83");
        var discount = new BigDecimal("0.11");
        System.out.println("Стооимость книги без скидки сотавляет: " + book);
        var discountPen = pen.multiply(discount);
        System.out.println("Сумма скидки на ручку составит: " + discountPen);
        var discountBook = book.multiply(discount);
        System.out.println("Сумма скидки на книгу составит: " + discountBook);
        var pricePen = pen.subtract(discountPen).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость ручки со скидкой составит: "+ pricePen);
        var priceBook = book.subtract(discountBook).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость книги со скидкой составит: " + priceBook);
    }
}
