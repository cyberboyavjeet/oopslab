class Employee
{
    void salary()
    {
        System.out.print("This is salary class");
    }
    void position()
    {
        System.out.print("this is position class");
    }
}
class OOPS2
{public static void main(String[] arg)
{
    Employee obj= new Employee();
    obj.salary();
    obj.position();
}}