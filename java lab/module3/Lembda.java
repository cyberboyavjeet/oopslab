import java.util.*;
interface MaxData{
    int Max(int a, int b);
}
public class Lembda{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(;;){
        System.out.println("Enter ther first Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b=sc.nextInt();
        Max mx = (i,j)->{
            if (i>j)
                return i;
            else return j;
        };
        System.out.println("Max: "+mx.MaxData(b, a));
    }}
}
