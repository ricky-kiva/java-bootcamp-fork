import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Greetings.txt"); // class to read a file
            Scanner scan = new Scanner(fis); // scanning the readed file
            while(scan.hasNextLine()) { // .hasNextLine is a prototype check next line from readed file
                System.out.println(scan.nextLine()); // printing the next line
            }
            scan.close();
        } catch (FileNotFoundException e) { // class for FileNotFound error
            System.out.println(e.getMessage()); // printing error
        } // FileInputStream need to be always try-catch

        
        
    }
}
