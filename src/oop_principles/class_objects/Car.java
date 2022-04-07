package oop_principles.class_objects;

public class Car {

    public Car(){

    }

    public String make;
    public String model;
    public int year;
    public String color;



    public void drives(){
        System.out.println("This car drives");

    }


    public void honks(){
        System.out.println("This car honks");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
