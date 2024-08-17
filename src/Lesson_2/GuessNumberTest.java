package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        System.out.printf("Привет, %s и %s. Компьютер загадал число. Отгадайте его!\n",
                player1.getName(), player2.getName());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
    }
}
