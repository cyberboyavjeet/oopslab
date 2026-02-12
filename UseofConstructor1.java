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


    }

    
}
class UseofConstructor1
{
    public static void main(String [] arg)
    {
        Exam obj = new Exam();
    }

}