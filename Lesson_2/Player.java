import java.util.Scanner;

public class Player {
    static private String name1;
    static private String name2;

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    Scanner scanner = new Scanner(System.in);

    public String scannerName1() {
        System.out.print("Введите имя первого игрока: ");
        name1 = scanner.next();
        return name1;
    }

    public String scannerName2() {
        System.out.print("Введите имя второго игрока: ");
        name2 = scanner.next();
        return name2;
    }
}
