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
        boolean isInStock = true;
        System.out.println("Количество ядер, шт: " + numberCores);
        System.out.println("Гарантия продавца, мес.: " + sellerWarranty);
        System.out.println("Год производства: " + yearProduction);
        System.out.println("Цена, руб.: " + price);
        System.out.println("Базовая тактовая частота, ГГц: " + baseClockSpeed);
        System.out.println("Автоматическое увеличение тактовой частоты, ГГц: " + maxClockSpeed);
        System.out.println("Тип оборудования: " + typeEquipment);
        System.out.println("Наличие на складе: " + isInStock);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5f;
        float bookPrice = 235.83f;
        float discount = 0.11f;
        float sum = penPrice + bookPrice;
        float sumDiscount = sum * discount;
        float amount = sum - sumDiscount;
        System.out.println("Стоимость товаров без скидки = " + String.format("%.2f", sum));
        System.out.println("Сумма скидки = " + String.format("%.2f", sumDiscount));
        System.out.println("Стоимость товаров со скидкой = " + String.format("%.2f", amount));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J   a V     V a   ");
        System.out.println("   J  a a V   V a a  ");
        System.out.println("J  J aaaaa V V aaaaa ");
        System.out.println(" JJ a     a V a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        short shortNum = Short.MAX_VALUE;
        int intNum = Integer.MAX_VALUE;
        long longNum = Long.MAX_VALUE;
        System.out.println("Значения для типа byte: " + byteNum + " " + (++byteNum) + " " + (--byteNum));
        System.out.println("Значения для типа short: " + shortNum + " " + (++shortNum) + " " + (--shortNum));
        System.out.println("Значения для типа int: " + intNum + " " + (++intNum) + " " + (--intNum));
        System.out.println("Значения для типа long: " + longNum + " " + (++longNum) + " " + (--longNum));

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("исходные значения переменных: " + num1 + " и " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("новые значения переменных: " + num1 + " и " + num2);
        System.out.println("Перестановка с помощью арифметических операций:");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных: " + num1 + " и " + num2);
        System.out.println("Перестановка с помощью побитовой операции ^:");
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("новые значения переменных: " + num1 + " и " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ascii36 = '$';
        char ascii42 = '*';
        char ascii64 = '@';
        char ascii124 = '|';
        char ascii126 = '~';
        System.out.println("Код символа -- соответсвующий коду символ");
        System.out.println((int) ascii36 + " -- " + ascii36);
        System.out.println((int) ascii42 + " -- " + ascii42);
        System.out.println((int) ascii64 + " -- " + ascii64);
        System.out.println((int) ascii124 + " -- " + ascii124);
        System.out.println((int) ascii126 + " -- " + ascii126);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash + "    ");
        System.out.println("   " + slash + "  " + backslash + "   ");
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash + "  ");
        System.out.println(" " + slash + "      " + backslash + " ");
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n",
                slash, underscore, underscore, underscore, underscore, slash, backslash, underscore, underscore, backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int originalNum = 123;
        int hundred = 123 / 100;
        int decim = (123 / 10) % 10;
        int unit = 123 % 10;
        System.out.println("Число " + originalNum + " содержит:\n\tсотен - " + hundred + "\n\tдесятков - " + decim +
                "\n\tединиц - " + unit + "\nСумма разрядов = " + (hundred + decim + unit) +
                "\nПроизведение разрядов = " + (hundred * decim * unit));

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        System.out.println(time / 3600 + ":" + time % 3600 / 60 + ":" + time % 60);

        System.out.println("\n10*. Расчет стоимости товара со скидкой");
        var penPriceDicimal = new BigDecimal("105.50");
        var bookPriceDecimal = new BigDecimal("235.83");
        var discountDecimal = new BigDecimal("0.11");
        var sumDecimal = penPriceDicimal.add(bookPriceDecimal);
        var sumDiscountDecimal = sumDecimal.multiply(discountDecimal).setScale(2, RoundingMode.HALF_UP);
        var amountDecimal = sumDecimal.subtract(sumDiscountDecimal);
        System.out.println("Стоимость товаров без скидки = " + sumDecimal);
        System.out.println("Сумма скидки = " + sumDiscountDecimal);
        System.out.println("Стоимость товаров со скидкой = " + amountDecimal);
    }
}
