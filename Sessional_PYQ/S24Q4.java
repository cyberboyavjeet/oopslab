/*Inheritance in java  */


//1) Single level Inheritance
class Avjeet{
     void display(){
    System.out.println("this is Avjeet!!...");
     }
} 
class avjeet_heart extends Avjeet{
    void display2(){
        System.out.println("This is AVjeet Hearth Class");
    }
}

//Multilever Inheritance
class avjeet_Imagination extends avjeet_heart{
    void display3(){
        System.out.println("This is Avjeet Imagination class ");
    }
}


//heirarichal Inheritance
class Avjeet_Love extends Avjeet{
    void display4(){
        System.out.println("This AVjeet Love:??????");
    }
}
public class S24Q4{
    public static void main(String arg[]){
        avjeet_heart hr=new avjeet_heart();//Single level
        hr.display();
        hr.display2();
        avjeet_Imagination im=new avjeet_Imagination();//Multilevel
        im.display();
        im.display2();
        im.display3();
        Avjeet_Love lv=new Avjeet_Love();
        lv.display();
        lv.display4();

    }
}