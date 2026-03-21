/* Brhaviour of final and static final */
public class S24Q1 {
    static final int b=2;
    public static void main(String[] args) {
        final int a=2;
        
     
           // a++;  causes error
           //  b++; cause error
        
    System.out.println("a= "+a);
    System.out.println("b="+b);
    }
    
}
