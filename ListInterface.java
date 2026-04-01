import java.util.*;
public class ListInterface{
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Avjeet");
        list.add(" ");
        list.add("Kumar");
          
        //iterator Is not required in it
        for (String Inro:list)
            System.out.println(Inro);
    }
}