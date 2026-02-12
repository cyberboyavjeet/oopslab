class Animal
{
    void eat()
    {
        System.out.println("Eating.....");
    }
}
    class Dog extends Animal
    {
        void bark()
            {
                System.out.println("Barking....");
            }
        
    }
class Singleinheritance
{
    static void main(String [] arg)
    {      
        Dog obj= new Dog();
        obj.eat();
        obj.bark();

    }
}