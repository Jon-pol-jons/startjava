package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf archie = new Wolf();
        String gender = "Мужской";
        String name = "Арчик";
        int weight = 126;
        int age = 7;
        String color = "серый";

        System.out.println("Волк с именем " + name + ", пол  " + gender + ", возраст " + age +
                " лет, вес " + weight + "кг, цыет шерсти " + color);
        archie.go();
        archie.sit();
        archie.run();
        archie.howl();
        archie.hunting();
    }
}
