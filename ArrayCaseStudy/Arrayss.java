import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the No of Students: ");
    int n=sc.nextInt();
    int  []student=new int[n];
    float avg=0;
    for (int i=0;i<n;i++){
        System.out.println("Enter the Student"+(i+1) +"Marks");
        int marks=sc.nextInt();
        student[i]=marks;
        avg +=marks;

    }
    Arrays.sort(student);
    int highest=student[n-1];
    int lowest=student[0];
    System.out.println("Highest marks: "+highest);
    System.out.println("Lowest marks: "+lowest);
    System.out.println("Average marks: "+(avg/n));
  }  
}
