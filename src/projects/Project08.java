package projects;

import java.util.ArrayList;

public class Project08 {

    public static void countMultipleWords(String[] words) {
        int countWords = 0;
        for (String element : words) {
            if (element.trim().contains(" ")) countWords++;
        }
        System.out.println(countWords);
    }

    public static void removeNegatives(ArrayList<Integer> numbers) {
        numbers.removeIf(element -> element < 0);
        System.out.println(numbers);
    }

    public static boolean validatePassword(String password){
        boolean digit = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;

        if(password.length() >= 8 && password.length() <= 16 && !password.contains(" ")){
            for (int i = 0; i < password.length(); i++) {

                char c = password.charAt(i);

                if(Character.isDigit(c) && !digit)
                    digit = true;

                else if(Character.isUpperCase(c) && !upperCase)
                    upperCase = true;

                else if(Character.isLowerCase(c) && !lowerCase)
                    lowerCase = true;

                else if(!Character.isLetterOrDigit(c) && !specialChar)
                    specialChar = true;
            }
        }
        return digit && upperCase && lowerCase && specialChar;
    }

    public static boolean validateEmailAddress(String email){

        int countAtSymbol = 0;
            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i) == '@') countAtSymbol++;
            }
            boolean enoughLength = false;

            if(!email.contains(" ") && countAtSymbol == 1){

                int atSign = email.indexOf('@');

                int end = email.lastIndexOf('.');

                if(email.substring(0,atSign).length() >=2 && email.substring(atSign,end).length() >= 3
                        && email.substring(end).length() >= 3) enoughLength = true;
            }
            return enoughLength;
        }
}





