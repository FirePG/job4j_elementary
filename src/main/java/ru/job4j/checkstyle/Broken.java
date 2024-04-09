package ru.job4j.checkstyle;

public class Broken {

    String name;
    public String surname;
    private int sizeOfEmpty = 10;

    public static final String NEWVALUE = "";

    void method(int a, int b, int c, int d, int e, int f) {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void echo() {
    }

    Broken() {
    }
}