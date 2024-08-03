package Lesson_1;

public class GameGuessNum {
    public static void main(String[] args) throws InterruptedException {
        int secretNum = (int) (Math.random() * 100 + 1);
        int bottomLimit = 1;
        int upperLimit = 101;
        int gamerNum = 50;
        while (gamerNum != secretNum) {
            String resultLine;
            if (gamerNum < secretNum) {
                bottomLimit = gamerNum;
                resultLine = "меньше";
            } else {
                upperLimit = gamerNum;
                resultLine = "больше";
            }
            System.out.printf("%s %s того, что загадал компьютер\n", gamerNum, resultLine);
            gamerNum = (bottomLimit + upperLimit) / 2;
            Thread.sleep(200);
        }
        System.out.println("Вы победили!");
    }
}
