interface A{
      void Display();
}
interface B{
    void Display2();
}
class C implements A,B{
    void Display3(){
        System.out.println("hello");
    }
    public void Display(){
        System.out.println("Hello A");
    }
    public void Display2(){
        System.out.println("Hello B");
    }
}
public class Multiple {
    public static void main(String[] args) {
        
    
    C ob=new C();
    ob.Display3();
    ob.Display();
    ob.Display2();
}
}
