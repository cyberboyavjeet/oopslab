@FunctionalInterface
interface Message{
    void getMessage();
}
public class Functional_int_Mess{
    public static void main(String arg[]){
        Message msg=()->System.out.println(".....Wlecome....");
        msg.getMessage();
    }
}