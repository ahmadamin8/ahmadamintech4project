package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n-----object references before losing reference");
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("\n-----object references after losing reference");
        dog1 = dog2;

        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(dog1);
        System.out.println(dog2);

    }
}
