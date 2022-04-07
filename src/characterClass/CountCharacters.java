package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count = 0;

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ' ') {
                count++;

            }
        }
        System.out.println("There are " + count + " spaces in your string");

        System.out.println("-----TASK 2-----");
        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count2 = 0;

        for (int i = 0; i < address1.length(); i++) {
            if (Character.isLetter(address1.charAt(i))) {
                count2++;
            }
        }
        System.out.println(count2);


        System.out.println("\n---TASK-3---\n");

        int countL = 0, countU = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (Character.isUpperCase(c)) countU++;
            else if (Character.isLowerCase(c)) countL++;
        }

        System.out.println(Math.abs(countL - countU));

        System.out.println("-----TASK 4-----");

        int countVowel = 0, countCons = 0;

        for (int i = 0; i < address.length(); i++) {
            char c2 = address.charAt(i);
            if (Character.isLetter(c2)) {
                if (CharacterHelper.isVowel(c2)) countVowel++;
                else countCons++;
            }
        }
        System.out.println("Vowels = " + countVowel);
        System.out.println("Consonants = " + countCons);


        System.out.println("\n---TASK-5---\n");
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                letterCounter++;
                if(Character.isUpperCase(c)){
                    upperCounter++;
                }
                else{
                    lowerCounter++;
                }

                if(CharacterHelper.isVowel(c)){
                    vowelCounter++;
                }
                else{
                    consonantCounter++;
                }
            }
            else if(Character.isDigit(c)){
                digitCounter++;
                if(Integer.parseInt("" + c) % 2 == 0){
                    evenCounter++;
                }
                else{
                    oddCounter++;
                }
            }
            else if(Character.isSpaceChar(c)){
                spaceCounter++;
            }
            else{
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);


    }
}
















