package Lesson_2;

public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("Hе boolean-методы");
        NonBooleanMethods nbm = new NonBooleanMethods();
        nbm.getAllNonBooleanMethods();

        System.out.println("\nBoolean-методы");
        BooleanMethods bm = new BooleanMethods();
        bm.getAllBooleanMethods();
    }
}
