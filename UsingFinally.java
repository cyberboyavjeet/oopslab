public class UsingFinally {
    static void main(String [] arg)
    {
        int arr[]={1,2,3,4};
        try{
            System.out.print("Element"+arr[6]);
           }
       catch(Exception ex)
       {
        System.out.println("Error= "+ex.getMessage());
       }
       finally
       {
        System.out.println("End Of Program");
       }
    }
    
}
