@FunctionalInterface
interface Max{
    int MaxData(int b,int a);
}
public class Functional_int_Max{
    public static void main(String[] args) {
        
    
    Max mx=(i,j)->{
        if(i>j)return i;
        else return j;};
    System.out.println("MAx is: "+mx.MaxData(Integer.parseInt(args[0]),Integer.parseInt(args[1])));

}}