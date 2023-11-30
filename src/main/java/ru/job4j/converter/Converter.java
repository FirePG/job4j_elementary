package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
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