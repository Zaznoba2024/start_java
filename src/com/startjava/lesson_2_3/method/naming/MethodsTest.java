package com.startjava.lesson_2_3.method.naming;

public class MethodsTest {
    public static void main(String[] args) {
        getAllNonBooleanMethods();
        getAllBooleanMethods();
    }

    private static void getAllNonBooleanMethods() {
        System.out.println("Hе boolean-методы");
        NonBooleanMethods nbm = new NonBooleanMethods();
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

    private static void getAllBooleanMethods() {
        System.out.println("\nBoolean-методы");
        BooleanMethods bm = new BooleanMethods();
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
