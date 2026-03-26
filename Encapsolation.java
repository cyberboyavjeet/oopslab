import java.util.Scanner;

class Triangle{
    private int length;
    private int heigth;
    void setData(int l, int h){
        length=l;
        heigth=h;}
    float area(){
        return (length*heigth)/2;
    }
    
}
public class Encapsolation {
    public static void main(String arg[]){
        Triangle tr=new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Triangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the Heigth of the Triangle: ");
        int h=sc.nextInt();
        tr.setData(l, h);
        System.out.println("Area: "+tr.area());
    }
    
}
