package Lesson_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Введите математическую операцию (+, -, *, /, ^, %).");
        String operation = scanner.next();
        while (!"+".equals(operation) && !"-".equals(operation) &&
                !"*".equals(operation) && !"/".equals(operation) &&
                !"^".equals(operation) && !"%".equals(operation)) {
            System.out.println("Математическая операция некорректна. Введите +, -, *, /, ^ или %");
            operation = scanner.next();
        }
        int result = num1;
        if ("+".equals(operation)) {
            result += num2;
        } else if ("-".equals(operation)) {
            result -= num2;
        } else if ("*".equals(operation)) {
            result *= num2;
        } else if ("/".equals(operation)) {
            result /= num2;
        } else if ("^".equals(operation)) {
            for (int i = 1; i < num2; i++) {
                result *= num1;
            }
        } else {
            result %= num2;
        }
        System.out.printf("%s %s %s = %s", num1, operation, num2, result);
    }
}
