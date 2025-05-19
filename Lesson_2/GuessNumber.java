package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player person1;
    Player person2;
    
    public GuessNumber(Player person1, Player person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public void playGam() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int targetNum = random.nextInt(0, 100);
        int gamer1;
        int gamer2;
        do {
            System.out.print(person1.getName() + " Введите число от 0 до 100: ");
            gamer1 = scanner.nextInt();
            if (gamer1 == targetNum) {
                System.out.println(person1.getName() + ", вы победили!!!");
                break;
            } else if (gamer1 > targetNum) {
                System.out.println(person1.getName() + ", вы ввели больше того, что загадал компьютер");
            } else if (gamer1 < targetNum) {
                System.out.println(person1.getName() + ", вы ввели меньше того, что загадал компьютер");
            }

            System.out.print(person2.getName() + ", Введите число от 0 до 100: ");
            gamer2 = scanner.nextInt();
            if (gamer2 == targetNum) {
                System.out.println(person2.getName() + ", вы победили!!!");
                break;
            } else if (gamer2 > targetNum) {
                System.out.println(person2.getName() + ", вы ввели больше того, что загадал компьютер");
            } else if (gamer2 < targetNum) {
                System.out.println(person2.getName() + ", вы ввели меньше того, что загадал компьютер");
            }
        } while (gamer1 != targetNum || gamer2 != targetNum);
    }
}

