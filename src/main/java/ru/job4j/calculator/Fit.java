package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short womanheight) {
        double rsl = (womanheight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 189;
        double man = Fit.manWeight(height);
        short womanheight = 168;
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Man 189 is " + man);
        System.out.println("Woman 168 is " + woman);
    }

}