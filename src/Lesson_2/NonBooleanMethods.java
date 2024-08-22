package Lesson_2;

public class NonBooleanMethods {
    private String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public void findLongestWord() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "найти самое длинное слово в предложении из книги по Java");
    }

    public void chooseItem() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageRating() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    public void printErrorMessage() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "вывести сообщение об ошибке");
    }

    public void synchronizeData() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "синхронизировать данные с облачным хранилищем");
    }

    public void recoverData() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseDownload() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "приостановить загрузку mp3-файла группы \"Ария\"");
    }

    public void reset() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "сбросить настройки до заводских для пылесоса Mi");
    }

    public void write() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "записать содержимое в файл по указанному пути на флешку");
    }

    public void convert() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void enterMathExpression() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "ввести математическое выражение с тремя аргументами");
    }

    public void determineWinner() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "выявить победителя среди гонщиков игры \"Need For Speed\"");
    }

    public void findBook() {
        System.out.println(getCurrentMethodName() + "() -> " +
                "найти книгу по имени писателя");
    }
}
