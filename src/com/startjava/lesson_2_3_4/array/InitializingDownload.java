package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class InitializingDownload {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] ergs) throws InterruptedException {
        spinningSpinner();
    }

    public static char[] storingArray() {
        char[] array = {'-', '\\', '|', '/'};
        return array;
    }

    private static int randomNumber() {
        Random r = new Random();
        int randomNumber = r.nextInt(1, 100);
        return randomNumber;
    }

    public static void spinningSpinner() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hacking: " + storingArray()[0] + "\r");
            Thread.sleep(200);
            System.out.print("Hacking: " + storingArray()[1] + "\r");
            Thread.sleep(200);
            System.out.print("Hacking: " + storingArray()[2] + "\r");
            Thread.sleep(200);
            System.out.print("Hacking: " + storingArray()[3] + "\r");
            Thread.sleep(200);
        }
        if (randomNumber() > 70) {
            System.out.print("Hacking: " + ANSI_RED + "Access Granted!");
        } else {
            System.out.print("Hacking: " + ANSI_GREEN + "Access Denied!");
        }
    }
}
