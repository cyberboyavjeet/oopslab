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


    }//Copy Constructor
    Exam(int i, String name)
    {
        id=1;
        this.name=name;
        System.out.println("id="+id);
        System.out.println("Name="+name);
    }

    
}
class UseofConstructor2
{
    public static void main(String [] arg)
    {
        Exam obj = new Exam();
        Exam obj2 =new Exam(101, "Arti");
    }

}