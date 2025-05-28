// Demonstrating Method Access Rules in Java
public class Practice2 {
    public static void main(String[] args) {
        // Creating an object of Car but referring it using Vehicle reference (Upcasting)
        Vehicle obj1 = new Car();
        
        // Attempting to call print1() using Vehicle reference
        // This will cause a COMPILATION ERROR because Vehicle class doesn't have print1() method
        obj1.print1(); // ❌ ERROR

        // Creating an object of Vehicle
        Vehicle obj2 = new Vehicle();
        obj2.print(); // ✅ Calls the print() method in Vehicle
    }
}


// Parent class (Superclass)
class Vehicle {
    // Method defined in the parent class
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

// Child class (Subclass) that extends Vehicle
class Car extends Vehicle {
    // New method in the child class (not overriding)
    void print1() {
        System.out.println("Derived class (Car)");
    }
}