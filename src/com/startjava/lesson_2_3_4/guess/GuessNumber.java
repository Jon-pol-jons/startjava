package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player person1;
    private Player person2;

    public GuessNumber(Player person1, Player person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int targetNum = random.nextInt(0, 101);
        int turnPlayers;
        do {
            System.out.println("input number = " + targetNum);
            System.out.print(person1.getName() + " Введите число от 0 до 100: ");
            turnPlayers = scanner.nextInt();
            if (turnPlayers == targetNum) {
                System.out.println(person1.getName() + ", вы победили!!!");
                break;
            }
            if (turnPlayers > targetNum) {
                System.out.println(person1.getName() + ", вы ввели больше того, что загадал компьютер");
            } else if (turnPlayers < targetNum) {
                System.out.println(person1.getName() + ", вы ввели меньше того, что загадал компьютер");
            }

            System.out.print(person2.getName() + ", Введите число от 0 до 100: ");
            turnPlayers = scanner.nextInt();
            if (turnPlayers == targetNum) {
                System.out.println(person2.getName() + ", вы победили!!!");
            } else if (turnPlayers > targetNum) {
                System.out.println(person2.getName() + ", вы ввели больше того, что загадал компьютер");
            } else if (turnPlayers < targetNum) {
                System.out.println(person2.getName() + ", вы ввели меньше того, что загадал компьютер");
            }
        } while (turnPlayers != targetNum);
    }
}
