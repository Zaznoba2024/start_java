package com.startjava.lesson_1.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадания на тему “Ветвление: if-else”");

        System.out.println("\n1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        if (!isMale) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }
        int age = 26;
        if (age > 18) {
            System.out.println("Уже можешь голосовать");
        } else {
            System.out.println("Нужно еще немного подрасти");
        }
        double height = 1.82f;
        if (height < 1.8) {
            System.out.println("Неси стул, будем красить потолок");
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
        int a = 16;
        int b = 21;
        if (a == b) {
            System.out.printf("Числа %s и %s равны.%n", a, b);
        } else if (a > b) {
            System.out.printf("Число %s больше числа %s.%n", a, b);
        } else {
            System.out.printf("Число %s больше числа %s.%n", b, a);
        }

        System.out.println("\n3. Проверка числа.");
        int number = -41;
        if (number == 0) {
            System.out.println("Число является нулем.");
        } else {
            System.out.print(number + " является ");
            if (number > 0) {
                System.out.print("положительным ");
            } else {
                System.out.print("отрицательным ");
            }
            if (number % 2 == 0) {
                System.out.print("и четным.\n");
            } else {
                System.out.print("и нечетным.\n");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        int num1 = 123;
        int num2 = 223;
        int num1Hundreds = num1 / 100;
        int num1Tens = num1 / 10 % 10;
        int num1Ones = num1 % 10;
        int num2Hundreds = num2 / 100;
        int num2Tens = num2 / 10 % 10;
        int num2Ones = num2 % 10;
        if ((num1Hundreds != num2Hundreds) && (num1Tens != num2Tens) && (num1Ones != num2Ones)) {
            System.out.printf("В числах %s и %s нет равных цифр в одинаковых разрядах.%n",
                    num1, num2);
        } else {
            System.out.printf("Исходные числа: %s и %s.%n", num1, num2);
            if (num1Hundreds == num2Hundreds) {
                System.out.printf("Одинаковые цифры %s стоят в разряде номер 3.%n", num1Hundreds);
            }
            if (num1Tens == num2Tens) {
                System.out.printf("Одинаковые цифры %s стоят в разряде номер 2.%n", num1Tens);
            }
            if (num1Ones == num2Ones) {
                System.out.printf("Одинаковые цифры %s стоят в разряде номер 1.%n", num1Ones);
            }
        }

        System.out.println("\n5. Определение символа по его коду.");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.printf("'%s'  - большая буква%n", symbol);
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.printf("'%s' - маленькая буква%n", symbol);
        } else if (symbol >= '0' && symbol <= '0') {
            System.out.printf("'%s' - цифра%n", symbol);
        } else {
            System.out.printf("'%s' - ни буква и ни цифра%n", symbol);
        }

        System.out.println("\n6. Подсчет начисленных банком %.");
        double deposit = 321123.59;
        double interestAmount = 0.1;
        if (deposit < 100000) {
            interestAmount = 0.05;
        } else if (deposit < 300000) {
            interestAmount = 0.07;
        }
        System.out.printf("Сумма вклада = %.2f%n", deposit);
        System.out.printf("Сумма начисленного процента = %.2f%n", deposit * interestAmount);
        System.out.printf("Итоговая сумма с процентами = %.2f%n", deposit * (1 + interestAmount));

        System.out.println("\n7. Определение оценки по предметам.");
        float historyRating = 0.59f;
        float historyGrade = 2;
        if (historyRating > 0.91) {
            historyGrade = 5;
        } else if (historyRating > 0.73) {
            historyGrade = 4;
        } else if (historyRating > 0.6) {
            historyGrade = 3;
        }
        float csRating = 0.92f;
        float csGrade = 2;
        if (csRating > 0.91) {
            csGrade = 5;
        } else if (csRating > 0.73) {
            csGrade = 4;
        } else if (csRating > 0.6) {
            csGrade = 3;
        }
        System.out.printf("Предмет история, оценка %.0f%n", historyGrade);
        System.out.printf("Предмет программирование, оценка %.0f%n", csGrade);
        System.out.printf("Средний балл оценок по предметам %s%n",
                (historyGrade + csGrade) / 2);
        System.out.printf("Средний процент по предметам %s%n",
                (historyRating + csRating) / 2 * 100);

        System.out.println("\n8. Расчет годовой прибыли.");
        double revenueMonth = 13025.233;
        double rentMonth = 5123.018;
        double costMonth = 9001.729;
        double profitYear = (revenueMonth - rentMonth - costMonth) * 12;
        if (profitYear > 0) {
            System.out.printf("Прибыль за год: +%.2f руб.%n", profitYear);
        } else {
            System.out.printf("Прибыль за год: %.2f руб.%n", profitYear);
        }

        System.out.println("\n9. Подсчет начисленных банком %.");
        BigDecimal depositBigDecimal = new BigDecimal("321123.59");
        BigDecimal interestAmountBigDecimal = new BigDecimal("0.1");
        BigDecimal grade1 = BigDecimal.valueOf(100000);
        BigDecimal grade2 = BigDecimal.valueOf(300000);
        if (depositBigDecimal.compareTo(grade1) < 0) {
            interestAmountBigDecimal = new BigDecimal("0.05");
        } else if (depositBigDecimal.compareTo(grade2) < 0) {
            interestAmountBigDecimal = new BigDecimal("0.07");
        }
        System.out.printf("Сумма вклада = %s%n", depositBigDecimal.toPlainString());
        System.out.printf("Сумма начисленного процента = %s%n",
                (depositBigDecimal.multiply(interestAmountBigDecimal))
                        .setScale(2, RoundingMode.HALF_UP)
                        .toPlainString());
        System.out.printf("Итоговая сумма с процентами = %s%n",
                (depositBigDecimal.multiply(interestAmountBigDecimal.add(new BigDecimal("1"))))
                        .setScale(2, RoundingMode.HALF_UP)
                        .toPlainString());

        System.out.println("\n10*. Расчет годовой прибыли.");
        var revenueMonthBigDecimal = new BigDecimal("13025.233");
        var rentMonthBigDecimal = new BigDecimal("5123.018");
        var costMonthBigDecimal = new BigDecimal("9001.729");
        var profitYearBigDecimal = (revenueMonthBigDecimal
                        .subtract(rentMonthBigDecimal))
                        .subtract(costMonthBigDecimal)
                        .multiply(BigDecimal.valueOf(12))
                        .setScale(2, RoundingMode.HALF_UP);
        if (profitYearBigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +%s руб.%n", profitYearBigDecimal);
        } else {
            System.out.printf("Прибыль за год: %s руб.%n", profitYearBigDecimal);
        }
    }
}
