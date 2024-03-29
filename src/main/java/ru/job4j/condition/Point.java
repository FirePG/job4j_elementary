package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double xysqrt = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return xysqrt;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(5, 0, 2, 0);
        double result2 = Point.distance(1, 1, 1, 1);
        double result3 = Point.distance(3, 1, 2, 1);
        double result4 = Point.distance(8, 8, 1, 1);
        double result5 = Point.distance(3, 4, 5, 6);
        System.out.println("result (5, 0) to (2, 0) " + result1);
        System.out.println("result (1, 1) to (1, 1) " + result2);
        System.out.println("result (3, 1) to (2, 1) " + result3);
        System.out.println("result (8, 8) to (1, 1) " + result4);
        System.out.println("result (3, 4) to (5, 6) " + result5);
    }
}
