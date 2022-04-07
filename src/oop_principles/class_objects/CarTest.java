package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        System.out.println(car1.getClass().getName());
        System.out.println(car1.equals(car1));

        car1.make = "Tesla";
        car1.model = "S";
        car1.year = 2022;
        car1.color = "Red";

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.drives();
        car1.honks();

        Car car2 = new Car();
        car2.make = "Tesla";
        car2.model = "X";
        car2.year = 2022;
        car2.color = "Black";

        Car car3 = new Car();
        car3.make = "BMW";
        car3.model = "M3";
        car3.year = 2022;
        car3.color = "Black";



        System.out.println("-----Cars List-----");
        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);

        for (Car myCar : myCars) {
           if(myCar.make.equals("Tesla")) System.out.println(myCar);

        }
    }
}
