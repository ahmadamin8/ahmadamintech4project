package projects;


public class Project03 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String s1 = "24";
        String s2 = "5";

        int num1Int = Integer.parseInt(s1);
        int num2Int = Integer.parseInt(s2);
        double num1Double = Double.parseDouble(s1);
        double num2Double = Double.parseDouble(s2);

        int sum = num1Int + num2Int;

        int sub = num1Int - num2Int;

        double div = num1Double / num2Double;

        int times = num1Int * num2Int;

        int remainder = num1Int % num2Int;

        System.out.println("The sum of 24 and 5 = " + sum);
        System.out.println("The subtraction of 24 and 5 = " + sub);
        System.out.println("The division of 24 and 5 = " + div);
        System.out.println("The multiplication of 24 and 5 = " + times);
        System.out.println("The remainder of 24 and 5 = " + remainder);


        System.out.println("-----TASK 2-----");

        int random1 = (int) (Math.random() * 35) + 1;
        System.out.println("Random number = " + random1);

        switch (random1) {
            case 2:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 3:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 5:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 7:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 11:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 13:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 17:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 19:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 23:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 29:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            case 31:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            default:
                System.out.println("THE NUMBER IS NOT A PRIME NUMBER");


                System.out.println("-----TASK 3-----");

                int task3Random1 = (int) (Math.random() * 50) + 1;
                int task3Random2 = (int) (Math.random() * 50) + 1;
                int task3Random3 = (int) (Math.random() * 50) + 1;

                System.out.println("Random number 1 = " + task3Random1);
                System.out.println("Random number 2 = " + task3Random2);
                System.out.println("Random number 3 = " + task3Random3);

                if (task3Random1 < task3Random2 && task3Random1 < task3Random3) {
                    System.out.println("Lowest number is = " + task3Random1);
                } else if (task3Random2 < task3Random1 && task3Random2 < task3Random3) {
                    System.out.println("Lowest number is = " + task3Random2);
                } else if (task3Random3 < task3Random1 && task3Random3 < task3Random2) {
                    System.out.println("Lowest number is = " + task3Random3);
                }
                if (task3Random1 > task3Random2 && task3Random1 < task3Random3) {
                    System.out.println("Middle number is = " + task3Random1);
                } else if (task3Random1 < task3Random2 && task3Random1 > task3Random3) {
                    System.out.println("Middle number is = " + task3Random1);
                } else if (task3Random2 > task3Random1 && task3Random2 < task3Random3) {
                    System.out.println("Middle number is = " + task3Random2);
                } else if (task3Random2 < task3Random1 && task3Random2 > task3Random3) {
                    System.out.println("Middle number is = " + task3Random2);
                } else if (task3Random3 > task3Random1 && task3Random3 < task3Random2) {
                    System.out.println("Middle number is = " + task3Random3);
                } else if (task3Random3 < task3Random1 && task3Random3 > task3Random2) {
                    System.out.println("Middle number is = " + task3Random3);
                }
                if (task3Random1 > task3Random2 && task3Random1 > task3Random3) {
                    System.out.println("Greatest number is = " + task3Random1);
                } else if (task3Random2 > task3Random1 && task3Random2 > task3Random3) {
                    System.out.println("Greatest number is = " + task3Random2);
                } else if (task3Random3 > task3Random1 && task3Random3 > task3Random2) {
                    System.out.println("Greatest number is = " + task3Random3);
                }

                System.out.println("-----TASK 4-----");

                char task4Char = 'A';
                int task4Int = task4Char;


                if (task4Char >= 97 && task4Char <= 122) {
                    System.out.println("The letter is lowercase ");
                } else if (task4Char >= 65 && task4Char <= 90) {
                    System.out.println("The letter is uppercase");
                } else {
                    System.out.println("Invalid character detected!!!");

                }

                System.out.println("-----TASK 5-----");

                char task5Char = 'i';
                int task5Int = task5Char;
                System.out.println("Character is " + task5Char);

                if (task5Int == 65 || task5Int == 97 || task5Int == 69 || task5Int == 101 || task5Int == 73 ||
                        task5Int == 105 || task5Int == 79 || task5Int == 111 || task5Int == 85 || task5Int == 117) {
                    System.out.println("The letter is vowel");
                } else if (task5Int >= 65 && task5Int <= 90 || task5Int >= 97 && task5Int <= 122) {
                    System.out.println("The letter is consonant");
                } else System.out.println("Invalid character detected!!!");


                System.out.println("-----TASK 6-----");

                char task6Char = '@';
                char task6Int = task6Char;

                if (task6Int == 33 || task6Int == 34 || task6Int == 35 || task6Int == 36 || task6Int == 37 ||
                        task6Int == 38 || task6Int == 39 || task6Int == 40 || task6Int == 41 ||
                        task6Int == 42 || task6Int == 43 || task6Int == 44 || task6Int == 45 || task6Int == 46 ||
                        task6Int == 47 || task6Int == 58 || task6Int == 59 || task6Int == 60 || task6Int == 61 ||
                        task6Int == 62 || task6Int == 63 || task6Int == 64 || task6Int == 91 || task6Int == 92 ||
                        task6Int == 93 || task6Int == 94 || task6Int == 95 || task6Int == 96 || task6Int == 123 ||
                        task6Int == 124 || task6Int == 125 || task6Int == 126) {
                    System.out.println("Special character is = " + task6Char);
                } else if (task6Int >= 33 && task6Int <= 95 || task6Int >= 112 && task6Int <= 127) {
                    System.out.println("Invalid character detected!!!");
                }



                System.out.println("-----Task 7-----");

                char task7Char = '8';


                if (task7Char >= 65 && task7Char <= 122) {
                    System.out.println("Character is a letter");
                } else if (task7Char >= 48 && task7Char <= 57) {
                    System.out.println("Character is a digit");
                } else if (task7Char >= 33 && task7Char <= 47) {
                    System.out.println("Character is a special character");
                } else if (task7Char >= 58 && task7Char <= 64) {
                    System.out.println("Character is a special character");


                }
        }
    }
}





















