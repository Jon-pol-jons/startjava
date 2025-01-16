public class Lesson1 {
    public static void main(String[] args) {
        float pricePen = 105.5F;
        float priceBook = 235.83F;
        System.out.println("стоимость ручки без скидки " + pricePen + " стоимость книги без скидки " + priceBook);
        float discount = 0.0F;
        float discountPen = pricePen / 100.0F * 11.0F;
        System.out.println("сумма скидки на ручку составляет " + discountPen);
        float discountBook = priceBook / 100.0F * 11.0F;
        System.out.println("Сумма скидки на книмгу " + discountBook);
        System.out.println(" стоимость ручки со скидкой составит " + (pricePen - discountPen));
        System.out.println("Стоимость книги со скидкой составит " + (priceBook - discountBook));
    }
}


