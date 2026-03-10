interface first
{
    void display();
}
interface second
    {
         void next();
    
    }
class DerivedClass implements first,second
{
    public void display()
    {
        System.out.println("This Is the Output method of interface");

    }
    public void next()
   {
        System.out.println("This is Second interface");
   }
}
class UseofInterface
{
    static void main(String [] arg)
    {
        DerivedClass dc= new DerivedClass();
        dc.display();
        dc.next();
    }
}