import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player = new Player();
    private int gamer1;
    private int gamer2;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int random1 = random.nextInt(0,100);
    int random2 = random.nextInt(0,100);

    public void playGam(){
        boolean guessedCorrectly = false;
        do {
            System.out.print(player.getName1() + ", Введите число от 0 до 100: ");
            gamer1 = scanner.nextInt();
            if (gamer1 < 100) {
                if (gamer1 > random1) {
                    System.out.println(player.getName1() + ", вы ввели болшьше того, что загадал компьютер");
                } else if (gamer1 < random1) {
                    System.out.println(player.getName1() + ", вы ввели меньше того, что загадал компьютер");
                } else {
                    System.out.println(player.getName1() + ", вы победили!!!");
                    guessedCorrectly = true;
                    break;
                }
            } else {
                System.out.println(player.getName1() + " ,вы вышли за границу интервала");
            }
                if (gamer2 < 100 ) {
            System.out.print(player.getName2() + ", Введите число от 0 до 100: ");
            gamer2 = scanner.nextInt();
            if (gamer2 > random2){
                System.out.println(player.getName2() + ", вы ввели болшьше того, что загадал компьютер");
            } else if (gamer2 < random2){
                System.out.println(player.getName2() + ", вы ввели меньше того, что загадал компьютер");
            } else{
                System.out.println(player.getName2() + ", вы победили!!!");
                guessedCorrectly = true;
            }
        } else {
            System.out.println(player.getName2() + ", вы вышли за границу интервала");
        }
        } while (!guessedCorrectly);
    }
}
