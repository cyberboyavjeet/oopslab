class Base{
    public void display(){
        System.out.println("Base Class");

    }
}
class Derived extends Base{
    
    public void display(String a){
        System.out.println("Derived class :"+a);
    }

}
public class Annotation_Override{
    public static void main(String arg[]){
        Derived obj=new Derived();
        obj.display(arg[0]);
    }
}