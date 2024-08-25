package Lesson_2;

public class CallCurrentMethod {
    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
