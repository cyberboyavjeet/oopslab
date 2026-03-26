import java.util.*;
public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("Enter your choice!");
            
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Hello case 1");
                break;
                case 2: System.out.println("Hello case 2");
                break;
                default:System.out.println("Invakid choice");
            }
        }
    }
}