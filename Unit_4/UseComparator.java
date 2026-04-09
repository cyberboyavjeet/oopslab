import java.util.*;
class StudentInfo{
    int id;
    String name;
    int age;
    StudentInfo(int id, String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
class SortByAge implements Comparator<StudentInfo>{
    @Override
    public int compare(StudentInfo s1, StudentInfo s2){
        return s1.age-s2.age;
    }
}
class SortByName implements Comparator<StudentInfo>{
    @Override
    public int compare(StudentInfo s1, StudentInfo s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortById implements Comparator<StudentInfo>{
    @Override
    public int compare(StudentInfo s1, StudentInfo s2){
        return s1.id-s2.id;
    }
}
public class UseComparator {
    public static void main(String[] args) {
        ArrayList<StudentInfo>list=new ArrayList<>();
        list.add(new StudentInfo(101,"Avjeet",21));
        list.add(new StudentInfo(102,"Gaurav",20));
        list.add(new StudentInfo(103,"Athrav",23));
        list.add(new StudentInfo(104,"Ashish",19));
        list.add(new StudentInfo(105,"Shashi",19));
        System.out.println("ID\tNAME\tAGE");
        for(StudentInfo e:list){
            System.out.println(e.id+"\t"+e.name+"\t"+e.age);
        }
        Collections.sort(list,new SortByAge());
        System.out.println("                                    ");
        System.out.println(".......Sort By age.......");
        System.out.println("ID\tNAME\tAGE");
        for(StudentInfo e:list){
            System.out.println(e.id+"\t"+e.name+"\t"+e.age);
        }
        Collections.sort(list,new SortByName());
        System.out.println("                              ");
        System.out.println("Sort By NAme");
        System.out.println("ID\tNAME\tAGE");
        for(StudentInfo e:list){
            System.out.println(e.id+"\t"+e.name+"\t"+e.age);
        }
        Collections.sort(list,new SortById());
        System.out.println("                         ");
        System.out.println("Sort By Id");
        System.out.println("ID\tNAME\tAGE");
        for(StudentInfo e:list){
            System.out.println(e.id+"\t"+e.name+"\t"+e.age);
        }

    }
    
}
