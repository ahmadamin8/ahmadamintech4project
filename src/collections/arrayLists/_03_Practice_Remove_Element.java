package collections.arrayLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Element {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        List<String> languages = new LinkedList<>();

            languages.add("Java");
            languages.add("JavaScript");
            languages.add("C#");
            languages.add("Python");
            languages.add("C++");

            languages.remove("Python");
            System.out.println(languages);


        System.out.println("-----TASK 2-----");

        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).startsWith("J")){
                languages.remove(languages.get(i));
                i--;
            }
        }
        System.out.println(languages);


        System.out.println("-----TASK 2 Other Way-----");

        List<String> elementsStartWithJ = new LinkedList<>();

        for(String language: languages){
            if(language.startsWith("J")) elementsStartWithJ.add(language);
        }
        languages.removeAll(elementsStartWithJ);
        System.out.println(languages);


        System.out.println("-----LAST WAY-----");
        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);
    }
}






