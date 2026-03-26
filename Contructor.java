import java.util.Scanner;

class Max{
    private int a;
    private int b;
    private int c;
    Max(int a, int b, int c ){
        this.a=a;
        this.b=b;
        this.c=c;

    }
     int max_Value(){
        if (a>b){
            if(a>c)
                return a;
            return c;
        }
        else if(b>c)
            return b;
        else return c;
     }
}
public class Contructor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for(;;){
        System.out.println("Enter the First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2=sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3=sc.nextInt();
        Max mx=new Max(num1, num2, num3);
        System.out.println("MAx value: "+mx.max_Value());
    }}
    
}
