import java.util.*;
public class Steam_API3 {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().filter(n->n%2==0).
        sorted().forEach(System.out::println);
    }
}
