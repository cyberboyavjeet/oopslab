class Exam
{
    int id;
    String name;
    Exam()
    {
        id=101;
        name="Avjeet";
        System.out.println("id="+id);
        System.out.println("NAme="+name);


    }//copy Constructor
    Exam(int i, String name)
    {
        id=1;
        this.name=name;
        System.out.println("id="+id);
        System.out.println("Name="+name);
    }
    Exam(Exam obj)
    {
        this.id=obj.id;
        this.name=obj.name;
        System.out.println("Id="+id);
        System.out.println("Name="+name);

    }

    
}
class UseofConstructor3
{
    public static void main(String [] arg)
    {
        Exam obj = new Exam();
        Exam obj2 =new Exam(101, "Arti");
        Exam obj3= new Exam(obj2);
    }

}