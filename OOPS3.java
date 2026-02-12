class StudentInfo
{
    int id;
    String name;
    String course;
    void setInfo()
    {
        id=101;
        name="Avjeet";
        course="Btech";
    }
    void getInfo()
    {
        System.out.println("id="+id);
        System.out.println("Name="+name);
        System.out.println("Course="+course);

    }
}
class OOPS3
{
    public static void main(String [] arg)
    {
        StudentInfo obj= new StudentInfo();
        obj.setInfo();
        obj.getInfo();
    }
}