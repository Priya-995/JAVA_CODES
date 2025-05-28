package Encapsulation;

public class obj_Class {
    public static void main(String[] args) {
        Pen pen1 = new Pen();   // pen1 is an object
        pen1.color="blue";
        pen1.type="ball";
        pen1.write();
        pen1.printColor();
    }    
}
class Pen{
    String color;       //properties
    String type;
    public void write(){   //method
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}