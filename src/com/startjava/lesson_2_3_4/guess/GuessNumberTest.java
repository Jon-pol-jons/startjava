package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            System.out.println("Введите имя первого игрока");
            String name1 = scanner.next();
            System.out.println("Введите имя второго игрока");
            String name2 = scanner.next();
            Player player1 = new Player(name1);
            Player player2 = new Player(name2);
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();
            do {
                System.out.println("игра завершилась");
                System.out.print("Хотите продолжить играть? [yes/no]: ");
                playerAnswer = scanner.next();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }
}

