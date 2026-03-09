 abstract class ABC
{
    abstract void display();
     void output()
    {
        System.out.println("Output");
    }
}
    public class Abtraction2 extends ABC
    {
        @Override
        void display()
        {
            System.out.println("This is Output class");
        }
        public static void main(String [] arg)
        {
            ABC obj=new Abtraction2();
            obj.output();
            obj.display();
        }
    }