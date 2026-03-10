public class TryCatch
{
    static void main(String [] arg)
    {
        int arr[]={1,2,3,4,5};
        try{
            System.out.println("Array element= "+arr[7]);
        }catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Error= "+ex.getMessage());
        }
        System.out.println("End of program");
    }
}