package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        File ahmadFile = new File("objects.txt");

        try{
            FileWriter fileWriter = new FileWriter("objects.txt");
            fileWriter.write("Computer\n");
            fileWriter.write("Phone\n");
            fileWriter.write("Table\n");
            fileWriter.write("Chair\n");
            fileWriter.write("Mouse\n");
            fileWriter.write("Screen\n");
            fileWriter.write("Remote\n");
            fileWriter.close();

            Scanner reader = new Scanner(ahmadFile);

            while (reader.hasNextLine()){
                String next = reader.nextLine();
                if(next.toLowerCase().contains("r")) System.out.println(next);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            ahmadFile.delete();
        }
        System.out.println("End of the program!");
    }
}
