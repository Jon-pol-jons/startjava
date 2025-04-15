public class DogTest {
    public static void main(String[] args) {
        Dog archie = new Dog();
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
    }
}
