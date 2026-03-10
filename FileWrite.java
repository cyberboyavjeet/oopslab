import java.io.*;
public class FileWrite{
    public static void main(String[] arg){
        try{
            FileWriter fo=new FileWriter("javabatch.txt");
            fo.write("This is a file handling program");
            fo.write("End of Program");
            fo.close();
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
}