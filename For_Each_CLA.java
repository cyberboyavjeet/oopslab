import java.util.*;
public class For_Each_CLA {
    public static void main(String[] args) {
        List<String>a=new ArrayList<>();
        for(int i=0;i<args.length;i++){
            a.add(args[i]);
        }
        a.forEach(n->System.out.println(n));

    }
    
}
