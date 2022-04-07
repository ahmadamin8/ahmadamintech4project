package oop_principles.class_objects;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        System.out.println(apple1);

        Apple apple2 = new Apple();
        System.out.println(apple2);

        Apple apple3 = new Apple(5);

        Apple.doNothing();
        Apple.doNothing();

        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;

        System.out.println(apple1.color); // Red
        System.out.println(apple1.taste); // Sweet
        System.out.println(apple1.price); // 0.99


        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;
        System.out.println(apple2.color); // Green
        System.out.println(apple2.taste); // Sour
        System.out.println(apple2.price); // 1.29
    }
}
