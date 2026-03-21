/*Demontration of Constructor in java */
class Student{
    private int roll_number;
    private String name;
    private String branch;
    private String email;
    private String course;
    Student(){
        roll_number=2;
        name="Avjeet";
        branch="CSE";
        email="avjeetsingh@gmail.com";
        course="B.Tech";
    } 
    Student(Student ob)
    {
        roll_number=ob.roll_number;
        name=ob.name;
        branch=ob.branch;
        email=ob.email;
        course=ob.course;
    }
    Student(int roll_number, String name, String branch, String email , String course){
        this.roll_number=roll_number;
        this.name=name;
        this.branch=branch;
        this.email=email;
        this.course=course;
    }
     void Display(){
        System.out.println("Name: "+name);
        System.out.println("Roll_Number: "+roll_number);
        System.out.println("Branch: "+branch);
        System.out.println("Email id: "+email);
        System.out.println("Course: "+course);
        System.out.println("---------------------------------");

    }

}
public class S24Q2 {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student(st1);
        Student st3=new Student(07,"Arti","CSE","arti@gmsil.com","B.Tech");
        st1.Display();
        st2.Display();
        st3.Display();
    }
}
