package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.gender = "самец";
        wolf.name = "Север";
        wolf.weight = 40;
        wolf.age = 3;
        wolf.color = "серый";

        System.out.println("Пол волка: " + wolf.gender);
        System.out.println("Кличка волка: " + wolf.name);
        System.out.println("Вес волка: " + wolf.weight);
        System.out.println("Возраст волка: " + wolf.age);
        System.out.println("Окрас волка: " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
