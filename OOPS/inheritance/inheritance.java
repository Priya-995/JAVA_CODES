package inheritance;
// this code is also an example of single level inheritance
// single  base class  => one derived class
public class inheritance{  // inheritance : increases reusability
  public static void main(String[] args) {
    Fish shark =new Fish();
    shark.eat();
    
      
  }
}
class Animal{   // Base class or parent-class
  String color;
  void eat(){
    System.out.println("eates");
  }
  void breathe(){
    System.out.println("breathes");
  }
}
class Fish extends Animal{    // Derived class or subclass
   int fins; 
}
