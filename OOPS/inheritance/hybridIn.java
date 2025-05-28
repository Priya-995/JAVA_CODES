//  It mixes "Single Inheritance" (Car extends Vehicle) and "Multiple Inheritance" (Car implements Engine) → That's hybrid!
public class hybridIn {
    public static void main(String[] args) {
        Car p = new Car();
        p.start();  // Calls start() from Engine
        p.move();   // Calls move() from Vehicle

    }   
}
interface Engine{
  void start();
}
class Vehicle{   // Base class or parent-class or superclass
    void move(){
        System.out.println("Vehicle is moving...");
    }
}
class Car extends Vehicle implements Engine{
   public void start(){
    System.out.println(" Car engine starts");
   }
}

