package Lesson_2;

public class StaticMethodTest {
    private static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static void staticMethod() {
        System.out.println(getCurrentMethodName() + "() -> статический метод");
    }
}
