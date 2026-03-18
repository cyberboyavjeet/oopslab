import java.util.*;
public class Encode_Java{
    public static void main(String arg[]){
        String origin=arg[0];
        String Encoded=Base64.getEncoder().encodeToString(origin.getBytes());
        System.out.println("Origin String: "+origin);
        System.out.println("Encoded String: "+Encoded);
    }
}