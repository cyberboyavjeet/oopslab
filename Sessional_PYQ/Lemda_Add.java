@FunctionalInterface
interface Sum{
    int add(int a, int b , int c);
}
public class Lemda_Add{
    public static void main(String arg[]){
        int num1=Integer.parseInt(arg[0]);
        int num2=Integer.parseInt(arg[1]);
        int num3=Integer.parseInt(arg[2]);
        Sum sm=(a,b,c)->a+b+c;
        System.out.println("Result: "+sm.add(num1, num2, num3));
        

    }
}