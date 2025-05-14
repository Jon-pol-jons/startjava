package Lesson2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            userAnswer = "yes";
            try {
                System.out.println("Введите имя первого игрока");
                String name1 = scanner.next();
                System.out.println("Введите имя второго игрока");
                String name2 = scanner.next();
                Player person1 = new Player(name1);
                Player person2 = new Player(name2);
                GuessNumber guessNumber = new GuessNumber(name1, name2);

                guessNumber.playGam();

                do {
                    System.out.println("игра завершилась");
                    System.out.print("Хотите продолжить игрнать? [yes/no]: ");
                    userAnswer = scanner.next();
                } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
            } finally {
            }
        }
    }
}
