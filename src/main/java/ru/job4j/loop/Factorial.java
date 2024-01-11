package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = i * result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
        System.out.println(calculate(1));
    }
}