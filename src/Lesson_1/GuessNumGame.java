package Lesson_1;

public class GuessNumGame {
    public static void main(String[] args) throws InterruptedException {
        int secretNum = (int) (Math.random() * 100 + 1);
        int bottomLimit = 1;
        int upperLimit = 101;
        int playerNum = 50;
        while (playerNum != secretNum) {
            String moreOrLess;
            if (playerNum < secretNum) {
                bottomLimit = playerNum;
                moreOrLess = "меньше";
            } else {
                upperLimit = playerNum;
                moreOrLess = "больше";
            }
            System.out.printf("%s %s того, что загадал компьютер\n", playerNum, moreOrLess);
            playerNum = (bottomLimit + upperLimit) / 2;
            Thread.sleep(200);
        }
        System.out.println("Вы победили!");
    }
}
