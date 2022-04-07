package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Brasilia");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");

        System.out.println(countries);

        System.out.println("\n-----Converting Array to ArrayList-----\n");

        String[] countries2 = {"USA" , "Brasilia" , "Argentina" , "France" , "Belgium" , "Germany" , "Portugal"};
        ArrayList<String> countries3 = new ArrayList<>(Arrays.asList(countries2));
        System.out.println(countries3);

        System.out.println("\n-----Second Way-----\n");
        //WAY-2 to convert Array to List (ArrayList or LinkedList)
        List<String> countries4 = new ArrayList<>();
        List<String> countries5 = new LinkedList<>();

        Collections.addAll(countries4 , countries2);
        Collections.addAll(countries5 , countries2);

        System.out.println(countries4);
        System.out.println(countries5);


        System.out.println("\n-----Third Way (Manual Way)-----\n");

        int[] numbers = {1 , 2 , 3 , 4 , 5};

        List<Integer> numbersList = new ArrayList();
        for(int element: numbers){
            numbersList.add(element);
        }
        System.out.println(numbersList);





    }
}
