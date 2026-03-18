import java.util.*;
public class Decode_Java{
public static void main(String arg[]){
    String encodeValue=arg[0];
    byte[] decodebyte=Base64.getDecoder().decode(encodeValue);
    String str= new String (decodebyte);
    System.out.println("Decoded value: "+str);
    
    }
}