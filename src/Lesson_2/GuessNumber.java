package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;
    boolean isGameOver;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumberGeneration();
        isGameOver = false;
        boolean isPlayer1Move = true;
        while (!isGameOver) {
            Player player = player1;
            if (!isPlayer1Move) {
                player = player2;
            }
            enterNumber(player);
            checkNumber(player);
            isPlayer1Move = !isPlayer1Move;
        }
    }

    public void secretNumberGeneration() {
        secretNumber = (int) (Math.random() * 10 + 1);
    }

    public void enterNumber(Player player) {
        System.out.printf("Игрок %s введите число: ", player.getName());
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt());
    }

    public void checkNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.printf("Выиграл игрок %s.\n", player.getName());
            isGameOver = true;
        } else {
            String moreOrLess = "больше";
            if (player.getNumber() < secretNumber) {
                moreOrLess = "меньше";
            }
            System.out.printf("%s %s того, что загадал компьютер\n", player.getNumber(), moreOrLess);
        }
    }
}
