public class UseOfMultiCatch {
    static void main(String [] arg)
    {
        int arr[]={1,2,34,5};
        String sr=null;
        String name="abc";

        try{
            System.out.println("Array= "+arr[5]);
            System.out.print("Length= "+sr.length());
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Error= "+ex.getMessage());
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Error= "+ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Err0r= "+ex.getMessage());
            
        }
        System.out.println("End of Program");
    }
    
}
