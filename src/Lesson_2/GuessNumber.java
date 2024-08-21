package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateSecretNumber();
        Player currentPlayer = player1;
        do {
            enterNumber(currentPlayer);
            if (isGuessed(currentPlayer)) {
                break;
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        } while (true);
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 10 + 1);
    }

    private void enterNumber(Player player) {
        System.out.printf("Игрок %s введите число: ", player.getName());
        player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.printf("Выиграл игрок %s.\n", player.getName());
            return true;
        }
        String moreOrLess = "больше";
        if (player.getNumber() < secretNumber) {
            moreOrLess = "меньше";
        }
        System.out.printf("%s %s того, что загадал компьютер\n", player.getNumber(), moreOrLess);
        return false;
    }
}
