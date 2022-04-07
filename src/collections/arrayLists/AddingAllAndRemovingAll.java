package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        ArrayList<String> germanCars = new ArrayList<>();

        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars is = " + germanCars);

        System.out.println("-----TASK 2-----");

        ArrayList<String> japanCars = new ArrayList<>();

        japanCars.add("Honda");
        japanCars.add("Toyota");
        japanCars.add("Lexus");

        System.out.println("Japanese cars is = " + japanCars);

        System.out.println("-----TASK 3-----");

        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars is = " + luxuryCars);


        System.out.println("Putting all together");

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory);

        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);

        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);

        inventory.addAll(japanCars);
        System.out.println("Inventory after adding Japanese cars = " + inventory);

        inventory.removeAll(japanCars);
        System.out.println("inventory after removing Japanese cars = " + inventory);


    }
}
