package Lesson_2;

public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("Hе boolean-методы");
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        nonBooleanMethods.findLongestWord();
        nonBooleanMethods.chooseItem();
        nonBooleanMethods.calculateAverageRating();
        nonBooleanMethods.countUniqueWords();
        nonBooleanMethods.printErrorMessage();
        nonBooleanMethods.synchronizeData();
        nonBooleanMethods.recoverData();
        nonBooleanMethods.pauseDownload();
        nonBooleanMethods.reset();
        nonBooleanMethods.write();
        nonBooleanMethods.convert();
        nonBooleanMethods.enterMathExpression();
        nonBooleanMethods.determineWinner();
        nonBooleanMethods.findBook();

        System.out.println("\nBoolean-методы");
        BooleanMethods booleanMethods = new BooleanMethods();
        System.out.println(booleanMethods.isProgramContinue());
        System.out.println(booleanMethods.isFileDeleted());
        System.out.println(booleanMethods.hasUniqueDigit());
        System.out.println(booleanMethods.isLetter());
        System.out.println(booleanMethods.hasEqualDigits());
        System.out.println(booleanMethods.hasAttempts());
        System.out.println(booleanMethods.isEmpty());
        System.out.println(booleanMethods.isEvenNumber());
        System.out.println(booleanMethods.isValidPath());
        System.out.println(booleanMethods.isFileExist());

        System.out.println("\nСтатический метод");
        StaticMethodTest.staticMethod();
    }
}
