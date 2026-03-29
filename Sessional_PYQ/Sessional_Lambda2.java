@FunctionalInterface
interface Arithmetic{
    void operation(int a, int b);
}
public class Sessional_Lambda2{
public static void main(String[] args) {
    Arithmetic ar=(i,j)->{System.out.println("Additoin: "+(i+j));
        System.out.println("Multiplication: "+(i*j));};
        ar.operation(5, 6);}}
    