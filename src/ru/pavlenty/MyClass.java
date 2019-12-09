package ru.pavlenty;

public class MyClass {

    public static void doSmth() throws Exception{
        System.out.println("do smth...");
        throw new ArrayIndexOutOfBoundsException("Error!!!");
    }
}
