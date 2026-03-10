class demo
{
    void display()
    {
        System.out.println("This is Display method");

    }

}
class DerivedClass extends demo
{
    void display()
    {
        System.out.println("This is Display of Derived class");
    }
    void next()
    {
        display();
        super.display();
    }
}
class UseSuper
{
    static void main(String [] arg)
    {
        DerivedClass obj= new DerivedClass();
        obj.next();
    }
}