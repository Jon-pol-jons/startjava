package Lesson1;

import java.util.Scanner;

/*
объявите и проинициализируйте переменные всех существующих в Java примитивных типов данных
в качестве значений используйте характеристики компьютера: количество ядер, частота процессора и т. д.
выведите в консоль:
описание характеристик
значения переменных

* */
public class lesson1_1 {
    public static void main(String[] args){
        String stamp = "Asus f6e";
        String nameProcessor = "Intel core 2 Duo";
        float processorFrequency = 2.9f;
        double coreTechnology = 0.065d;// тех процесс
        byte cores = 2; //  количество ядер процессора
        String nameSSD = "Apaser AST 280";
        short memorySSD = 248;
        String nameVideoCards = "Nvidia";
        short nambeVideoCards = 920;
        char seriaVideoCards = 'm';
        long memoryVideoCards = 4098;
        String nameRAM =  "Apaser ";
        int RAM = 8000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите свой возраст ");
        int age = scanner.nextInt();
        boolean is = (age>=18);
        if (is) {
            System.out.println("Ноутбук марки " + stamp);
            System.out.println("На дорту процессор" + nameProcessor);
            System.out.println("тактовая чистота "+ processorFrequency);
            System.out.println("тех процес "+ coreTechnology + " нано метров");
            System.out.println("количество ядер " + cores);
            System.out.println("Твердотельный накопитель марка и модель " + nameSSD);
            System.out.println("Объем памяти " + memorySSD + " гигабайт");
            System.out.println("Видео карта " + nameVideoCards + " " + nambeVideoCards +seriaVideoCards);
            System.out.println("с видео памятью " + nameVideoCards + " гигабайт");
            System.out.println("Оперативная память марки " + nameRAM  );
            System.out.println("Количество оперативной памяти " + RAM+ " мегабайт");
        }
        else {
            System.out.println("Просмотр информации доступен с 18 лет");
        }
    }
}
