package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадания на тему “Циклы: for, while, do-while”.");

        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        int bottomLimit = -10;
        int upperLimit = 21;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        int counter = bottomLimit;
        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
            counter++;
        } while (counter <= upperLimit);
        System.out.printf("В отрезке [%s, %s] сумма четных чисел = %s, а нечетных = %s\n",
                bottomLimit, upperLimit, sumEvenNums, sumOddNums);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания.");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        int originNum = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (originNum > 0) {
            int remainder = originNum % 10;
            System.out.print(remainder);
            sum += remainder;
            originNum /= 10;
        }
        System.out.printf("\nСумма цифр: %s\n", sum);

        System.out.println("\n4. Вывод чисел в несколько строк.");
        bottomLimit = 1;
        if (bottomLimit % 2 == 0) bottomLimit++;
        upperLimit = 24;
        for (int i = bottomLimit; i < upperLimit;) {
            for (int j = 0; j < 5; j++) {
                if (i < upperLimit) {
                    System.out.printf("%4d", i);
                    i += 2;
                } else {
                    System.out.printf("%4d", 0);
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность.");
        originNum = 3242592;
        int originNumCopy = originNum;
        int countTwos = 0;
        while (originNumCopy > 0) {
            if (originNumCopy % 10 == 2) {
                countTwos++;
            }
            originNumCopy /= 10;
        }
        String even = "четное";
        if (countTwos % 2 != 0) {
            even = "нечетное";
        }
        System.out.printf("В %s %s (%s) количество двоек.\n", originNum, even, countTwos);

        System.out.println("\n6. Вывод геометрических фигур.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int symbols = 5;
        while (symbols > 0) {
            int countLines = 1;
            while (countLines <= symbols) {
                System.out.print("#");
                countLines++;
            }
            System.out.println();
            symbols--;
        }
        System.out.println();

        int maxLineLength = 3;
        int maxLineNum = 2 * maxLineLength - 1;
        int lineCounter = 1;
        int increment = 1;
        int currentLineLength = 1;
        do {
            int symbolsCounter = 0;
            do {
                System.out.print("$");
            } while (++symbolsCounter < currentLineLength);
            System.out.println();
            if (lineCounter == maxLineLength) increment = -1;
            currentLineLength += increment;
        } while (++lineCounter <= maxLineNum);

        System.out.println("\n7. Вывод ASCII-символов.");
        System.out.printf("%-11s%-11s%-11s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = '!'; i < '0'; i += 2) {
            System.out.printf("%5s%11s%11s%s\n", i, (char) i, " ", Character.getName(i));
        }
        int beginSymbol = 'a';
        if (beginSymbol % 2 != 0) beginSymbol++;
        for (int i = beginSymbol; i <= 'z'; i += 2) {
            System.out.printf("%5s%11s%11s%s\n", i, (char) i, " ", Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом.");
        int palindrome = 1234321;
        int palindromeCopy = palindrome;
        int reversedNum = 0;
        while (palindrome > 0) {
            int digit = palindrome % 10;
            reversedNum = (reversedNum * 10) + digit;
            palindrome /= 10;
        }
        if (palindromeCopy == reversedNum) {
            System.out.printf("Число %s - палиндром.\n", palindromeCopy);
        } else {
            System.out.printf("Число %s - не палиндром.\n", palindromeCopy);
        }

        System.out.println("\n9. Проверка, является ли число счастливым.");
        int happyNum = 569497;
        int leftHalfNum = happyNum / 1000;
        int leftHalfNumsSum = 0;
        int rightHalfNum = happyNum % 1000;
        int rightHalfNumsSum = 0;
        for (int i = 0; i < 3; i++) {
            leftHalfNumsSum += leftHalfNum % 10;
            leftHalfNum /= 10;
            rightHalfNumsSum += rightHalfNum % 10;
            rightHalfNum /= 10;
        }
        String happyNumResult = "";
        if (leftHalfNumsSum != rightHalfNumsSum) {
            happyNumResult = "не";
        }
        System.out.printf("Число %s - %sсчастливое\nСумма цифр %s = %s\nСумма цифр %s = %s\n",
                happyNum, happyNumResult, happyNum / 1000, leftHalfNumsSum,
                happyNum % 1000, rightHalfNumsSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        System.out.printf("%4s", "|");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < 36; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.printf(" %s |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
