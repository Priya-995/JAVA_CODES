// SuperKeyword.java
public class SuperKeyword {
    public static void main(String[] args) {
        // Creating an object of Horse class
        Horse h = new Horse();  
        
        // Printing the color of Horse (inherited from Animal)
        System.out.println(h.color);  // Output: brown
    }
}

// Parent class (Super class)
class Animal {
    String color;  // Instance variable

    // Constructor of Animal class
    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class (Subclass) extending Animal
class Horse extends Animal {
    // Constructor of Horse class
    Horse() {
        
        super();  // Calls the constructor of Animal (superclass)
        super.color="brown";  // u can do it directly like this without calling super first (super())
        System.out.println("Horse constructor called");
    }
}
