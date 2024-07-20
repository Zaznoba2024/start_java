package start.task0103;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадания на тему “Ветвление: if-else”");

        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        int age = 26;
        double height = 1.82f;
        if (!isMale) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }
        if (age > 18) {
            System.out.println("Уже можешь голосовать");
        } else {
            System.out.println("Нужно еще немного подрасти");
        }
        if (height < 1.8) {
            System.out.println("Неси стул, будем крастить потолок");
        } else {
            System.out.println("Возьми с верхней полки пирожок");
        }
        char firstCharName = "Софья".charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Имя начинается на М");
        } else if (firstCharName == 'I') {
            System.out.println("Имя начинается с I");
        } else {
            System.out.println("Это точно не Мария и не Ираклий");
        }

        System.out.println("\n2. Поиск большего числа");
        int num1 = 16;
        int num2 = 21;
        if (num1 == num2) {
            System.out.println("Числа num1 и num2 равны.");
        } else if (num1 > num2) {
            System.out.println("Число num1 больше числа num2.");
        } else {
            System.out.println("Число num2 больше числа num1.");
        }

        System.out.println("\n3. Проверка числа.");
        int myNumber = -41;
        if (myNumber == 0) {
            System.out.println(myNumber + " является нулем.");
        } else {
            if (myNumber % 2 == 0) {
                if (myNumber < 0) {
                    System.out.println(myNumber + " является отрицательным и четным.");
                } else {
                    System.out.println(myNumber + " является положительным и четным.");
                }
            } else {
                if (myNumber < 0) {
                    System.out.println(myNumber + " является отрицательным и нечетным.");
                } else {
                    System.out.println(myNumber + " является положительным и нечетным.");
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        int a = 123;
        int b = 223;
        if (!(a / 100 == b / 100) && !(a / 10 % 10 == b / 10 % 10) && !(a % 10 == b % 10)) {
            System.out.printf("В числах %s и %s нет равных цифр в одинаковых разрядах.%n", a, b);
        } else {
            System.out.printf("Исходные числа: %s и %s%n", a, b);
            if (a / 100 == b / 100) {
                System.out.printf("Одинаковые цифры %s стоят в разряде номер 3%n", a / 100);
            }
            if (a / 10 % 10 == b / 10 % 10) {
                System.out.printf("Одинаковые цифры %s стоят в разряде номер 2%n", a / 10 % 10);
            }
            if (a % 10 == b % 10) {
                System.out.printf("Одинаковые цифры %s стоят в разряде номер 1%n", a % 10);
            }
        }

        System.out.println("\n5. Определение символа по его коду.");
        char symbol = '\u0031';
        final String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String smallLetters = "abcdefghigklmnopqrstuvwxyz";
        final String digits = "1234567890";
        if (capitalLetters.indexOf(symbol) >= 0) {
            System.out.printf("'%s'  - большая буква%n", symbol);
        } else if (smallLetters.indexOf(symbol) >= 0) {
            System.out.printf("'%s' - маленькая буква%n", symbol);
        } else if (digits.indexOf(symbol) >= 0) {
            System.out.printf("'%s' - цифра%n", symbol);
        } else {
            System.out.printf("'%s' - ни буква и ни цифра%n", symbol);
        }

        System.out.println("\n6. Подсчет начисленных банком %.");
        double deposit = 321123.59;
        double interestAmount;
        if (deposit < 100000) {
            interestAmount = 0.05;
        } else if (deposit < 300000) {
            interestAmount = 0.07;
        } else {
            interestAmount = 0.1;
        }
        System.out.printf("Сумма вклада = %.2f%n", deposit);
        System.out.printf("Сумма начисленного процента = %.2f%n", deposit * interestAmount);
        System.out.printf("Итоговая сумма с процентами = %.2f%n", deposit * (1 + interestAmount));

        System.out.println("\n7. Определение оценки по предметам.");
        float historyRating = 0.59f;
        float programSinceRating = 0.92f;
        float historyGrade;
        float programSinceGrade;
        if (historyRating > 0.91) {
            historyGrade = 5;
        } else if (historyRating > 0.73) {
            historyGrade = 4;
        } else if (historyRating > 0.6) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }
        if (programSinceRating > 0.91) {
            programSinceGrade = 5;
        } else if (programSinceRating > 0.73) {
            programSinceGrade = 4;
        } else if (programSinceRating > 0.6) {
            programSinceGrade = 3;
        } else {
            programSinceGrade = 2;
        }
        System.out.printf("Предмет история, оценка %.0f%n", historyGrade);
        System.out.printf("Предмет программирование, оценка %.0f%n", programSinceGrade);
        System.out.printf("Средний балл оценок по предметам %s%n", 
                (historyGrade + programSinceGrade) / 2);
        System.out.printf("Средний процент по предметам %s%n", 
                (historyRating + programSinceRating) / 2 * 100);

        System.out.println("\n8. Расчет годовой прибыли.");
        double revenueMonth = 13025.233;
        double rentMonth = 5123.018;
        double costMonth = 9001.729;
        double profitYear = (revenueMonth - rentMonth - costMonth) * 12;
        if (profitYear == 0) {
            System.out.printf("Прибыль за год: 0 руб.%n");
        } else if (profitYear > 0) {
            System.out.printf("Прибыль за год: +%.2f руб.%n", profitYear);
        } else {
            System.out.printf("Прибыль за год: %.2f руб.%n", profitYear);
        }

        System.out.println("\n9. Подсчет начисленных банком %.");
        BigDecimal depositBigDecimal = new BigDecimal("321123.59");
        BigDecimal interestAmountBigDecimal;
        BigDecimal grade1 = new BigDecimal("100000");
        BigDecimal grade2 = new BigDecimal("300000");
        if (depositBigDecimal.compareTo(grade1) < 0) {
            interestAmountBigDecimal = new BigDecimal("0.05");
        } else if (depositBigDecimal.compareTo(grade2) < 0) {
            interestAmountBigDecimal = new BigDecimal("0.07");
        } else {
            interestAmountBigDecimal = new BigDecimal("0.1");
        }
        System.out.printf("Сумма вклада = %s%n", depositBigDecimal.toPlainString());
        System.out.printf("Сумма начисленного процента = %s%n", 
                (depositBigDecimal
                .multiply(interestAmountBigDecimal))
                .setScale(2, RoundingMode.HALF_UP).toPlainString());
        System.out.printf("Итоговая сумма с процентами = %s%n",
                (depositBigDecimal
                .multiply(interestAmountBigDecimal
                .add(new BigDecimal("1"))))
                .setScale(2, RoundingMode.HALF_UP)
                .toPlainString());

        System.out.println("\n10*. Расчет годовой прибыли.");
        var revenueMonthBigDecimal = new BigDecimal("13025.233");
        var rentMonthBigDecimal = new BigDecimal("5123.018");
        var costMonthBigDecimal = new BigDecimal("9001.729");
        var profitYearBigDecimal = (revenueMonthBigDecimal
                .subtract(rentMonthBigDecimal))
                .subtract(costMonthBigDecimal)
                .multiply(new BigDecimal("12"))
                .setScale(2, RoundingMode.HALF_UP);
        if (profitYearBigDecimal.compareTo(new BigDecimal("0")) == 0) {
            System.out.printf("Прибыль за год: 0 руб.%n");
        } else if (profitYearBigDecimal.compareTo(new BigDecimal("0")) > 0) {
            System.out.printf("Прибыль за год: +%s руб.%n", profitYearBigDecimal);
        } else {
            System.out.printf("Прибыль за год: %s руб.%n", profitYearBigDecimal);
        }
    }
}
