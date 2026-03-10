import java.util.*;
class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numer at which you want fibonacci series: ");
        int x=sc.nextInt();
        if(x==0)
            System.out.println("fib: "+x);
        

       for(int i=1;i<=x;i++)
        System.out.println("Fib: "+fib(i));

    }

    private static int fib(int n){

        if(n==1||n==2){
            return 1;
        }
      // int x=fib(n-1)+fib(n-2);
        return fib(n-1)+fib(n-2);
        
    }
    sc.close();
}