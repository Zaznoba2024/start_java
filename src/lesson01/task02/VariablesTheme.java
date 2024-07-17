package lesson01.task02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("\nПеременные: примитивные типы данных");

        System.out.println("\n1. Вывод характеристик компьютера");
        byte numberCores = 4;
        short sellerWarranty = 24;
        int yearProduction = 2024;
        long price = 121_499;
        float baseClockSpeed = 3.38f;
        double maxClockSpeed = 4.4d;
        char typeEquipment = 'p';
        boolean hasInStock = true;
        System.out.println("Количество ядер, шт: " + numberCores);
        System.out.println("Гарантия продавца, мес.: " + sellerWarranty);
        System.out.println("Год производства: " + yearProduction);
        System.out.println("Цена, руб.: " + price);
        System.out.println("Базовая тактовая частота, ГГц: " + baseClockSpeed);
        System.out.println("Автоматическое увеличение тактовой частоты, ГГц: " + maxClockSpeed);
        System.out.println("Тип оборудования: " + typeEquipment);
        System.out.println("Наличие на складе: " + hasInStock);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5f;
        float bookPrice = 235.83f;
        float discount = 0.11f;
        float basePrice = penPrice + bookPrice;
        float sumDiscount = basePrice * discount;
        float discountPrice = basePrice - sumDiscount;
        System.out.printf("Стоимость товаров без скидки = %.2f\n", basePrice);
        System.out.printf("Сумма скидки = %.2f\n", sumDiscount);
        System.out.printf("Стоимость товаров со скидкой = %.2f\n", discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J   a V     V a   ");
        System.out.println("   J  a a V   V a a  ");
        System.out.println("J  J aaaaa V V aaaaa ");
        System.out.println(" JJ a     a V a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte extremesByteValue = Byte.MAX_VALUE;
        short extremesShortValue = Short.MAX_VALUE;
        int extremesIntValue = Integer.MAX_VALUE;
        long extremesLongValue = Long.MAX_VALUE;
        char extremesCharValue = Character.MAX_VALUE;
        System.out.println("Значения для типа byte: "
                + extremesByteValue + " "
                + (++extremesByteValue) + " "
                + (--extremesByteValue));
        System.out.println("Значения для типа short: "
                + extremesShortValue + " "
                + (++extremesShortValue) + " "
                + (--extremesShortValue));
        System.out.println("Значения для типа int: "
                + extremesIntValue + " "
                + (++extremesIntValue) + " "
                + (--extremesIntValue));
        System.out.println("Значения для типа long: "
                + extremesLongValue + " "
                + (++extremesLongValue) + " "
                + (--extremesLongValue));
        System.out.println("Значения для типа char: "
                + (int) extremesCharValue + " "
                + (int) (++extremesCharValue) + " "
                + (int) (--extremesCharValue));

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("исходные значения переменных: " + num1 + " и " + num2);
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("новые значения переменных: " + num1 + " и " + num2);
        System.out.println("Перестановка с помощью арифметических операций:");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных: " + num1 + " и " + num2);
        System.out.println("Перестановка с помощью побитовой операции ^:");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения переменных: " + num1 + " и " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа -- соответствующий коду символ");
        System.out.println((int) dollar + " -- " + dollar);
        System.out.println((int) asterisk + " -- " + asterisk);
        System.out.println((int) atSign + " -- " + atSign);
        System.out.println((int) verticalBar + " -- " + verticalBar);
        System.out.println((int) tilde + " -- " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n",
                slash, underscore, underscore, underscore, underscore,
                slash, backslash, underscore, underscore, backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int originalNum = 123;
        int hundreds = originalNum / 100;
        int tens = (originalNum / 10) % 10;
        int ones = originalNum % 10;
        System.out.println("Число " + originalNum + " содержит:" +
                "\n\tсотен - " + hundreds +
                "\n\tдесятков - " + tens +
                "\n\tединиц - " + ones +
                "\nСумма разрядов = " + (hundreds + tens + ones) +
                "\nПроизведение разрядов = " + (hundreds * tens * ones));

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        System.out.println(time / 3600 + ":" + time % 3600 / 60 + ":" + time % 60);

        System.out.println("\n10*. Расчет стоимости товара со скидкой");
        var penPriceDecimal = new BigDecimal("105.50");
        var bookPriceDecimal = new BigDecimal("235.83");
        var discountDecimal = new BigDecimal("0.11");
        var basePriceDecimal = penPriceDecimal.add(bookPriceDecimal);
        var sumDiscountDecimal = basePriceDecimal.multiply(discountDecimal).setScale(2, RoundingMode.HALF_UP);
        var discountPriceDecimal = basePriceDecimal.subtract(sumDiscountDecimal);
        System.out.println("Стоимость товаров без скидки = " + basePriceDecimal);
        System.out.println("Сумма скидки = " + sumDiscountDecimal);
        System.out.println("Стоимость товаров со скидкой = " + discountPriceDecimal);
    }
}
