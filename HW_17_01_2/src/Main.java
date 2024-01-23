public class Main {
    public static void main(String... args) {
        byte byteVar = 10;
        short shortVar = 112;
        int intVar = 2700;
        long longVar = 15300;
        float floatVar = 18;
        double doubleVar = 25.77;

        // Сужение
        byteVar = (byte)shortVar;
        System.out.println(byteVar);

        shortVar = (short)intVar;
        System.out.println(shortVar);

        intVar = (int)longVar;
        System.out.println(intVar);

        longVar = (long)floatVar;
        System.out.println(longVar);

        floatVar = (float)doubleVar;
        System.out.println(floatVar);

        byte byteVar1 = 12;
        short shortVar1 = 107;
        int intVar1 = 2789;
        long longVar1 = 17390;
        float floatVar1 = 16;
        double doubleVar1 = 22.22;
        // Расширение
        doubleVar1 = floatVar1;
        System.out.println(doubleVar1);

        floatVar1 = longVar1;
        System.out.println(floatVar1);

        longVar1 = intVar1;
        System.out.println(longVar1);

        intVar1 = shortVar1;
        System.out.println(intVar1);

        shortVar1 = byteVar1;
        System.out.println(shortVar1);

    }
}