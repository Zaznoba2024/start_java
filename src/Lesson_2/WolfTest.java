package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("самец");
        wolf.setName("Волчок");
        wolf.setWeight(40);
        wolf.setAge(3);
        wolf.setColor("cветло-серый");

        System.out.println("Пол волка: " + wolf.getGender());
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Окрас волка: " + wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
