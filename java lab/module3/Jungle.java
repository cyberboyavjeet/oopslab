class Animal
{
    public String animal_Name;
    
    public void setAnimalName(String animal_Name){
        this.animal_Name=animal_Name;
    }
    public void makeSound()
    {
        System.out.println(animal_Name+ " Sound: hUki huaaaaa.....");
    }

}
class Dog extends Animal
{
    public void makeSound(){
        System.out.println("Extended Override Sound: Bark Bark.......");
    }
}
public class Jungle {
    
    public static void main(String[] args) {
      Dog an=new Dog();
      an.setAnimalName("Tommy");
      an.makeSound();
      System.out.println("Dogs Names: "+an.animal_Name);  
    }
    
}
