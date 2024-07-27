package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадания на тему “Циклы: for, while, do-while”.");

        System.out.println("\n1. Подсчет суммы четных и нечетных чисел.");
        int bottomLimit = -10;
        int upperLimit = 21;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int num = bottomLimit;
        do {
            if (num % 2 == 0) {
                sumEvenNum += num;
            } else {
                sumOddNum += num;
            }
            num++;
        } while (num <= upperLimit);
        System.out.printf("В отрезке [%s, %s] сумма четных чисел = %s, а нечетных = %s\n",
                bottomLimit, upperLimit, sumEvenNum, sumOddNum);

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
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр.");
        int number = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (number > 0) {
            System.out.print(number % 10);
            sum += number % 10;
            number /= 10;
        }
        System.out.printf("\nСумма цифр: %s\n", sum);

        System.out.println("\n4. Вывод чисел в несколько строк.");
        int bottomLim = 1;
        if (bottomLim % 2 == 0) bottomLim++;
        int upperLim = 24;
        for (int i = bottomLim; i < upperLim;) {
            for (int j = 0; j < 5; j++) {
                if (i < upperLim) {
                    System.out.printf("%4d", i);
                    i += 2;
                } else {
                    System.out.printf("%4d", 0);
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность.");
        int originNum = 3242592;
        int resultNum = originNum;
        int count = 0;
        while (resultNum / 10 > 0) {
            if (resultNum % 10 == 2) {
                count++;
            }
            resultNum /= 10;
        }
        String even = "четное";
        if (count % 2 != 0) {
            even = "нечетное";
        }
        System.out.printf("В %s %s (%s) количество двоек.\n", originNum, even, count);

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
            int j = 1;
            while (j <= symbols) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            symbols--;
        }
        System.out.println();

        int m = 1;
        int n = 3;
        int k = m;
        do {
            for (int i = 0; i < k; i++) {
                System.out.printf("$");
            }
            System.out.printf("\n");
            k++;
        } while (k <= n);
        k--;
        do {
            k--;
            for (int i = 0; i < k; i++) {
                System.out.printf("$");
            }
            System.out.printf("\n");
        } while (k >= m);

        System.out.println("\n7. Вывод ASCII-символов.");
        System.out.printf("%-11s%-11s%-11s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        char digitSymbol = '0';
        int digit = (int) digitSymbol;
        for (int i = 33; i < digit; i = i + 2) {
            System.out.printf("%5s%11s%11s%s\n", i, (char) i, " ", Character.getName(i));
        }
        char smallSymbolA = 'a';
        char smallSymbolZ = 'z';
        int smallA = (int) smallSymbolA;
        int smallZ = (int) smallSymbolZ;
        if (smallA % 2 != 0) smallA++;
        for (int i = smallA; i <= smallZ; i = i + 2) {
            System.out.printf("%5s%11s%11s%s\n", i, (char) i, " ", Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом.");
        int palindrome = 1234321;
        int originNumber = palindrome;
        int reversedNumber = 0;
        int temp;
        while (palindrome != 0) {
            temp = palindrome % 10;
            reversedNumber = (reversedNumber * 10) + temp;
            palindrome /= 10;
        }
        if (originNumber == reversedNumber) {
            System.out.printf("Число %s - палиндром.\n", originNumber);
        } else {
            System.out.printf("Число %s - не палиндром.\n", originNumber);
        }

        System.out.println("\n9. Проверка, является ли число счастливым.");
        int happyNum = 568397;
        int part1 = happyNum / 1000;
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += part1 % 10;
            part1 /= 10;
        }
        int part2 = happyNum % 1000;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum2 += part2 % 10;
            part2 /= 10;
        }
        if (sum1 == sum2) {
            System.out.printf("Число %s - счастливое\nСумма цифр %s = %s\nСумма цифр %s = %s\n",
                    happyNum, happyNum / 1000, sum1, happyNum % 1000, sum2);
        } else {
            System.out.printf("Число %s - несчастливое\nСумма цифр %s = %s\nСумма цифр %s = %s\n",
                    happyNum, happyNum / 1000, sum1, happyNum % 1000, sum2);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        System.out.printf("%4s", "|");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < 36; i++) {
            System.out.printf("-");
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
