package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "";
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char operation = scanner.next().charAt(0);
                calculator.setMathOperation(operation);
                if ("Ошибка ввода".equals(calculator.inputResult)) {
                    System.out.print("Ошибка: операция '" + operation + "' не поддерживается.\n" +
                            "Доступны следующие операции: +, -, *, /, ^, %\n");
                }
            } while ("Ошибка ввода".equals(calculator.inputResult));
            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            calculator.calculate();
            calculator.print();

            while (!"no".equals(answer)) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if ("yes".equals(answer)) {
                    break;
                }
            }
        } while (!"no".equals(answer));
    }
}
