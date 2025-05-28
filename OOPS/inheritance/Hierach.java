package inheritance;
public class Hierach {
    public static void main(String[] args) {
        Dog benchy =new Dog();
        benchy.eat();
        Fish shark = new Fish();
        shark.breathe();
      }
}
class Animal{   // Base class or parent-class or superclass
    String color;
    void eat(){
      System.out.println("eates");
    }
    void breathe(){
      System.out.println("breathes");
    }
  }
  class Fish extends Animal{    // Derived class or subclass // superclass of Dog class:Mammal
     int legs; 
  }
  class Dog extends Animal{
    String breed;
  }
  

