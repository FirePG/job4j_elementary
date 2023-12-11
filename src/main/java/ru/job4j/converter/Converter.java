package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.09f;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.91f;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 120;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 7 dollars. Test result : " + passed);
        in = 100;
        expected = 109;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("100 euro are 109 dollars. Test result : " + passed);
        expected = 91;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("100 dollars are 91 euro. Test result : " + passed);
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float dollars = Converter.euroToDollar(140);
        float euros = Converter.dollarToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 euro are " + dollars + " dollar.");
        System.out.println("140 dollar are " + euros + " euro.");
    }
}