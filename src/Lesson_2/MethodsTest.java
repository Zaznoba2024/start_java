package Lesson_2;

public class MethodsTest {
    public static void main(String[] args) {
        System.out.println("Hе boolean-методы");
        NonBooleanMethods nbm = new NonBooleanMethods();
        getAllNonBooleanMethods(nbm);

        System.out.println("\nBoolean-методы");
        BooleanMethods bm = new BooleanMethods();
        getAllBooleanMethods(bm);
    }

    private static void getAllNonBooleanMethods(NonBooleanMethods nbm) {
        nbm.findLongestWord();
        nbm.chooseItem();
        nbm.calculateAverageRating();
        nbm.countUniqueWords();
        nbm.printErrorMessage();
        nbm.syncData();
        nbm.recoverData();
        nbm.pauseDownload();
        nbm.resetVacuum();
        nbm.writeFile();
        nbm.convertTemperature();
        nbm.enterMathExpression();
        nbm.determineWinner();
        nbm.findBookByAuthor();
    }

    private static void getAllBooleanMethods(BooleanMethods bm) {
        System.out.println(bm.isProgramContinue());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isEmpty());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isFileExist());
    }
}
