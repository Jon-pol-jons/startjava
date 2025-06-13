package src.com.startjava.lesson_2_3.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGameFormatting {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        String name1 = inputName(console);
        String name2 = inputName(console);

        // Ход первого игрока
        int position = generatePosition(name1, r);
        String sign1 = determineSign(position);
        showSigns(sign1);

        // Ход второго игрока
        position = generatePosition(name2, r);
        String sign2 = determineSign(position);
        showSigns(sign2);

        determineWinner(name1, sign1, name2, sign2);
        console.close();
    }

    private static final String rock = "✊";
    private static final String scissors = "✌️";
    private static final String paper = "✋";

    private static String inputName(Scanner console) {
        System.out.print("Введите имя игрока: ");
        return console.nextLine();
    }

    private static int generatePosition(String name1, Random r) {
        System.out.println("Ход " + name1 + ": ");
        return r.nextInt(1, 100);
    }

    private static String determineSign(int position) {
        String sign = rock;
        if (position > 66) {
            sign = rock;
        } else if (position > 33) {
            sign = rock;
        }
        return sign;
    }

    private static void showSigns(String sign) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign);
    }

    private static void determineWinner(String name1, String sign1, String name2, String sign2) {
        if (sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }

        boolean isEqualName1 = sign1.equals(rock) && sign2.equals(scissors) ||
                sign1.equals(scissors) && sign2.equals(paper) ||
                sign1.equals(paper) && sign2.equals(rock);

        if (isEqualName1) {
            System.out.println("\nПобедил - " + name1);
        } else {
            System.out.println("\nПобедил - " + name2);
        }
    }
}
