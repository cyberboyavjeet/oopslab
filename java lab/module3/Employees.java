class Employee
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    Employee(int empID, String empName, String empDesignation){
        this.empID=empID;
        this.empName=empName;
        this.empDesignation=empDesignation;

    }
    public int getEmpID(){
        return empID;
    }
    public String getEmpName(){
        return empName;
    }
    public String getEmpDesignation(){
        return empDesignation;
    }
    
}
public class Employees
{
    public static void main(String [] arg){
        Employee em=new Employee(1,"Avjeet","CyberSecurity");
        System.out.println("Employee id: "+em.getEmpID());
        System.out.println("Employee Name: "+em.getEmpName());
        System.out.println("Employee Desgination: "+em.getEmpDesignation());
        
    }
}