package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = 1.0 / 2.0 * (a + b + c);
        double s2 = p * (p - a) * (p - b) * (p - c);
        double s = Math.sqrt(s2);
        return s;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}

