import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("Avjeet");
        list.add("Kumar");
        Iterator itr=list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
