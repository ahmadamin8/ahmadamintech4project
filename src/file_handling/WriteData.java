package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {

        File myFile = new File("studentList.txt");

        try {
        myFile.createNewFile();
        Thread.sleep(5000);
            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor");
            fileWriter.close(); // save

            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            //myFile.delete();

        }

        System.out.println("End of the program!!!");
    }
}
