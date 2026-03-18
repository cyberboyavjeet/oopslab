import java.util.*;
public class Stream_API2{
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(20,1,5,7,4,7,3);
        list.stream().sorted().forEach(System.out::println);
    }
}