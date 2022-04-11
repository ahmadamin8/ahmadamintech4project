package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.breed = "puppy";
        dog1.age = 2;

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
