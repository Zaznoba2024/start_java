package Lesson_2;

public class BooleanMethods {
    private boolean isProgramContinue() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "программа выполняется далее или завершается? ");
        return true;
    }

    private boolean isFileDeleted() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "удалился ли файл на жестком диске или флешке? ");
        return false;
    }

    private boolean hasUniqueDigit() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "последовательность содержит уникальную цифру? ");
        return true;
    }

    private boolean isLetter() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "пользователь ввел букву или что-то другое? ");
        return false;
    }

    private boolean hasEqualDigits() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "в проверяемых числах, есть равные цифры? ");
        return false;
    }

    private boolean hasAttempts() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "в игре \"Марио\" остались попытки? ");
        return true;
    }

    private boolean isEmpty() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    private boolean isEvenNumber() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    private boolean isValidPath() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    private boolean isFileExist() {
        System.out.print(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "файл по указанному адресу существует? ");
        return true;
    }

    public void getAllBooleanMethods() {
        System.out.println(isProgramContinue());
        System.out.println(isFileDeleted());
        System.out.println(hasUniqueDigit());
        System.out.println(isLetter());
        System.out.println(hasEqualDigits());
        System.out.println(hasAttempts());
        System.out.println(isEmpty());
        System.out.println(isEvenNumber());
        System.out.println(isValidPath());
        System.out.println(isFileExist());
    }
}
