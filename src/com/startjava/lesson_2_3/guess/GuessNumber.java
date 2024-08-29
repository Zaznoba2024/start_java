package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateSecretNumber();
        Player currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);
        do {
            enterNumber(currentPlayer, scanner);
            if (isGuessed(currentPlayer)) {
                break;
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (true);
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100 + 1);
    }

    private void enterNumber(Player player, Scanner scanner) {
        System.out.printf("Игрок %s введите число: ", player.getName());
        player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.printf("Выиграл игрок %s.\n", player.getName());
            return true;
        }
        String moreOrLess = player.getNumber() < secretNumber ? "меньше" : "больше";
        System.out.printf("%s %s того, что загадал компьютер\n", player.getNumber(), moreOrLess);
        return false;
    }
}
