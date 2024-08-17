package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNumber = (int) (Math.random() * 100 + 1);
        boolean isPlayer1Move = true;
        String playerName = player1.getName();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!isPlayer1Move) {
                playerName = player2.getName();
            }
            System.out.printf("Игрок %s введите число: ", playerName);
            int playerNumber = scanner.nextInt();
            if (playerNumber == secretNumber) {
                System.out.printf("Выиграл игрок %s.\n", playerName);
                break;
            }
            String moreOrLess;
            if (playerNumber < secretNumber) {
                moreOrLess = "меньше";
            } else {
                moreOrLess = "больше";
            }
            System.out.printf("%s %s того, что загадал компьютер\n", playerNumber, moreOrLess);
            isPlayer1Move = !isPlayer1Move;
        }
    }
}
