package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String[] students = {"Alex" , "Tom" , "John" , "James" , "Jordan" , "Lionel" , "Adam"};

        System.out.println("Unsorted array is = " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array is = " + Arrays.toString(students));

        System.out.println("-----TASK 2-----");

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length-1]);


        System.out.println("-----TASK 3-----");

        int count = 0;

        for(String element: students){
        if(element.startsWith("A")) count++;

        }
        System.out.println(count);


        System.out.println("-----TASK 4-----");

        int count2 = 0;

        for(String element2: students){
            if(element2.contains("A") || element2.contains("E") || element2.contains("a") || element2.contains("e")) count2++;
        }
        System.out.println(count2);


        System.out.println("-----TASK 5-----");

        int count3 = 0;

        for(String element3: students){
            if(element3.length() >= 5) count3++;
        }
        System.out.println(count3);

        System.out.println("-----TASK 6-----");

        boolean hasJennifer = false;

        for (String student : students) {
            if(student.equalsIgnoreCase("Jennifer")){
                hasJennifer = true;
                break;
            }
        }
        System.out.println(hasJennifer);
        }



    }




