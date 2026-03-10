import java.io.*;
import java.lang.*;
public class File1{
    public static void main(String[] args) {
       
        try {
            File fo=new File("javabatch.txt"); 
            if(fo.createNewFile())
                {
                System.out.println("File created Succesfully");
            }
            else{
                System.out.println("File not created:");

            }
        } catch (Exception ex) {
            System.out.println("error: "+ex.getMessage());
        }
    }
}