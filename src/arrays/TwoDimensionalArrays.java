package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] studentGroups = {
                                   {"Kaly", "Guluzar", "Melda"},
                                   {"Torrie", "David"},
                                   {"Abe", "Data"}
                                   };

        System.out.println(studentGroups[0][1]); // Guluzar
        System.out.println(studentGroups[1][0]); // Torrie
        System.out.println(studentGroups[1][1]); // David


        System.out.println(studentGroups.length); // 3

        System.out.println(studentGroups[1].length); // 2
        System.out.println(studentGroups[2].length);

        System.out.println(Arrays.toString(studentGroups[2]));

        System.out.println(Arrays.deepToString(studentGroups)); // Used to print all


        System.out.println(Arrays.toString(studentGroups[0]));
        System.out.println(Arrays.toString(studentGroups[1]));
        System.out.println(Arrays.toString(studentGroups[2]));


        System.out.println("Printing all groups with fori loop");
        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));


        }
        System.out.println("Printing each group with for each loop");

        for(String[] element: studentGroups){
            System.out.println(Arrays.toString(element));
        }


        System.out.println("Printing all members with fori loop");

        for (int i = 0; i < studentGroups.length; i++) {

            for (int j = 0; j < studentGroups[i].length; j++) {
                System.out.println(studentGroups[i][j]);

            }

        }

        System.out.println("Printing all members with for each loop");
        for (String[] group : studentGroups) {

            for(String member: group){
                System.out.println(member);
            }

        }

    }
}
