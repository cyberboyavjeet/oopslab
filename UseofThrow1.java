import java.io.*;

public class UseofThrow1{
    static void main(String [] arg)
    {
        InputStreamReader  rd= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(rd);
        System.out.println("Enter the Name");
        try{
        String name=br.readLine();
        System.out.println("NAme= "+name);}
        catch (Exception ex)
        {
            System.out.println("Error= "+ex.getMessage());
        }


    }
    
}

    
}
