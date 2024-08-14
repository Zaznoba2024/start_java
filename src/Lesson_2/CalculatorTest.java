package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);
            char operation;
            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                operation = scanner.next().charAt(0);
                if (!calculator.setOperation(operation)) {
                    System.out.print("Ошибка: операция '" + operation + "' не поддерживается.\n" +
                            "Доступны следующие операции: +, -, *, /, ^, %\n");
                }
            } while (!calculator.setOperation(operation));
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);

            double result = calculator.calculate();
            print(num1, operation, num2, result);

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while (!"no".equals(answer));
    }

    public static void print(int num1, char operation, int num2, double result) {
        if (!Double.isNaN(result)) {
            System.out.printf("%s %c %s = %s\n", num1, operation, num2, result);
        }
    }
}
