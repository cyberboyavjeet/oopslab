    class Vehicle
        {
            void run()
            {
                System.out.println("Running....");
            }
        }
    class Car
        {
            void run()
                {
                    System.out.println("Running fast.....");
                }
        }
    class Bycycle extends Vehicle
        {
            void run()
            {
                System.out.println("Runnimg very slow");
            }
            
        }
    class Bike extends Vehicle
        {
            void run()
            {
                System.out.println("Runnig too fast.....");
            }
        }
class MethodOverriding
{
    static void main(String [] arg)
    {
        Car car= new Car();
        car.run();

        Vehicle vehicle= new Bycycle();
        vehicle.run();
    }
}