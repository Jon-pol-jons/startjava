package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public GuessNumber(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    String name2;
    String name1;

    private int gamer1;
    private int gamer2;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int random1 = random.nextInt(0, 100);
    int random2 = random.nextInt(0, 100);

    public void playGam() {
        boolean guessedCorrectly = false;
        do {
            System.out.print(name1 + " Введите число от 0 до 100: ");
            gamer1 = scanner.nextInt();
            if (gamer1 > random1) {
                System.out.println(name1 + ", вы ввели больше того, что загадал компьютер");
            } else if (gamer1 < random1) {
                System.out.println(name1 + ", вы ввели меньше того, что загадал компьютер");
            } else {
                System.out.println(name1 + ", вы победили!!!");
                guessedCorrectly = true;
                break;
            }
            if (gamer2 < 100) {
                System.out.print(name2 + ", Введите число от 0 до 100: ");
                gamer2 = scanner.nextInt();
                if (gamer2 > random2) {
                    System.out.println(name2 + ", вы ввели больше того, что загадал компьютер");
                } else if (gamer2 < random2) {
                    System.out.println(name2 + ", вы ввели меньше того, что загадал компьютер");
                } else {
                    System.out.println(name2 + ", вы победили!!!");
                    guessedCorrectly = true;
                }
            }
        } while (!guessedCorrectly);
    }
}
