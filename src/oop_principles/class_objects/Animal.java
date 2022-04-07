package oop_principles.class_objects;

import java.util.ArrayList;

public class Animal {

    //default constructor
    public Animal(){

    }
    public Animal(String name, int age, String color, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore){
        this.name = name;
        this.age = age;
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }


    //Fields of an Animal instance
    public boolean hasEyes = true;
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore = false;
    public boolean isHerbivore = true;
    public boolean isOmnivore = false;


    @Override
    public String toString() {
        return "Animal{" +
                "hasEyes=" + hasEyes +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    //Testing Animal
    public static void main(String[] args) {
        Animal a1 = new Animal("Cow" , 3 , "Black" , false , true , false);

        Animal a2 = new Animal("Cat" , 1 , "Gray" , false , false , true);

        Animal a3 = new Animal("Parrot" , 2 , "White" , false , true , false);

        Animal a4 = new Animal("Lion" , 4 , "Beige" , true , false , false);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);


        System.out.println("-----Task 1-----");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);

        int herbivore = 0;
        int omnivore = 0;
        int carnivore = 0;

        for (Animal element : animalList) {
            if(element.isOmnivore) omnivore++;
            else if(element.isCarnivore) carnivore++;
            else herbivore++;

        }
        System.out.println("Herbivore = " + herbivore);
        System.out.println("Carnivore = " + carnivore);
        System.out.println("Omnivore = " + omnivore);




    }


}
