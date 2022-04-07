package utilities;

    //Task 1
public class CharacterHelper {
    public static boolean isSpace(char space){
        return space == ' ';
    }

    //Task 2
    public static boolean isDigit(char digit){
        return digit >= 48 && digit <= 57;

    }

    //Task 3
    public static boolean isUppercase(char uppercase){
        return uppercase >= 65 && uppercase <= 90;
    }

    //Task 4
    public static boolean isLowercase(char lowercase){
        return lowercase >= 97 && lowercase <= 122;
    }

    //Task 5
    public static boolean isLetter(char letter){
        return letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122;
    }

    //Task 6
    public static boolean isVowel(char vowel){
        return vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U' ||
               vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u';
    }

    //Task 7
    public static boolean isConsonant(char consonant){
        return consonant >= 65 && consonant <= 90 && consonant >= 97 && consonant <= 122 && consonant != 65
               && consonant != 69 && consonant != 73 && consonant != 79 && consonant != 85 && consonant != 97
               && consonant != 101 && consonant != 105 && consonant != 111 && consonant != 117;
    }

}

