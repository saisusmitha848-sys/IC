import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws{
    static void openFile() throws FileNotFoundException {
        FileReader reader = new FileReader("data.txt");
    }

    public static void main(String []args) {
        try{
            openFile();
        } 
        catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
       
    }
}