abstract class Animal{
     private String name;
    Animal(String name){//Constructor for setting the name of Animal
        this.name=name;
    }
    void eat(){//Abstraction can have a normal Method
        System.out.println(name+" is Eating");
    }
    abstract void bark();//must be and Abstract class of any return type
}
class Lion extends Animal{
    Lion(String name){//Constructor for setting the name of Animal
        super(name);
    }
    public void bark(){//Deffinition of Abstract class in extended class
        System.out.println("Lion is roaring.....");
    }
}
public class Abtraction_ {
    public static void main(String[] args) {
        Lion ln=new Lion("The King");
        ln.eat();
        ln.bark();
    }
}
