package javaMemoryManagement;

import java.util.ArrayList;

public class StringExample {
    public static void main(String[] args) {


        String name = "John";
        String name2 = new String("Alex");
        String name3 = "Alex";
        String name4 = "John";

        System.out.println(name == name4);
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));
        System.out.println(name2);
        System.out.println(name3);
    }
}
