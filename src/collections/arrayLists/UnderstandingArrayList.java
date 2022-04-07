package collections.arrayLists;


import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        // 1. Declaring an Array vs ArrayList
        String[] namesArray = new String[5]; // [null , null , null , null , null]

        ArrayList<String> namesList = new ArrayList<>();



        // 2. How to print the size of Array vs ArrayList
        System.out.println("-----Printing size of Array vs ArrayList");
        System.out.println("Size of the Array = " + namesArray.length); // 5
        System.out.println("Size of the ArrayList = " + namesList.size()); // 0


        // 3. How to add element to Array vs ArrayList
        namesArray[0] = "Abe";
        namesArray[4] = "Data";

        namesList.add("Abe"); // add method that takes object [Abe]
        namesList.add(1 , "Data"); // Add object to a specific index [Abe , Data]
        namesList.add(1 , "John"); // [Abe , John , Data]
        namesList.add("Alona"); // [Abe , John , Data , Alona]
        namesList.add("Max"); // [Abe , John , Data , Alona , Max]
        namesList.add(0 , "James"); // [James , Abe , John , Data , Alona , Max]

        namesList.set(3 , "Lionel");



        // 4. How to print Array vs ArrayList
        System.out.println(Arrays.toString(namesArray));
        System.out.println(namesList);

        namesList.add("Andrei");
        System.out.println(namesList);

        namesList.add(5 , "Taylor");
        System.out.println(namesList);

        namesList.set(3 , "Daria");
        System.out.println(namesList);

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(null);
        namesList.add(null);
        namesList.add(null);
        namesList.add("Guluzar");

        System.out.println(namesList);
        System.out.println(namesList.size());

        // namesList.remove(7) this will remove element at index of 7
        // namesList.remove("James") this will remove James
        // namesList.removeAll(collectionOfElementsToBeRemoved) this will remove all the elements from the given collection

        namesList.remove(0);
        System.out.println(namesList);

        namesList.remove(2);
        System.out.println(namesList);

        namesList.remove("Alona");
        System.out.println(namesList);

        namesList.remove("John");
        System.out.println(namesList);

        namesList.add(0 , "Regina");
        System.out.println(namesList);

        System.out.println(namesList.get(3)); // Max
        System.out.println(namesList.get(5)); // Regina
        System.out.println(namesList);

        System.out.println(namesList.indexOf("Regina")); // 0
        System.out.println(namesList.lastIndexOf("Regina")); // 7

        System.out.println(namesList.contains("Max")); // true
        System.out.println(namesList.contains("max")); // false
        System.out.println(namesList.contains("Kaly")); // false

        namesList.clear();
        System.out.println(namesList.size());























    }
}
