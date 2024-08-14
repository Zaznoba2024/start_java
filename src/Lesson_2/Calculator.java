package Lesson_2;

public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setOperation(char operation) {
        if (operation == '+' || operation == '-' ||
                operation == '*' || operation == '/' ||
                operation == '^' || operation == '%') {
            this.operation = operation;
            return true;
        }
        return false;
    }

    public double calculate() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
            case '%':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return Double.NaN;
                }
                return operation == '/' ? (double) num1 / num2 : num1 % num2;
            case '^':
                double result;
                if (num2 == 0) {
                    return 1;
                }
                result = num1;
                for (int i = 1; i < Math.abs(num2); i++) {
                    result *= num1;
                }
                return num2 > 0 ? result : 1 / result;
            default:
                throw new IllegalStateException("Некорректная операция: " + operation);
        }
    }
}
