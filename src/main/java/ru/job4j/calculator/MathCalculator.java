package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double allOperations(double first, double second) {
        return minus(first, second) + sum(first, second) + divide(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен: " + minusAndDivide(20, 10));
        System.out.println("Результат расчета равен: " + allOperations(20, 10));
    }
}