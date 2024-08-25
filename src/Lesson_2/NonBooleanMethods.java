package Lesson_2;

public class NonBooleanMethods {
    private void findLongestWord() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "найти самое длинное слово в предложении из книги по Java");
    }

    private void chooseItem() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "выбрать пункт меню в текстовом редакторе на macOS");
    }

    private void calculateAverageRating() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "вычислить среднее значение оценок в школе №1234");
    }

    private void countUniqueWords() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    private void printErrorMessage() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "вывести сообщение об ошибке");
    }

    private void syncData() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "синхронизировать данные с облачным хранилищем");
    }

    private void recoverData() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "восстановить данные из резервной копии от 11.03.2024");
    }

    private void pauseDownload() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "приостановить загрузку mp3-файла группы \"Ария\"");
    }

    private void resetVacuum() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "сбросить настройки до заводских для пылесоса Mi");
    }

    private void writeFile() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "записать содержимое в файл по указанному пути на флешку");
    }

    private void convertTemperature() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "преобразовать температуру из Цельсия в Фаренгейт");
    }

    private void enterMathExpression() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "ввести математическое выражение с тремя аргументами");
    }

    private void determineWinner() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "выявить победителя среди гонщиков игры \"Need For Speed\"");
    }

    private void findBookByAuthor() {
        System.out.println(CallCurrentMethod.getCurrentMethodName() + "() -> " +
                "найти книгу по имени писателя");
    }

    public void getAllNonBooleanMethods() {
        findLongestWord();
        chooseItem();
        calculateAverageRating();
        countUniqueWords();
        printErrorMessage();
        syncData();
        recoverData();
        pauseDownload();
        resetVacuum();
        writeFile();
        convertTemperature();
        enterMathExpression();
        determineWinner();
        findBookByAuthor();
    }
}
