package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf archie = new Wolf();
        archie.setGender("Мужской");
        archie.setName("Арчик");
        archie.setWeight(126);
        archie.setAge(8);
        archie.setColor("Серый");
        System.out.println(archie.getGender());
        System.out.println(archie.getName());
        System.out.println(archie.getWeight());
        System.out.println(archie.getAge());
        System.out.println(archie.getColor());
        archie.go();
        archie.sit();
        archie.run();
        archie.howl();
        archie.hunt();
    }
}
