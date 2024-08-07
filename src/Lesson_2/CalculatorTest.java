package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean hasContinue = true;

        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operation = scanner.next().charAt(0);
            while ((operation != '+' && operation != '-' &&
                    operation != '*' && operation != '/' &&
                    operation != '^' && operation != '%')) {
                System.out.print("Ошибка: операция '" + operation + "' не поддерживается.\n" +
                        "Доступны следующие операции: +, -, *, /, ^, %\n" +
                        "Введите знак операции (+, -, *, /, ^, %): ");
                operation = scanner.next().charAt(0);
            }
            calculator.setMathOperation(operation);
            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            double result = calculator.calculate();
            if (!Double.isNaN(result)) {
                System.out.printf("%s %c %s = %s\n", calculator.getNum1(),
                        calculator.getMathOperation(), calculator.getNum2(), result);
            }

            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String answer = scanner.next();
                if ("yes".equals(answer)) {
                    break;
                }
                if ("no".equals(answer)) {
                    hasContinue = false;
                    break;
                }
            }
        } while (hasContinue);
    }
}
