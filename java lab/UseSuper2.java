class A
{
    A()
    {
        System.out.println("This is class A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("This is Class B");
    }
}
class C extends B
{
    C()
    {
        System.out.println("Thiss is Class C");
    }
}
class UseSuper2
{
    static void main(String[] arg)
    {
        C c = new C();
    }
}