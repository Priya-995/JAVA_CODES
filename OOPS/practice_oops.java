public class practice_oops {
    public static void main(String[] args) {
        // Creating an object of Car but referring it using Vehicle reference (Upcasting)
        Vehicle obj1 = new Car();
        obj1.print(); // Calls the overridden method in Car (Dynamic Method Dispatch)

        // Creating an object of Vehicle
        Vehicle obj2 = new Vehicle();
        obj2.print(); // Calls the method in Vehicle
    }
}

// Parent class (Superclass)
class Vehicle {
    
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

// Child class (Subclass) that extends Vehicle
class Car extends Vehicle {
    // Overriding the print() method from Vehicle class
    void print() {
        System.out.println("Derived class (Car)");
    }
}
