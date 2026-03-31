import java.util.*;
public class StudentAge {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        System.out.println("Enter the Number of Students:  ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;++i){
            System.out.println("Enter the Student"+(i+1) +" " +"age:");
            int b=sc.nextInt();
            list.add(b);
        }
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println("Ages: "+itr.next());
        }
    }
}
