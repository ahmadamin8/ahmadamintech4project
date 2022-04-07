package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        String[] colors = {"red" , "blue" , "yellow" , "brown" , "white"};

        String longest = "";

        for (String color : colors) {
            if(color.length() > longest.length()) longest = color;
        }
        System.out.println(longest);

    }
}



