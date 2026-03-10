import java.io.*;

public class UseofThrow {
    static void main(String [] arg) throws IOException
    {
        InputStreamReader  rd= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(rd);
        System.out.println("Enter the Name");
        String name=br.readLine();
        System.out.println("NAme= "+name);


    }
    
}
