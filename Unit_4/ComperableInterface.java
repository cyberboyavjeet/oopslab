import java.util.*;
class Employee{
     int id;
     int salary;
     String name;
    Employee(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class ComperableInterface {
    public static void main(String args[]){
        ArrayList<Employee>emplist=new ArrayList<>();
        emplist.add(new Employee(101,"Avjeet",50000));
        emplist.add(new Employee(102,"Gaurav",45000));
        emplist.add(new Employee(103,"Ashish",60000));
        emplist.add(new Employee(103, "Aru", 65000));
        emplist.add(new Employee(105, "Ayush", 45340));
        System.out.println("ID\tName\tSalary");
        for(Employee e:emplist){
            System.out.println(e.id+"\t"+e.name +"\t"+e.salary);
        }

    }
    
}
