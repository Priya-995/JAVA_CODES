
public class Abstract_class {
    public static void main(String[] args) {
        Chicken c= new Chicken();
        System.out.println(c.color); // bydefault it prints brown color : Animal color until changeColor is not called.
        // Horse h= new Horse();
        // h.legs();
        // Foal f= new Foal();
        // f.color();
    }
}
abstract class Animal{ // we cannot create object
    String color;
    Animal(){   //constructor
        color="brown";
        System.out.println("Animal called");
    }
    void eats(){
        System.out.println("animal eats");
    }
    abstract void legs();  // declared without implementation

}
class Chicken extends Animal{ // first Animal constructor called
    void changeColor(){
        color="red";
    }
    void legs(){
        System.out.println("Having two legs");
    }

}
class Horse extends Animal{  // first: Animal constructor called
    
    Horse(){  //second : horse constructor called
        System.out.println("Horse called");
    }
    void legs(){
        System.out.println("Having 4 legs");
    }
}
class Foal extends Horse{ // first: Animal constructor called //second : horse constructor called
   Foal(){  //third: foal constructor called
        System.out.println("Foal called");
    }
    void color(){
        System.out.println("brown color");
    }
}