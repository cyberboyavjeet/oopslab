import java.util.*;
public class Stream_API4 {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(2,6,7,3,9,4,9,3);
        list.stream().map(n->n*n).sorted().
        forEach(System.out::println);

    }
}
