package Lesson_2;

public class Calculator {
    private int num1;
    private int num2;
    private char mathOperation;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate() {
        double result = num1;
        switch (mathOperation) {
            case ('+'):
                result += num2;
                break;
            case ('-'):
                result -= num2;
                break;
            case ('*'):
                result *= num2;
                break;
            case ('/'):
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return Double.NaN;
                } else {
                    result /= num2;
                }
                break;
            case ('%'):
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return Double.NaN;
                } else {
                    result %= num2;
                }
                break;
            case ('^'):
                if (num2 == 0) {
                    result = 1;
                } else {
                    for (int i = 1; i < Math.abs(num2); i++) {
                        result *= num1;
                    }
                }
                if (num2 < 0) {
                    result = 1 / result;
                }
        }
        return result;
    }
}
