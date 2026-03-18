import  java.util.*;
public class Steam_API5{
    public static void main(String arg[]){
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        int max=list.stream().max(Integer::compare).get();
        System.out.println("Max Value: "+max);
    }
}