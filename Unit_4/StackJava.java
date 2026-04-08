import java.util.*;
public class StackJava{
    public static void main(String args[]){
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(7);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}