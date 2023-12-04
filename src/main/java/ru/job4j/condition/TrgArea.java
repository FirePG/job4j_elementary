package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double s = Math.sqrt((1.0 / 2) * (a + b + c) * ((1.0 / 2) * (a + b + c) - a) * ((1.0 / 2) * (a + b + c) - b) * ((1.0 / 2) * (a + b + c) - c));
        return s;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}

