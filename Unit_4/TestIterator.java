import java.util.*;
class TestIterator{
    public static void main(String arg[]){
        Collection<String>list=new ArrayList<>();
        list.add("Avjeet");
        list.add("Kumar");
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            System.out.println(" ");
        }
    }
}