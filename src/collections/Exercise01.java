package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String[] cities2 = {"Berlin" , "Chicago" , "Dallas" , "Miami" , "Brugge" , "Kiev"};

        ArrayList<String> cities = new ArrayList<>(Arrays.asList(cities2));
        System.out.println(cities);

        cities.remove(3);
        cities.remove(2);

        System.out.println(cities);
    }
}
