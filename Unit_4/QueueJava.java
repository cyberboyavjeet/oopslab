import java.util.*;
public class QueueJava {
    public static void main(String[] args) {
    PriorityQueue<String>queue=new PriorityQueue<>();
    queue.add("Avjeet");
    queue.add("Gaurav");
    queue.add("Ashsish");
    System.out.println("Head: "+queue.element());
    System.out.println("Head: "+queue.peek());
    System.out.println("Iterating the Queue elements: ");
    Iterator itr=queue.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    queue.remove();
    queue.poll();
    System.out.println("Aftert the Removing two Elements: ");
    Iterator itr2=queue.iterator();
    while(itr2.hasNext()){
        System.out.println(itr2.next());
    }

    }
}
