import java.util.*;
public class For_Each {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(10,20,30,40,50);

        //Treadingtion method
        for(int i:num)
            System.out.println(i);

        //Using For Each Method
        System.out.println("......USing For Each Method.....");
        num.forEach(n->System.err.println(n));
    }
    
}
