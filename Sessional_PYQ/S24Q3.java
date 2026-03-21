/*Method Overriding */
class Shape{
     void displayArea(){
        System.out.println("Area not definied:");
     }

}
class Rectangle extends Shape{
    private int length;
    private int breath;

    Rectangle(int length, int breath){
        this.length=length;
        this.breath=breath;
    }
    @Override
    void displayArea(){
        double Result;
        Result=length*breath;
        System.out.println("Rectangle Area: "+Result);

    }
}
public class S24Q3{
    public static void main(String arg[]){
        Shape a=new Rectangle(3,5);
        a.displayArea();
    }
}