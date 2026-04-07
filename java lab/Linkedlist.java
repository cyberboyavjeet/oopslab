import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String>student=new LinkedList<>();
        student.add("Gaurav");
        student.add("Kumar");
        student.add("Bind");
        System.out.println(student);
        //addFirst method
        student.addFirst("Name:");
        System.out.println(student);
    }
    
}
