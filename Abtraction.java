abstract class Shape
    {
        abstract void display();
    }
class Cicle extends Shape
    {
        void display()
        {
            System.out.println("It has round Shape");
        }
    }
class Triangle extends Shape
    {
        void display()
        {
            System.out.println("It has 3 sides");
    }
    }
class Rectangle extends Shape
    {
        void display()
            {
                System.out.println("It has 4 sides");
            }
        
    }
class Abtraction
{
    static void main(String [] arg)
    {
        Shape obj=new Cicle();
        obj.display();
    }
}


