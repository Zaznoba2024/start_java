package Lesson_2;

public class Calculator {
    private int num1;
    private int num2;
    private char mathOperation;
    double result;
    public String inputResult;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathOperation(char mathOperation) {
        if (mathOperation != '+' && mathOperation != '-' &&
                mathOperation != '*' && mathOperation != '/' &&
                mathOperation != '^' && mathOperation != '%') {
            inputResult = "Ошибка ввода";
        } else {
            this.mathOperation = mathOperation;
            inputResult = "";
        }
    }

    public double calculate() {
        switch (mathOperation) {
            case '+':
                return result = num1 + num2;
            case '-':
                return result = num1 - num2;
            case '*':
                return result = num1 * num2;
            case '/':
            case '%':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return result = Double.NaN;
                }
                if (mathOperation == '/') {
                    return result = num1 / num2;
                }
                return result = num1 % num2;
            case '^':
                if (num2 == 0) {
                    return result = 1;
                }
                result = num1;
                for (int i = 1; i < Math.abs(num2); i++) {
                    result *= num1;
                }
                if (num2 < 0) {
                    return result = 1 / result;
                }
                return result;
            default:
                throw new IllegalStateException("Некорректная операция: " + mathOperation);
        }
    }

    public void print() {
        if (!Double.isNaN(result)) {
            System.out.printf("%s %c %s = %s\n", num1, mathOperation, num2, result);
        }
    }
}
