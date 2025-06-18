package com.startjava.lesson_1.final_;

import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int checkedNumber1 = random.nextInt(100);
        int result = 1;
        do {
            int buf = 50;
            while (buf > checkedNumber1) {
                System.out.println(buf + " больше того, что загадал компьютер");
                result = buf;
                buf--;
            }
            while (buf < checkedNumber1) {
                System.out.println(buf + " меньше того, что загадал компьютер");
                result = buf;
                buf++;
            }
            if (buf == checkedNumber1) {
                System.out.println("Вы победили!");
            }
            System.out.println("Вы победили!");
        } while (result == checkedNumber1);
    }
}
