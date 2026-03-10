import java.io.File;
import java.io.IOException;

public class File1 {

    public static void main(String[] args) {

        try {
            File fo = new File("javabatch.txt");

            if (fo.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
}