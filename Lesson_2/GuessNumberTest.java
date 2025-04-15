import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player = new Player();
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);

        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            userAnswer = "yes";
            try {
                player.scannerName1();
                player.scannerName2();
                guessNumber.playGam();
                do {
                    System.out.println("игра завершилась");
                    System.out.print("Хотите продолжить игрнать? [yes/no]: ");
                    userAnswer = scanner.next();
                } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException | StringIndexOutOfBoundsException e) {
                System.out.println("Неправильный формат");
            }
        }
    }
}
