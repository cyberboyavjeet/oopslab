import java.util.*;
public class YieldApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        String result=switch(num%2){
            case 0:{
                System.out.println("Number is Even");
                int square=num*num;
                yield "Square is "+square;
                }
            default:{
                System.out.println("Number is Odd");
                int square=num*num*num;
                yield "Cube is "+square;
            }

        };
        System.out.println(result);
      }
    
}
