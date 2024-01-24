package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
       String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surname.length);
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[100500];
        names[0] = "Pavel Gritsyn";
        names[1] = "Ivan Ivanov";
        names[2] = "Petr Petrov";
        names[3] = "Dima Dibrov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
