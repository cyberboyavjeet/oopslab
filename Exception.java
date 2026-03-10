public class Exception {
    public static void main(String[] arg)
    {
        int a=10;
        int b=0;
        try
        {
       int c=a/b;
       System.out.print(c);
    }
    catch(ArithmeticException ex){
                System.out.println("Error= "+ex.getMessage());
       }
        
        System.out.println("Sorry babu!!");
    }
    
}
