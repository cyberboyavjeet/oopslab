import java.util.*;
public class Steam_API {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(11,2,3,41,5,16,7,8,9,10);
        list.stream().filter(n->n>=10).map(n->n*2).
        forEach(System.out::println);
    }
    
}
