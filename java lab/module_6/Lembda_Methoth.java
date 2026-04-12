import java.util.*;
import java.util.function.*;
public class Lembda_Methoth {
    static void printMsg(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        // Lambda Expression
        Runnable r = () -> System.out.println("Lambda running!");
        r.run();
        // Lambda with parameter
        Consumer<String> c = s -> System.out.println("Hello, " + s);
        c.accept("Java");
        // Method Reference
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        list.forEach(Main::printMsg);
    }
}
