package inheritance;
public class multilevelInher {
    public static void main(String[] args) {
        Dog benchy =new Dog();
        benchy.eat();
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
  class Mammal extends Animal{    // Derived class or subclass // superclass of Dog class:Mammal
     int legs; 
  }
  class Dog extends Mammal{
    String breed;
  }
  
