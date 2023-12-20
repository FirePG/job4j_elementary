package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(4, 1);
        double result2 = RectangleArea.square(6, 2);
        double result3 = RectangleArea.square(13, 5);
        double result4 = RectangleArea.square(9, 8);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        System.out.println(" p = 13, k = 5, s = 5.86, real = " + result3);
        System.out.println(" p = 9, k = 8, s = 2, real = " + result4);
    }
}