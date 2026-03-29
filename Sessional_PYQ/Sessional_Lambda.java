@FunctionalInterface
interface Arithmetic{
    int operation(int a, int b);
}
public class Sessional_Lambda{
public static void main(String[] args) {
    Arithmetic ar=(i,j)->{return i*j;};
    System.out.println("Multiplication: "+ar.operation(5, 6));
    Arithmetic ar2=(i,j)->{return i+j;};
    System.out.println("Addition: "+ar2.operation(5, 6)); 
}}