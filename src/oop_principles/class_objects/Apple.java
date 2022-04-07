package oop_principles.class_objects;

public class Apple {

    public Apple(){
        System.out.println("This is zero-arg constructor");
        System.out.println("Hello World!");

    }

    public Apple(int number){
        System.out.println("One arg constructor is invoked with " + number);
    }

    public static void doNothing() {
        System.out.println("Well, I am not doing anything");
    }

    public String color;
    public String taste;
    public double price;


    }

