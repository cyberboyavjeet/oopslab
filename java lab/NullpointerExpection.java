public class NullpointerExpection {
    static void main(String [] arg)
    {   try{
        String sr=null;
        System.out.println("Length of name= "+sr.length());}
        catch(Exception ex)
        {
            System.out.print("Error= "+ex.getMessage());
        }
        System.out.println(("End of program"));

    }
    
}
