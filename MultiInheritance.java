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
    class Dogbaby extends Dog
    {
        void min()
            {
                System.out.println("Mining");

            }
    }
class MultiInheritance
{
    static void main(String [] arg)
    {      
        Dogbaby obj= new Dogbaby();
        obj.eat();
        obj.bark();
        obj.min();

    }
}