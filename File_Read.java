import java.io.*;
import java.util.*;
public class File_Read{
    public static void main(String[] args) {
        try {
            File myfile=new File("javabatch.txt");
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            // TODO: handle exception
        }
    }
}