public class Dog {
    private String gender;
    private String name;
    private int weight;
    private int age;
    private String color;


    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age > 8){
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunting() {
        System.out.println("Охотится");
    }
}
