package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        for (int i = 0; i < objects.size(); i++) {
            for (int j = i + 1; j < objects.size(); j++) {
                if (objects.get(i).equals(objects.get(j))) {
                    objects.remove(i);
                }
            }
        }
        System.out.println(objects);
    }
}









