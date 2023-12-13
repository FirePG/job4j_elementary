package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int result1 = X2.calc(a, b, c, x);
        System.out.println(result1);
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        int result2 = X2.calc(a, b, c, x);
        System.out.println(result2);
        a = 0;
        int result3 = X2.calc(a, b, c, x);
        System.out.println(result3);
        a = 1;
        c = 0;
        int result4 = X2.calc(a, b, c, x);
        System.out.println(result4);
        c = 1;
        x = 0;
        int result5 = X2.calc(a, b, c, x);
        System.out.println(result5);
    }
}