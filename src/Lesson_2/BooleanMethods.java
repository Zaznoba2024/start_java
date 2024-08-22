package Lesson_2;

public class BooleanMethods {
    private String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public boolean isProgramContinue() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "программа выполняется далее или завершается? ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "удалился ли файл на жестком диске или флешке? ");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(getCurrentMethodName() + "() -> " +
                " проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttempts() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmpty() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isValidPath() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isFileExist() {
        System.out.print(getCurrentMethodName() + "() -> " +
                "файл по указанному адресу существует? ");
        return true;
    }
}
