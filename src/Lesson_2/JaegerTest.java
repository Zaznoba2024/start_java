package Lesson_2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.142f);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);

        Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan",
                85.34f, 2.312f, 7, 4);

        System.out.printf("Полная информация. Робот №1." +
                "\nМодель: %s\nМарка: %s\nСтрана происхождения: %s" +
                "\nВысота: %s\nВес: %s\nСила: %s\nБроня: %s\n\n",
                chernoAlpha.getModelName(), chernoAlpha.getMark(), chernoAlpha.getOrigin(),
                chernoAlpha.getHeight(), chernoAlpha.getWeight(),
                chernoAlpha.getStrength(), chernoAlpha.getArmor());
        System.out.printf("Полная информация. Робот №2." +
                "\nМодель: %s\nМарка: %s\nСтрана происхождения: %s" +
                "\nВысота: %s\nВес: %s\nСила: %s\nБроня: %s\n\n",
                coyoteTango.getModelName(), coyoteTango.getMark(), coyoteTango.getOrigin(),
                coyoteTango.getHeight(), coyoteTango.getWeight(),
                coyoteTango.getStrength(), coyoteTango.getArmor());

        System.out.printf("Страна происхождения %s - %s, а %s - %s.\n\n",
                chernoAlpha.getModelName(), chernoAlpha.getOrigin(),
                coyoteTango.getModelName(), coyoteTango.getOrigin());

        System.out.printf("%s %s\n", chernoAlpha.getModelName(), chernoAlpha.move());
        System.out.printf("%s %s, %s\n", coyoteTango.getModelName(), coyoteTango.scanKaiju(),
                coyoteTango.usePowerMoves());
        if (chernoAlpha.drift()) {
            System.out.printf("%s drifting\n", chernoAlpha.getModelName());
        }
        System.out.printf("%s %s, %s\n", chernoAlpha.getModelName(), chernoAlpha.useWeapon(),
                chernoAlpha.usePowerMoves());
    }
}
